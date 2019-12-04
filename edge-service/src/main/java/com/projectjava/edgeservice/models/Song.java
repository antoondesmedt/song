package com.projectjava.edgeservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {
    private int id, userId;
    private String title, artist, genre, album, cover, duration;

    public Song(String title, String artist, String genre, String album, String cover, String duration, int userId) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.album = album;
        this.cover = cover;
        this.duration = duration;
        this.userId = userId;
    }

    public Song() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() { return genre;}

    public String getAlbum() {
        return album;
    }

    public String getCover() {
        return cover;
    }

    public String getDuration() {
        return duration;
    }

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) { this.genre = genre;}

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
