package com.sommerengineering.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        LinearLayout nowPlayingLinearLayout = (LinearLayout) findViewById(R.id.now_playing_linear_layout);

        Intent intent = getIntent();
        Song selectedSong = (Song) intent.getSerializableExtra("selectedSong");

        // find the ImageView in the activity_now_playing.xml layout with ID
        ImageView albumArtView = (ImageView) nowPlayingLinearLayout.findViewById(R.id.album_art_image_view);

        // get the image resource ID from the current Song object and set it to album_art_image_view
        albumArtView.setImageResource(selectedSong.getImageResourceId());

        // find the TextView in the activity_now_playing.xml layout with ID
        TextView artistTextView = (TextView) nowPlayingLinearLayout.findViewById(R.id.artist_text_view);

        // get the artist name from the current Song object and set it to artist_text_view
        artistTextView.setText(selectedSong.getArtist());

        // find the TextView in the activity_now_playing.xml layout with ID
        TextView titleTextView = (TextView) nowPlayingLinearLayout.findViewById(R.id.title_text_view);

        // get the song title from the current Song object and set it to title_text_view
        titleTextView.setText(selectedSong.getTitle());

    }
}
