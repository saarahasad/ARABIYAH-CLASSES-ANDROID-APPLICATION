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

/**
 * Created by Belal on 18/09/16.
 */


public class GeneralProgramFragment extends Fragment {

    ViewGroup rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_gp, container, false);
        ButterKnife.bind(this, rootView);
        //change R.layout.yourlayoutfilename for each of your fragments


       /* showMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewDesc.getVisibility() == View.GONE) {
                    textViewDesc.setVisibility(View.VISIBLE);
                    showMoreButton.setText("Show Less");
                } else {
                    textViewDesc.setVisibility(View.GONE);
                    showMoreButton.setText("Show More");
                }
            }
        });*/

        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("General Program");
    }
}