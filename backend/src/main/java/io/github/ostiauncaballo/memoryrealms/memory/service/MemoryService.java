package io.github.ostiauncaballo.memoryrealms.memory.service;

import io.github.ostiauncaballo.memoryrealms.memory.exception.MemoryNotFoundException;
import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import io.github.ostiauncaballo.memoryrealms.memory.repository.MemoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryService {

    private final MemoryRepository memoryRepository;

    public MemoryService(MemoryRepository memoryRepository) {
        this.memoryRepository = memoryRepository;
    }

    public List<Memory> getAllMemories() {
        return memoryRepository.findAll();
    }

    public Memory getMemoryById(Long id) {
        return memoryRepository.findById(id)
                .orElseThrow(() -> new MemoryNotFoundException(id));
    }
}
