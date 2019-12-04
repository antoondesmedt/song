package com.projectjava.ratingservice.entitiy;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "rating")
public class Rating {
    @Id
    private String id;
    private Integer userId;
    private Integer songId;
    private Integer score;
}
