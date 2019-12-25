package com.example.fragmentdata04092019;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {
    View v;
    EditText edtAndroid;
    Button btnAndroid;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_android, container, false);
        edtAndroid = v.findViewById(R.id.edittextAndroid);
        btnAndroid = v.findViewById(R.id.buttonAndroid);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        final MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.sendString(new OnListenActivity() {
            @Override
            public void sendString(String text) {
                Toast.makeText(mainActivity, text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void sendData(Pair<String, String> pair) {
                Log.d("BBB",pair.first);
                Log.d("BBB",pair.second);
            }
        });
        super.onActivityCreated(savedInstanceState);
    }


}
