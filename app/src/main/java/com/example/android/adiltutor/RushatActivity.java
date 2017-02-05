package com.example.android.adiltutor;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by adil on 1/28/2017.
 */


  public  class  RushatActivity extends AppCompatActivity {
    AdilActivity call=new AdilActivity();

    //Calendar c = Calendar.getInstance();
   //  SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
    //  String formattedDate = df.format(c.getTime());
   // ArrayList<String> dates = new ArrayList<>();

   String body="";
    //static int count=0;
   // static String color="#ff0000";
   /// static int i=0;

   // static String prevDate="";
   // static int locPrevDate=0;

  //  static boolean isClass = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rushat);





    }

    public void whatsAppYes(View view)
    {   body="Yes Come to tution Today";




        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(100);

        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");

        sendIntent.putExtra(Intent.EXTRA_TEXT,body);
        sendIntent.setPackage("com.whatsapp");

        if (sendIntent.resolveActivity(getPackageManager())!= null) {



            startActivity(Intent.createChooser(sendIntent,body));
        }

        call.compactCalendarView.setCurrentDayBackgroundColor(Color.parseColor("#32CD32"));




        //if(prevDate.equals( formattedDate)){
       /* if(count==0){
        AdilActivity.words.add(new Lesson("#008000","Date: "+date()));
        AdilActivity.lessonAdapter.notifyDataSetChanged();
        count++;}
        else
        {   int size=AdilActivity.words.size()-1;
            AdilActivity.words.remove(size);
            AdilActivity.lessonAdapter.notifyDataSetChanged();

            AdilActivity.words.add(new Lesson("#008000","Date: "+date()));
            AdilActivity.lessonAdapter.notifyDataSetChanged();*/



        }



       // else
       // {AdilActivity.words.add(new Lesson("#008000","Date: "+date()));
      // //     AdilActivity.lessonAdapter.notifyDataSetChanged();
      //      }


    //}


    public void whatsAppNo(View view) {
        body = "No Tution Today";


        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(100);
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");


        sendIntent.putExtra(Intent.EXTRA_TEXT, body);
        sendIntent.setPackage("com.whatsapp");
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(sendIntent, body));
        }

        call.compactCalendarView.setCurrentDayBackgroundColor(Color.parseColor("#ff0000"));




       // if (prevDate.equals(formattedDate)) {

           /* if (count == 0) {
                AdilActivity.words.add(new Lesson("#ff0000", "Date: " + date()));
                AdilActivity.lessonAdapter.notifyDataSetChanged();
                count++;
            } else {
                int size = AdilActivity.words.size() - 1;
                AdilActivity.words.remove(size);
                AdilActivity.lessonAdapter.notifyDataSetChanged();

                AdilActivity.words.add(new Lesson("#ff0000", "Date: " + date()));
                AdilActivity.lessonAdapter.notifyDataSetChanged();


            }*/

        }}
       // else{AdilActivity.words.add(new Lesson("#ff0000","Date: "+date()));
      //      AdilActivity.lessonAdapter.notifyDataSetChanged();}
   // }










    /*public String date()
    {

        if(i==0)
        {

            dates.add(formattedDate);
            int aSize=dates.size();
            prevDate=dates.get(aSize-1);
            locPrevDate=aSize-1;
            i++;
            return formattedDate;
        }
        else
    {
        return formattedDate;
    }



    }


}*/
