package com.sommerengineering.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState); // load a saved instance if it exists
        setContentView(R.layout.activity_main); // set view to XML layout

        // create ArrayList of Word objects, ArrayList has flexible length
        // ArrayList is final so it can be accessed within click listener
        final ArrayList<Song> songs = new ArrayList<Song>();

        // add Song objects to the ArrayList
        songs.add(new Song("Sheku Kanneh-Mason", "Bob Marley - No Woman, No Cry (Arr. Cello)", R.drawable.sheku));
        songs.add(new Song("Yo-Yo Ma", "Bach - Six Suites for Unaccompanied Cello (Prelude)", R.drawable.yoyo));
        songs.add(new Song("Mstislav Rostropovich", "Bach - Cello Suite no. 2 in D minor (IV. Sarabande)", R.drawable.mstislav));
        songs.add(new Song("Zoe Keating", "Fern", R.drawable.zoe));
        songs.add(new Song("Ryoichi Fujimori", "Kodaly - Cello Sonata, Op.8 (II. Adagio)", R.drawable.ryoichi));
        songs.add(new Song("Max Richter", "She Remembers", R.drawable.max));

        // custom adapter set on layout ListView
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // set an item click listener on ListView items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // create a new intent for the NowPlayingActivity
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // add the selected song to the intent
                nowPlayingIntent.putExtra("selectedSong", songs.get(position));

                // Start the new activity
                // no conditional needed here to catch unhandled intent, as this intent is explicit
                startActivity(nowPlayingIntent);

            }
        });

    }
}
