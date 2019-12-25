package com.example.fragmentdata04092019;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        // 1 : Truyen du lieu cho fragment chua ton tai
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        Bundle bundle = new Bundle();
        bundle.putString("chuoi","Main send data");
        bundle.putInt("so",1);
        androidFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.frameContainer,androidFragment);
        fragmentTransaction.commit();
    }
}
