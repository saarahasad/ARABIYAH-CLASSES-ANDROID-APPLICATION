package com.example.apple.project4;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class coursesfragmentadapter extends RecyclerView.Adapter<coursesfragmentadapter.MyViewHolder> {

    private ArrayList<CoursesModel> dataSet;
    Context context;

    String TAG="adapter:";

    public coursesfragmentadapter(ArrayList<CoursesModel> data,Context context) {
        this.context=context;
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_about
                        , parent, false);


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        Log.d(TAG,"ADAPTER");

        TextView textViewName = holder.textViewName;
        ImageView imageViewIcon=holder.imageViewIcon;
        String ic=dataSet.get(listPosition).getCoursename();

        textViewName.setText(ic);
        if("Arabic Lessons".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);

        }

        if("Quran Lessons".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);

        }
        if("Islamic Lessons".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);
        }

        if("Testimonials".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Training of Teachers".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Children's courses".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);
        }

        imageViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("Arabic Lessons".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new arabiclessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Quran Lessons".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new quranlessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Islamic Lessons".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new islamiclessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Training of Teachers".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new traininglessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Children's courses".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new childrencoursesFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

            }
        });
        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("Arabic Lessons".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new arabiclessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Quran Lessons".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new quranlessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Islamic Lessons".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new islamiclessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Training of Teachers".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new traininglessonFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Children's courses".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new childrencoursesFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
    public  class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.CourseName);
            this.imageViewIcon= (ImageView) itemView.findViewById(R.id.CourseImage);

            //  this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}