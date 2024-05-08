package com.example;

import org.example.CastMember;

import java.util.List;

public class Movie {
    private String title;
    private String directorName;
    private int duration;
    private List<CastMember> cast;

    public Movie(String title, String directorName, int duration, List<CastMember> cast) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.cast = cast;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<CastMember> getCast() {
        return cast;
    }

    public void setCast(List<CastMember> cast) {
        this.cast = cast;
    }
}
