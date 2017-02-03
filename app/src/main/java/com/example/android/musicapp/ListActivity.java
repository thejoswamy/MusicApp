package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Link to specific item details screen
        Button listItem = (Button) findViewById(R.id.details);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsIntent = new Intent(ListActivity.this, DetailActivity.class);
                startActivity(detailsIntent);
            }
        });

        // Link to Now Playing screen
        Button nowPlaying = (Button) findViewById(R.id.now_playing_list);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(ListActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Link to Search screen
        Button search = (Button) findViewById(R.id.search_list);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(ListActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
