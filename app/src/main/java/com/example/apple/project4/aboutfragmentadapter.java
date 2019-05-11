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

public class aboutfragmentadapter extends RecyclerView.Adapter<aboutfragmentadapter.MyViewHolder> {

    private ArrayList<CoursesModel> dataSet;
    Context context;

    String TAG="adapter:";

    public aboutfragmentadapter(ArrayList<CoursesModel> data,Context context) {
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
        if("Director".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.about_director);
            Log.d(TAG,"Image res:"+ic);

        }

        if("Director's Message".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_scholarship);
            Log.d(TAG,"Image res:"+ic);

        }
        if("Faculty".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.about_faculty);
            Log.d(TAG,"Image res:"+ic);
        }

        if("Testimonials".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.about_testimonial);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Privacy Policy and Terms".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.about_privacy);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Online Study Policy".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.about_study);
            Log.d(TAG,"Image res:"+ic);
        }

        imageViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("Director".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Director's Message".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorMessageFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Faculty".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                   ft1.replace(R.id.content_frame, new FacultyFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Testimonials".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new TestimonialFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Privacy Policy and Terms".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new PrivacyFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Online Study Policy".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new StudyFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
            }
        });

        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("Director".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Director's Message".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new DirectorMessageFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Faculty".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new FacultyFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Testimonials".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new TestimonialFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Privacy Policy and Terms".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new PrivacyFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Online Study Policy".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new StudyFragment(), "NewFragmentTag");
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