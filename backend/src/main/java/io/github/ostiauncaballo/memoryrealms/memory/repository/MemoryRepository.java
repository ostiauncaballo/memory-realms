package io.github.ostiauncaballo.memoryrealms.memory.repository;

import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;

import java.util.List;
import java.util.Optional;

public interface MemoryRepository {

    List<Memory> findAll();

    Optional<Memory> findById(Long id);
}
