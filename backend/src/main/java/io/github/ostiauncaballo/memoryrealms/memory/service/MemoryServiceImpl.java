package io.github.ostiauncaballo.memoryrealms.memory.service;

import io.github.ostiauncaballo.memoryrealms.memory.exception.MemoryNotFoundException;
import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import io.github.ostiauncaballo.memoryrealms.memory.repository.MemoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryServiceImpl implements MemoryService {

    private final MemoryRepository memoryRepository;

    public MemoryServiceImpl(MemoryRepository memoryRepository) {
        this.memoryRepository = memoryRepository;
    }

    @Override
    public List<Memory> getAllMemories() {
        return memoryRepository.findAll();
    }

    @Override
    public Memory getMemoryById(Long id) {
        return memoryRepository.findById(id)
                .orElseThrow(() -> new MemoryNotFoundException(id));
    }
}
