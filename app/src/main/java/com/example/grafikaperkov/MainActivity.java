package com.example.grafikaperkov;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;



public class MainActivity extends AppCompatActivity {

    MediaPlayer pianoMusic; //Kreiranje Media Playera



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        pianoMusic = MediaPlayer.create(this,R.raw.piano); //Naredba koja omogućuje povezivanje s zvukom
        Switch switch_looping = (Switch) findViewById(R.id.switch_looping); //Referenca na switch objekt

        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { //Dodaje listener

            @Override

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { //Provjera za loop

                pianoMusic.setLooping(isChecked);

            }

        });

    }



    public void playMusic(View v){

        pianoMusic.start(); //Naredba gumba za start

    }

    public void pauseMusic(View v){

        if (pianoMusic.isPlaying()) //Naredba gumba za pause

            pianoMusic.pause();

    }

}