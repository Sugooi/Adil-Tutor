package com.example.android.adiltutor;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AdilActivity extends AppCompatActivity {
    //public static   LessonAdapter lessonAdapter;
    //  public static ArrayList<Lesson> words = new ArrayList<>();

    public CompactCalendarView compactCalendarView;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_lay);


        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);

        Date month = new Date();

        actionBar.setTitle(dateFormatMonth.format(month));

        CompactCalendarView compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);

        // compactCalendarView.setFirstDayOfWeek(Calendar.MONDAY);

        compactCalendarView.setUseThreeLetterAbbreviation(true);








       /* RushatActivity r = new RushatActivity();

       // SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.android.adiltutor", Context.MODE_PRIVATE);

        //words.add(new Lesson(RushatActivity.getColor(RushatActivity.isClass),"DATE: "+r.date()));

        ListView listView  =(ListView) findViewById(R.id.listView);

        lessonAdapter = new LessonAdapter(this,words);

        listView.setAdapter(lessonAdapter);*/


        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {

            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });

    }
}

