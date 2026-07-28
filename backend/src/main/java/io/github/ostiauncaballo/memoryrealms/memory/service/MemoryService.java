package io.github.ostiauncaballo.memoryrealms.memory.service;

import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;

import java.util.List;
import java.util.Optional;

public interface MemoryService {

    List<Memory> getAllMemories();

    Memory getMemoryById(Long id);
}
