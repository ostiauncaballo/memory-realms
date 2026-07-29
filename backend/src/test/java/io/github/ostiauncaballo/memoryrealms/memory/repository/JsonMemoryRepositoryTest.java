package io.github.ostiauncaballo.memoryrealms.memory.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonMemoryRepositoryTest {

    private JsonMemoryRepository repository;

    @BeforeEach
    void setUp() {
        repository = new JsonMemoryRepository(new ObjectMapper());
    }

    @Test
    void shouldLoadJsonResourceSuccessfully() {
        List<Memory> memories = repository.findAll();

        assertNotNull(memories);
        assertFalse(memories.isEmpty());
    }

    @Test
    void shouldReturnDeserializedMemoryWhenIdExists() {
        Memory memory = repository.findById(1L).orElseThrow();

        assertEquals(1L, memory.id());
        assertEquals("The Lost Temple of Chotec", memory.title());
    }

    @Test
    void shouldReturnEmptyWhenIdDoesNotExist() {
        Optional<Memory> memory = repository.findById(999L);

        assertFalse(memory.isPresent());
    }
}
