package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button artists = (Button) findViewById(R.id.artists);
        artists.setOnClickListener(this);

        Button albums = (Button) findViewById(R.id.albums);
        albums.setOnClickListener(this);

        Button playlists = (Button) findViewById(R.id.playlists);
        playlists.setOnClickListener(this);

        Button genre = (Button) findViewById(R.id.genre);
        genre.setOnClickListener(this);

        // Link to Search screen
        Button search = (Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }

    /**
     * Click listener for categories
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent listIntent = new Intent(this, ListActivity.class);
        startActivity(listIntent);
    }
}
