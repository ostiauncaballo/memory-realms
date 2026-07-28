package io.github.ostiauncaballo.memoryrealms.memory.controller;

import io.github.ostiauncaballo.memoryrealms.memory.exception.GlobalExceptionHandler;
import io.github.ostiauncaballo.memoryrealms.memory.exception.MemoryNotFoundException;
import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import io.github.ostiauncaballo.memoryrealms.memory.service.MemoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class MemoryControllerTest {

    private MockMvc mockMvc;

    @Mock
    private MemoryService memoryService;

    @InjectMocks
    private MemoryController memoryController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(memoryController)
                .setControllerAdvice(new GlobalExceptionHandler())
                .build();
    }

    @Test
    void getAllMemories_shouldReturn200AndJsonArray() throws Exception {
        List<Memory> memories = List.of(
                new Memory(1L, "The Lost Temple of Chotec", "Role-playing",
                        "Our party faced ancient traps and forgotten guardians.",
                        null, "/images/lost-temple.jpg", 12, 28, 4.8)
        );
        when(memoryService.getAllMemories()).thenReturn(memories);

        mockMvc.perform(get("/api/memories"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].title").value("The Lost Temple of Chotec"))
                .andExpect(jsonPath("$[0].universe").value("Role-playing"))
                .andExpect(jsonPath("$[0].description").value("Our party faced ancient traps and forgotten guardians."))
                .andExpect(jsonPath("$[0].image").value("/images/lost-temple.jpg"))
                .andExpect(jsonPath("$[0].comments").value(12))
                .andExpect(jsonPath("$[0].likes").value(28))
                .andExpect(jsonPath("$[0].rating").value(4.8));
    }

    @Test
    void getAllMemories_whenEmpty_shouldReturn200AndEmptyArray() throws Exception {
        when(memoryService.getAllMemories()).thenReturn(List.of());

        mockMvc.perform(get("/api/memories"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$").isEmpty());
    }

    @Test
    void getMemoryById_withExistingId_shouldReturn200AndMemory() throws Exception {
        Memory memory = new Memory(1L, "The Lost Temple of Chotec", "Role-playing",
                "Our party faced ancient traps and forgotten guardians.",
                null, "/images/lost-temple.jpg", 12, 28, 4.8);
        when(memoryService.getMemoryById(1L)).thenReturn(memory);

        mockMvc.perform(get("/api/memories/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("The Lost Temple of Chotec"))
                .andExpect(jsonPath("$.universe").value("Role-playing"))
                .andExpect(jsonPath("$.description").value("Our party faced ancient traps and forgotten guardians."))
                .andExpect(jsonPath("$.image").value("/images/lost-temple.jpg"))
                .andExpect(jsonPath("$.comments").value(12))
                .andExpect(jsonPath("$.likes").value(28))
                .andExpect(jsonPath("$.rating").value(4.8));
    }

    @Test
    void getMemoryById_withNonExistingId_shouldReturn404() throws Exception {
        when(memoryService.getMemoryById(999L))
                .thenThrow(new MemoryNotFoundException(999L));

        mockMvc.perform(get("/api/memories/999"))
                .andExpect(status().isNotFound());
    }
}
