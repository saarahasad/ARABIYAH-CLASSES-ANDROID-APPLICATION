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

public class islamiclessonfragmentadapter extends RecyclerView.Adapter<islamiclessonfragmentadapter.MyViewHolder> {

    private ArrayList<CoursesModel> dataSet;
    Context context;

    String TAG="adapter:";

    public islamiclessonfragmentadapter(ArrayList<CoursesModel> data,Context context) {
        this.context=context;
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_arabiclesson, parent, false);


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
        if("Aqeedah".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.islamiclesson_aqeedah);
            Log.d(TAG,"Image res:"+ic);

        }

        if("Fiqh".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.islamiclesson_fiqh);
            Log.d(TAG,"Image res:"+ic);

        }
        if("Islamic History".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.islamiclesson_history);
            Log.d(TAG,"Image res:"+ic);
        }


        imageViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("Aqeedah".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new AqeedahFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Fiqh".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new FiqhFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Islamic History".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new IslamicHistoryFragment(), "NewFragmentTag");
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