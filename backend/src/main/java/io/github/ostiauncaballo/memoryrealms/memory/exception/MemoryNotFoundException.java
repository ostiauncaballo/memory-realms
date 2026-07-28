package io.github.ostiauncaballo.memoryrealms.memory.exception;

public class MemoryNotFoundException extends RuntimeException {

    public MemoryNotFoundException(Long id) {
        super("Memory not found with id: " + id);
    }

    public MemoryNotFoundException(String message) {
        super(message);
    }
}
