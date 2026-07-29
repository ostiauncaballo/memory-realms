package io.github.ostiauncaballo.memoryrealms.memory.service;

import io.github.ostiauncaballo.memoryrealms.memory.exception.MemoryNotFoundException;
import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import io.github.ostiauncaballo.memoryrealms.memory.repository.MemoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MemoryServiceTest {

    @Mock
    private MemoryRepository memoryRepository;

    private MemoryService memoryService;

    @BeforeEach
    void setUp() {
        memoryService = new MemoryService(memoryRepository);
    }

    @Test
    void shouldReturnAllMemoriesWhenRequested() {
        List<Memory> expectedMemories = List.of(
                new Memory(1L, "Test", "Test", "Test", null, "test.jpg", 0, 0, 0.0)
        );
        when(memoryRepository.findAll()).thenReturn(expectedMemories);

        List<Memory> result = memoryService.getAllMemories();

        assertEquals(expectedMemories, result);
        verify(memoryRepository).findAll();
    }

    @Test
    void shouldReturnMemoryWhenIdExists() {
        Memory expectedMemory = new Memory(1L, "Test", "Test", "Test", null, "test.jpg", 0, 0, 0.0);
        when(memoryRepository.findById(1L)).thenReturn(Optional.of(expectedMemory));

        Memory result = memoryService.getMemoryById(1L);

        assertEquals(expectedMemory, result);
        verify(memoryRepository).findById(1L);
    }

    @Test
    void shouldThrowExceptionWhenIdDoesNotExist() {
        when(memoryRepository.findById(999L)).thenReturn(Optional.empty());

        MemoryNotFoundException exception = assertThrows(
                MemoryNotFoundException.class,
                () -> memoryService.getMemoryById(999L)
        );

        assertEquals("Memory not found with id: 999", exception.getMessage());
        verify(memoryRepository).findById(999L);
    }
}
