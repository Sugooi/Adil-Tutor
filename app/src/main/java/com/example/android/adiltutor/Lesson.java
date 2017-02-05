package com.example.android.adiltutor;

/**
 * Created by adil on 1/28/2017.
 */
public class Lesson {
   // int has = -1;

    String has = "";
    String res_id = has;
    String currDate="";

    public Lesson(String  res_id)
    {this.res_id=res_id;}

    public Lesson(String  res_id,String currDate)
    {this.res_id=res_id;
     this.currDate=currDate;
    }

    public String getres_id()
    {return  res_id;}

    public String getCurrDate()
    {return currDate;}

}