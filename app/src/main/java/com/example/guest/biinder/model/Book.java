package com.example.guest.biinder.model;

import org.parceler.Parcel;

/**
 * Created by Guest on 12/13/16.
 */
@Parcel
public class Book {

    String title;
    String author;
    String image;
    long likes;
    long dislikes;

    public Book(String title, String author, String image, long likes, long dislikes) {
        this.title = title;
        this.author = author;
        this.image = image;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public Book(){}


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }

    public long getLikes() {
        return likes;
    }

    public long getDislikes() {
        return dislikes;
    }

    public void addLike() {
        likes += 1;
    }

    public void addDislike() {
        dislikes += 1;
    }


}
