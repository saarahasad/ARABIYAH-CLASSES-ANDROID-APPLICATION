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

public class arabiclessonfragmentadapter extends RecyclerView.Adapter<arabiclessonfragmentadapter.MyViewHolder> {

    private ArrayList<CoursesModel> dataSet;
    Context context;

  String TAG="adapter:";

    public arabiclessonfragmentadapter(ArrayList<CoursesModel> data,Context context) {
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
        if("General Program".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_gp);
            Log.d(TAG,"Image res:"+ic);

        }

        if("Arabic Language".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_al);
            Log.d(TAG,"Image res:"+ic);

        }
        if("Grammar".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_g);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Morphology".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_m);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Rhetoric".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_r);
            Log.d(TAG,"Image res:"+ic);
        }

        if("Arabic Conversation".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_ac);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Literature".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_l);
            Log.d(TAG,"Image res:"+ic);
        }
        if("Intensive Courses".equals(ic)) {
            imageViewIcon.setImageResource(R.drawable.arabiclesson_ic);
            Log.d(TAG,"Image res:"+ic);
        }

        imageViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new CoursesFragment(), "NewFragmentTag");
                ft.commit();
                ft.addToBackStack(null);
                if("General Program".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new GeneralProgramFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Arabic Language".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new ArabicLanguageFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Grammar".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new GrammarFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Morphology".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new MorphologyFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Rhetoric".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new RhetoricFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Arabic Conversation".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new ArabicConversationFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Literature".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new LiteratureFragment(), "NewFragmentTag");
                    ft1.commit();
                    ft1.addToBackStack(null);
                }
                if("Intensive Courses".equals(dataSet.get(listPosition).getCoursename())){
                    FragmentTransaction ft1 = ((FragmentActivity)context).getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content_frame, new IntensiveCoursesFragment(), "NewFragmentTag");
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