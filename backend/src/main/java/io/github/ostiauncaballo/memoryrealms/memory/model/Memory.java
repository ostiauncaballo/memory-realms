package io.github.ostiauncaballo.memoryrealms.memory.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Memory(
        Long id,
        String title,
        String universe,
        String description,
        String content,
        String image,
        Integer comments,
        Integer likes,
        Double rating
) {
}
