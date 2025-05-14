package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;

@Data
@EqualsAndHashCode(of = {"id"})
public class Image {

    private Long id;
    private long postId;
    private String originalFileName;
    private File filePath;

}
