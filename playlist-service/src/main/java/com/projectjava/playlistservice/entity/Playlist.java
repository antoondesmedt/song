package com.projectjava.playlistservice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "playlist")
public class Playlist {
    @Id
    private String id;
    private String name;
    private Integer userId;
    private List<String> songTitles;
}
