package io.github.ostiauncaballo.memoryrealms.memory.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class JsonMemoryRepositoryTest {

    private JsonMemoryRepository repository;

    @BeforeEach
    void setUp() {
        repository = new JsonMemoryRepository(new ObjectMapper());
    }

    @Test
    void findAll_shouldReturnAllMemories() {
        List<Memory> memories = repository.findAll();
        
        assertNotNull(memories);
        assertEquals(5, memories.size());
    }

    @Test
    void findAll_shouldReturnUnmodifiableList() {
        List<Memory> memories = repository.findAll();
        
        assertThrows(UnsupportedOperationException.class, () -> memories.add(new Memory(
                6L, "Test", "Test", "Test", null, "test.jpg", 0, 0, 0.0
        )));
    }

    @Test
    void findById_withExistingId_shouldReturnMemory() {
        Optional<Memory> memory = repository.findById(1L);
        
        assertTrue(memory.isPresent());
        assertEquals(1L, memory.get().id());
        assertEquals("The Lost Temple of Chotec", memory.get().title());
    }

    @Test
    void findById_withNonExistingId_shouldReturnEmpty() {
        Optional<Memory> memory = repository.findById(999L);
        
        assertFalse(memory.isPresent());
    }

    @Test
    void findById_withNullId_shouldReturnEmpty() {
        Optional<Memory> memory = repository.findById(null);
        
        assertFalse(memory.isPresent());
    }
}
