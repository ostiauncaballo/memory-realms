package io.github.ostiauncaballo.memoryrealms.memory.controller;

import io.github.ostiauncaballo.memoryrealms.memory.model.Memory;
import io.github.ostiauncaballo.memoryrealms.memory.service.MemoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/memories")
public class MemoryController {

    private final MemoryService memoryService;

    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @GetMapping
    public List<Memory> getAllMemories() {
        return memoryService.getAllMemories();
    }

    @GetMapping("/{id}")
    public Memory getMemoryById(@PathVariable Long id) {
        return memoryService.getMemoryById(id);
    }
}
