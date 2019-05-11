package com.example.apple.project4;

/**
 * Created by apple on 09/05/17.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;


public class AboutDirectorFragment extends Fragment {

    ViewGroup rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_aboutdirector, container, false);
        ButterKnife.bind(this, rootView);
        //change R.layout.yourlayoutfilename for each of your fragments
        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("About");
    }
}
