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

public class directorfragmentadapter extends RecyclerView.Adapter<directorfragmentadapter.MyViewHolder> {

    private ArrayList<CoursesModel> dataSet;
    Context context;

    String TAG="adapter:";

    public directorfragmentadapter(ArrayList<CoursesModel> data,Context context) {
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
        if("About".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.about_director);
            Log.d(TAG,"Image res:"+ic);

        }

        if("Qualifications".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.director_qualif);
            Log.d(TAG,"Image res:"+ic);

        }
        if("Books".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);
        }

        if("Student Testimonials".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.about_testimonial);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Recommendations".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.director_recommicon);
            Log.d(TAG,"Image res:"+ic);
        }


        imageViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("About".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new AboutDirectorFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Qualifications".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                        ft1.replace(R.id.content_frame, new DirectorQualificationsFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Books".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorBooksFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Student Testimonials".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorTestimonialsFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Recommendations".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorRecommendationFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

            }
        });

        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("About".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new AboutDirectorFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Qualifications".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorQualificationsFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Books".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorBooksFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Student Testimonials".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorTestimonialsFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Recommendations".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorRecommendationFragment(), "NewFragmentTag");
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