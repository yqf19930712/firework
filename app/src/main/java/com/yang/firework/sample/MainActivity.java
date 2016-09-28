package com.yang.firework.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yang.firework.FireworkView;
import com.yang.firework.ParticleLayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FireworkView fireworkView = (FireworkView) findViewById(R.id.firework);
        Button snowBtn = (Button) findViewById(R.id.snow);
        snowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireworkView.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        fireworkView.setParticleSystem(new ParticleLayer(MainActivity.this,R.raw.snow,R.drawable.particle_texture));
                    }
                });

            }
        });
        Button rainingBtn = (Button) findViewById(R.id.raining);
        rainingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireworkView.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        fireworkView.setParticleSystem(new ParticleLayer(MainActivity.this,R.raw.rain,R.drawable.rain_texture));
                    }
                });

            }
        });
        Button testBtn = (Button) findViewById(R.id.test);
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireworkView.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        fireworkView.setParticleSystem(new ParticleLayer(MainActivity.this,R.raw.test,R.drawable.particle_texture));
                    }
                });

            }
        });
    }
}
