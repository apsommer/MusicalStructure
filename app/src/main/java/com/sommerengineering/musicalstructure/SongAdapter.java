package com.sommerengineering.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {

    // custom constructor
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs); // instantiates superclass ArrayAdapter constructor
        // second argument for populating single TextView (the default for ArrayAdapter)
        // since this custom layout is inflated below the second argument is arbitrary
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // check if the existing view is being reused, otherwise inflate a new view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the Song object located at this position in the list
        Song currentSong = (Song) getItem(position); // "this." can added or removed before getItem()

        // find the TextView in the list_item.xml layout with ID
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        // get the artist name from the current Song object and set it to artist_text_view
        artistTextView.setText(currentSong.getArtist());

        // find the TextView in the list_item.xml layout with ID
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        // get the song title from the current Song object and set it to title_text_view
        titleTextView.setText(currentSong.getTitle());

        // find the ImageView in the list_item.xml layout with ID
        ImageView albumArtView = (ImageView) listItemView.findViewById(R.id.album_art_image_view);

        // get the image resource ID from the current Song object and set it to album_art_image_view
        albumArtView.setImageResource(currentSong.getImageResourceId());

        // return the whole list item layout containing 2 TextViews
        // this becomes a child of the master ListView in main_activity.xml
        return listItemView;
    }
}
