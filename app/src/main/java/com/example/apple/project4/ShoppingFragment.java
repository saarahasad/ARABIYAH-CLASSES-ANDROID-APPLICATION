package com.example.apple.project4;

/**
 * Created by apple on 09/05/17.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShoppingFragment extends Fragment {
    @BindView(R.id.single80)
    TextView single80;

    @BindView(R.id.single120)
    TextView single120;

    @BindView(R.id.single170)
    TextView single170;

    @BindView(R.id.grp35)
    TextView grp35;

    @BindView(R.id.grp40)
    TextView grp40;

    @BindView(R.id.grp45)
    TextView grp45;
    ViewGroup rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_shopping, container, false);
        ButterKnife.bind(this, rootView);

         single80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("www.google.com"));
                startActivity(i);
            }

        });
        single120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("www.google.com"));
                startActivity(i);
            }

        });
        single170.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("www.google.com"));
                startActivity(i);
            }

        });

        grp35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("www.google.com"));
                startActivity(i);
            }

        });

        grp40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("www.google.com"));
                startActivity(i);
            }
        });
        grp45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("www.google.com"));
                startActivity(i);
            }

        });
        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Shopping Cart");
    }
}