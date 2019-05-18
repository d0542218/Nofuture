package com.example.future_app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class fuckYouAdapter extends ArrayAdapter {
    ArrayList<String> day;
    //建構式
    public fuckYouAdapter(Activity context, ArrayList<String> day){
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


        //找到ListItem.xml中的兩個TextView(物種學名和中文名)
        TextView text_view = listItemView.findViewById(R.id.day);
        text_view.setText(day.get(position));
        ImageView addImage = listItemView.findViewById(R.id.clockDrug);
        return listItemView;
    }
}
