package com.example.fragmentdata04092019;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


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
        Bundle bundle = getArguments();
        String chuoi = bundle.getString("chuoi");
        Integer so = bundle.getInt("so");
        Log.d("BBB", chuoi + so);
        super.onActivityCreated(savedInstanceState);
    }
}
