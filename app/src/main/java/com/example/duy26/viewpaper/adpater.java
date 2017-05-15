package com.example.duy26.viewpaper;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by duy26 on 05/15/17.
 */

public class adpater extends PagerAdapter {
    private ArrayList<Data> al;
    private ViewPager idmain;
    private LayoutInflater inflater;
    public adpater(Context context,ArrayList<Data> al){
        this.al = al;
         inflater = LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.view2,container,false);
        LinearLayout id = (LinearLayout) view.findViewById(R.id.idmain);
        TextView tvname = (TextView) view.findViewById(R.id.idtext);
        Data data = al.get(position);
        tvname.setText(data.getTen());
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
