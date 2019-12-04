package com.projectjava.playlistservice.repository;

import com.projectjava.playlistservice.entity.Playlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaylistRepository extends MongoRepository<Playlist, String> {
    List<Playlist> findPlaylistByName(@Param("name") String name);
    List<Playlist> findPlaylistByUserId(@Param("userid") Integer userid);
}
