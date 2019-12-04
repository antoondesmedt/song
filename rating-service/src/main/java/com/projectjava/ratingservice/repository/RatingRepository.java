package com.projectjava.ratingservice.repository;

import com.projectjava.ratingservice.entitiy.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {
    List<Rating> findRatingsByUserId(@Param("userid") Integer userid);
    List<Rating> findRatingsBySongId(@Param("songid") Integer songId);
    Rating findRatingByUserIdAndSongId(@Param("userid") Integer userid,@Param("songid") Integer songId);
}
