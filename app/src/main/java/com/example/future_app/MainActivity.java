package com.example.future_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <String> listDay = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listDay.add("星期一");
        listDay.add("星期二");
        listDay.add("星期三");
        listDay.add("星期四");
        listDay.add("星期五");
        listDay.add("星期六");
        listDay.add("星期日");

        ArrayAdapter itemsAdapter = new fuckYouAdapter(this, listDay);

        ListView dayDrug = findViewById(R.id.dayDrug);
        dayDrug.setAdapter(itemsAdapter);


        ListView clockDrug = findViewById(R.id.clockDrug);

        Spinner drugNum = 

    }

    public void setSpinner(Spinner spinner){
        ArrayAdapter<CharSequence> lunchList = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.drugNum,
                android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(lunchList);
    }
}
