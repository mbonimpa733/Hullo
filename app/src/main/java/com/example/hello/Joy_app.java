package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Joy_app extends AppCompatActivity {
    MediaPlayer playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy_app);
        Button btn1=(Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 playing=MediaPlayer.create(getApplicationContext(),R.raw.itiswell);
                playing.start();
            }
        });
        Button btn2=(Button)findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(playing != null && playing.isPlaying()){
                    playing.stop();
                }
            }
        });


    }
}
