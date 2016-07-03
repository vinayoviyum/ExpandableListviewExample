package com.oviyum.expandablelistviewexample.adapters;


import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.oviyum.expandablelistviewexample.CustomExpandableListview;

/**
 * Created by vinaydanaraddi on 7/3/16.
 */
public class ParentExpnadableAdapter extends BaseExpandableListAdapter implements ExpandableListView.OnChildClickListener{
    Activity activity;


    public ParentExpnadableAdapter(Activity activity){
        this.activity = activity;
    }


    @Override
    public int getGroupCount() {
        return 5;
    }

    @Override
    public int getChildrenCount(int i) {
        return i;
    }

    @Override
    public Object getGroup(int i) {
        return i;
    }

    @Override
    public Object getChild(int i, int i1) {
        return i1;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        TextView tv = new TextView(activity);
        tv.setText("->FirstLevel");
        tv.setBackgroundColor(Color.BLUE);
        tv.setPadding(10, 7, 7, 7);

        return tv;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        CustomExpandableListview SecondLevelexplv = new CustomExpandableListview(activity);
        SecondLevelexplv.setAdapter(new ChildExpandableAdapter(activity));
        SecondLevelexplv.setGroupIndicator(null);
        SecondLevelexplv.setOnChildClickListener(this);
        return SecondLevelexplv;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }


    @Override
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
        return true;
    }
}
