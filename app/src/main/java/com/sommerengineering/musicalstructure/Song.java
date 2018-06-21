package com.sommerengineering.musicalstructure;

import java.io.Serializable;

// custom object holding 2 strings
public class Song implements Serializable{

    // String for artist name
    private String mArtist;

    // String for song title
    private String mTitle;

    // Drawable resource ID
    private int mImageResourceId;

    // constructor
    public Song(String Artist, String Title, int imageResourceId) {
        mArtist = Artist; // instantiate private variable
        mTitle = Title; // instantiate private variable
        mImageResourceId = imageResourceId;
    }

    // get artist name
    public String getArtist() {
        return mArtist;
    }

    // get song title
    public String getTitle() {
        return mTitle;
    }

    // get image resource ID
    public int getImageResourceId() { return mImageResourceId; }

}
