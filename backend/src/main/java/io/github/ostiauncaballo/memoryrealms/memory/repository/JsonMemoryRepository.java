package io.github.ostiauncaballo.memoryrealms.memory.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
public class JsonMemoryRepository implements MemoryRepository {

    private final Map<Long, Memory> memoriesById;

    public JsonMemoryRepository(ObjectMapper objectMapper) {
        this.memoriesById = loadMemories(objectMapper);
    }

    private Map<Long, Memory> loadMemories(ObjectMapper objectMapper) {
        try {
            ClassPathResource resource = new ClassPathResource("data/memories.json");
            try (InputStream inputStream = resource.getInputStream()) {
                List<Memory> memories = objectMapper.readValue(inputStream, new TypeReference<List<Memory>>() {});
                return memories.stream()
                        .collect(Collectors.toMap(Memory::id, Function.identity()));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load memories from JSON resource", e);
        }
    }

    @Override
    public List<Memory> findAll() {
        return List.copyOf(memoriesById.values());
    }

    @Override
    public Optional<Memory> findById(Long id) {
        return Optional.ofNullable(memoriesById.get(id));
    }
}
