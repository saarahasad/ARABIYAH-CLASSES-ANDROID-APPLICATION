package com.example.apple.project4;

/**
 * Created by apple on 09/05/17.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.ButterKnife;


public class CoursesFragment extends Fragment {
    private GridLayoutManager lLayout;


    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<CoursesModel> data;
    private coursesfragmentadapter madapter;

    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    ViewGroup rootView;
    String[] coursename={"Arabic Lessons","Quran Lessons","Islamic Lessons","Training of Teachers","Children's courses"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        rootView = (ViewGroup) inflater
                .inflate(R.layout.recycler_view, container, false);
        ButterKnife.bind(this, rootView);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.myrecyclerview);
        int numberOfColumns = 1;
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));
        adapter = new coursesfragmentadapter(data, getContext());
        recyclerView.setAdapter(adapter);


        data = new ArrayList<CoursesModel>();
        for (int i = 0; i < 5; i++) {
            data.add(new CoursesModel(
                    coursename[i]
            ));
        }
        Context mcontext = getContext();
        adapter = new coursesfragmentadapter(data, mcontext);
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Courses");
    }

}