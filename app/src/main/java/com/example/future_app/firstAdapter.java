package com.example.future_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class firstAdapter extends ArrayAdapter {
    ArrayList<String> day;
    //建構式
    public firstAdapter(Activity context, ArrayList<String> day){
        super(context,0,day);
        this.day = day;
    }

    @Override
    //改寫getView()方法
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        //listItemView可能會是空的，例如App剛啟動時，沒有預先儲存的view可使用
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        TextView text_view = listItemView.findViewById(R.id.day);
        text_view.setText(day.get(position));
        ImageView addImage = listItemView.findViewById(R.id.clockDrug);
        return listItemView;
    }
}
