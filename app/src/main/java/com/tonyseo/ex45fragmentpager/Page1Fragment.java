package com.tonyseo.ex45fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Page1Fragment extends Fragment {
    Button btn;
    TextView tv;
    String temp;

    @Override
    public void onResume() {
        super.onResume();
        tv.setText(temp);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page1, container, false);
        tv = view.findViewById(R.id.tv);
        btn = view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = "Hello world!!";
                tv.setText(temp);
            }
        });
        return view;
    }
}
