package com.example.fragment_study;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by 朱宏博 on 2018/3/20.
 */

public class TitleFragment extends Fragment{

    private ImageButton mLeftMenu;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_title, container, false);

        return view;
    }
}
