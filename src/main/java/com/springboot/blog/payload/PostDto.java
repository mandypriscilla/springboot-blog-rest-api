package com.springboot.blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {

    private long id;

    // Title should not be null or empty
    @NotEmpty
    // Title should have at least 2 characters
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    // Post description should not be null or empty
    @NotEmpty
    // Post description should have at least 10 characters
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    // Post content should not be null or empty
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;
}
