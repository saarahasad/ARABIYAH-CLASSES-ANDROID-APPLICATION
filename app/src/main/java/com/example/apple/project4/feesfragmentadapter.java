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

public class feesfragmentadapter extends RecyclerView.Adapter<feesfragmentadapter.MyViewHolder> {

    private ArrayList<CoursesModel> dataSet;
    Context context;

    String TAG="adapter:";

    public feesfragmentadapter(ArrayList<CoursesModel> data,Context context) {
        this.context=context;
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_fees, parent, false);


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
        if("Course Fees".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_course);
            Log.d(TAG,"Image res:"+ic);

        }

        if("Book Fees".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_book);
            Log.d(TAG,"Image res:"+ic);

        }
        if("Scholarships".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_scholarship);
            Log.d(TAG,"Image res:"+ic);
        }

        if("Refund Policy".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.fees_refund);
            Log.d(TAG,"Image res:"+ic);
        }

        imageViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("Course Fees".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new CourseFeesFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Book Fees".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new BookFeesFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Scholarships".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new ScholarshipFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Refund Policy".equals(dataSet.get(listPosition).getCoursename())){
                FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                ft1.replace(R.id.content_frame, new RefundFragment(), "NewFragmentTag");
                ft1.commit();
                ft1.addToBackStack(null);
            }
            }
        });

        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("Course Fees".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new CourseFeesFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Book Fees".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new BookFeesFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Scholarships".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new ScholarshipFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }

                if("Refund Policy".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new RefundFragment(), "NewFragmentTag");
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