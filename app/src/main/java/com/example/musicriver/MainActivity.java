package com.example.musicriver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Pilu Membiru","Kunto Aji",R.raw.kunto1));
        arrayList.add(new Music("Rehat","Kunto Aji",R.raw.kunto2));

        adapter = new CustomMusicAdapter(this, R.layout.custiom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}