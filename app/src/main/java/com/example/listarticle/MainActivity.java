package com.example.listarticle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {
    public static final String First_Column="Code";
    public static final String Second_Column="Libelle";
    public static final String Third_Column="PV";

    private ArrayList<HashMap<String, String>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ListViewAdapter adapter = new ListViewAdapter (this, list);
        listView.setAdapter(adapter);

    }
    private void populatelist(){
        list=new ArrayList<HashMap<String,String>>();
        HashMap<String,String> hashMap = new HashMap<String ,String>();
        hashMap.put(First_Column,"1");
        hashMap.put(Second_Column,"Pain");
        hashMap.put(Third_Column,"2");
        list.add(hashMap);

        list=new ArrayList<HashMap<String,String>>();
        HashMap<String,String> hashMap2 = new HashMap<String ,String>();
        hashMap2.put(First_Column,"2");
        hashMap2.put(Second_Column,"sucre");
        hashMap2.put(Third_Column,"15");
        list.add(hashMap2);

        list=new ArrayList<HashMap<String,String>>();
        HashMap<String,String> hashMap3 = new HashMap<String ,String>();
        hashMap3.put(First_Column,"3");
        hashMap3.put(Second_Column,"huile");
        hashMap3.put(Third_Column,"25");
        list.add(hashMap3);

        list=new ArrayList<HashMap<String,String>>();
        HashMap<String,String> hashMap4 = new HashMap<String ,String>();
        hashMap4.put(First_Column,"4");
        hashMap4.put(Second_Column,"Cafe");
        hashMap4.put(Third_Column,"20");
        list.add(hashMap4);
    }

}