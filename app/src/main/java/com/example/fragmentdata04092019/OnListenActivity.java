package com.example.fragmentdata04092019;

import android.util.Pair;

public interface OnListenActivity {
    void sendString(String text);
    void sendData(Pair<String,String> pair);
}
