package com.tonyseo.ex45fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Page3Fragment extends Fragment {
    ListView listView;
    ArrayList<String> datas = new ArrayList<>();
    Page3ListAdapter adapter;

    //시작시 lifeCycle에 따라 제일먼저 생성됨. 이후 stop상태에서 resume으로 돌아올때도 View만 새로 다시 만들기에 영향X
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        datas.add("eee");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page3, container, false);
    }

    //onCreateView 실행후 자동으로 실행되는 메소드임. return View의 파라미터가 이곳의 View 파라미터임.
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.listview);
        adapter = new Page3ListAdapter(datas, getActivity());
        listView.setAdapter(adapter);

        //listview item click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getActivity(), datas.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
