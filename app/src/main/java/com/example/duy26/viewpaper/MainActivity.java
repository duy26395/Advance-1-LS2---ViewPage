package com.example.duy26.viewpaper;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager idmain;
    private ArrayList<Data> ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }
    private  void initview(){
        idmain = (ViewPager) findViewById(R.id.idmain);
        ds = new ArrayList<Data>();
        ds.add(new Data("123","ahihi"));
        ds.add(new Data("9999","ahaha"));
        ds.add(new Data("123","hu hu"));
        ds.add(new Data("00000","hehe"));
        adpater adpater = new adpater(this,ds);
        idmain.setAdapter(adpater);
    }
}
