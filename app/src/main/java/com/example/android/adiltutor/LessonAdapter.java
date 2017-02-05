package com.example.android.adiltutor;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adil on 1/28/2017.
 */

public class LessonAdapter extends ArrayAdapter<Lesson> {


    public LessonAdapter(Activity context, ArrayList<Lesson> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViewsw, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Lesson currentLesson = getItem(position);



        LinearLayout linearLayout=(LinearLayout) listItemView.findViewById(R.id.list_item);

        linearLayout.setBackgroundColor(Color.parseColor(currentLesson.getres_id()));

        TextView textView =(TextView) listItemView.findViewById(R.id.date);

        textView.setText(currentLesson.getCurrDate());



        return listItemView;
    }
}