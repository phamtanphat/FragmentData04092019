package com.example.fragmentdata04092019;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnActivity;
    OnListenActivity onListenActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity = findViewById(R.id.buttonActivity);
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AndroidFragment androidFragment =
                        (AndroidFragment) getSupportFragmentManager()
                                        .findFragmentById(R.id.fragmentAndroid);
                if (androidFragment != null){
                    onListenActivity.sendString("Send String Fragment");
                    Pair<String,String> pair = Pair.create("Hello","Android fragment");
                    onListenActivity.sendData(pair);
                }
            }
        });

    }
    public void sendString(OnListenActivity onListenActivity){
        this.onListenActivity = onListenActivity;
    }
    public void sendData(OnListenActivity onListenActivity){
        this.onListenActivity = onListenActivity;
    }
}
