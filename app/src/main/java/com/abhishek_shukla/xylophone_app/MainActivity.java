package com.abhishek_shukla.xylophone_app;

import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

        import android.media.AudioManager;
        import android.media.SoundPool;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button[] buttons = new Button[7] ;
    MediaPlayer[] mediaPlayer = new MediaPlayer[7] ;



    // dataType[] arrayRefVar = new dataType[arraySize];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayer[0] = MediaPlayer.create(this, R.raw.note1_c);
        mediaPlayer[1] = MediaPlayer.create(this, R.raw.note2_d);
        mediaPlayer[2] = MediaPlayer.create(this, R.raw.note3_e);
        mediaPlayer[3] = MediaPlayer.create(this, R.raw.note4_f);
        mediaPlayer[4] = MediaPlayer.create(this, R.raw.note5_g);
        mediaPlayer[5] = MediaPlayer.create(this, R.raw.note7_b);
        mediaPlayer[6] = MediaPlayer.create(this, R.raw.note6_a);

         buttons[0] = (Button)findViewById(R.id.c_key);
        buttons[0].setOnClickListener(onClickListener1);

        buttons[1] = (Button)findViewById(R.id.d_key);
        buttons[1].setOnClickListener(onClickListener2);

        buttons[2] = (Button)findViewById(R.id.e_key);
        buttons[2].setOnClickListener(onClickListener3);

        buttons[3] = (Button)findViewById(R.id.f_key);
        buttons[3].setOnClickListener(onClickListener4);

        buttons[4] = (Button)findViewById(R.id.g_key);
        buttons[4].setOnClickListener(onClickListener5);

        buttons[5] = (Button)findViewById(R.id.a_key);
        buttons[5].setOnClickListener(onClickListener6);

        buttons[6] = (Button)findViewById(R.id.b_key);
        buttons[6].setOnClickListener(onClickListener7);



    }

    private View.OnClickListener onClickListener1 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked

          //  mediaPlayer[0].start();

            // If the music is playing
            if(mediaPlayer[0].isPlaying() == true)
                // Pause the music player
                mediaPlayer[0].seekTo(500);
                // If it's not playing
            else
                // Resume the music player
                mediaPlayer[0].start();


        }
    };
    private View.OnClickListener onClickListener2 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked

        //    mediaPlayer[1].start();

            // If the music is playing
            if(mediaPlayer[1].isPlaying() == true)
                // Pause the music player
                mediaPlayer[1].seekTo(500);
                // If it's not playing
            else
                // Resume the music player
                mediaPlayer[1].start();


        }

    };
    private View.OnClickListener onClickListener3 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked

           // mediaPlayer[2].start();


            // If the music is playing
            if(mediaPlayer[2].isPlaying() == true)
                // Pause the music player
                mediaPlayer[2].seekTo(500);
                // If it's not playing
            else
                // Resume the music player
                mediaPlayer[2].start();


        }

    };
    private View.OnClickListener onClickListener4 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is

           // mediaPlayer[3].start();


            // If the music is playing
            if(mediaPlayer[3].isPlaying() == true)
                // Pause the music player
                mediaPlayer[3].seekTo(500);
                // If it's not playing
            else
                // Resume the music player
                mediaPlayer[3].start();


        }

    };
    private View.OnClickListener onClickListener5 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked

           // mediaPlayer[4].start();


            // If the music is playing
            if(mediaPlayer[4].isPlaying() == true)
                // Pause the music player
                mediaPlayer[4].seekTo(500);
                // If it's not playing
            else
                // Resume the music player
                mediaPlayer[4].start();


        }

    };
    private View.OnClickListener onClickListener6 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked

            mediaPlayer[5].start();

            // If the music is playing
            if(mediaPlayer[5].isPlaying() == true)
                // Pause the music player
                mediaPlayer[5].seekTo(500);
                // If it's not playing
            else
                // Resume the music player
                mediaPlayer[5].start();


        }

    }; private View.OnClickListener onClickListener7 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked


            mediaPlayer[6].start();

            // If the music is playing
            if(mediaPlayer[6].isPlaying() == true)
                // Pause the music player
                mediaPlayer[6].seekTo(500);
                // If it's not playing
            else
                // Resume the music player
                mediaPlayer[6].start();


        }

    };




}
