package com.projectjava.edgeservice.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectjava.edgeservice.models.GenericResponseWrapper;
import com.projectjava.edgeservice.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("song/{title}")
    public Song getListingItemsByMovieTitle(@PathVariable("title") String title){

        Song song = restTemplate.getForObject("http://song-service/songs/search/findSongByTitle?title=" + title, Song.class);


        return song;
    }

    @PostMapping("user/{userId}")
    public ResponseEntity<String> postSongByUserId(@PathVariable("userId") Integer userId, @RequestBody Song song){

        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(list);

        Song song1 = new Song(song.getTitle(), song.getArtist(), song.getGenre(), song.getAlbum(), song.getCover(), song.getDuration(), userId);

        ResponseEntity<String> result = restTemplate.postForEntity("http://song-service/songs/", song1, String.class);
        return ResponseEntity.ok().build();
    }
}
