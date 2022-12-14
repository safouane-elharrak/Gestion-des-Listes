package com.example.listarticle;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ListViewAdapter extends BaseAdapter {
    public ArrayList<HashMap<String ,String>> list;
    Activity activity;
    public static final String First_Column="Code";
    public static final String Second_Column="Libelle";
    public static final String Third_Column="PV";

    public ListViewAdapter(Activity activity, ArrayList<HashMap<String,String>> list){
        super();
        this.activity=activity;
        this.list=list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater inflater=activity.getLayoutInflater();

        if(convertView == null) {
            convertView =inflater.inflate(R.layout.column_row,null);
            holder=new ViewHolder();

            holder.txtFirst=(TextView) convertView.findViewById(R.id.TextFirst);
            holder.txtSecond=(TextView) convertView.findViewById(R.id.TextSecond);
            holder.txtThird=(TextView) convertView.findViewById(R.id.TextThird);

            convertView.setTag(holder);
        }else{
            holder=(ViewHolder) convertView.getTag();
        }
        HashMap<String,String> map=list.get(position);
        holder.txtFirst.setText(map.get(First_Column));
        holder.txtSecond.setText(map.get(Second_Column));
        holder.txtThird.setText(map.get(Third_Column));
        return convertView;
    }
    private class ViewHolder {
        TextView txtFirst;
        TextView txtSecond;
        TextView txtThird;
    }
}
