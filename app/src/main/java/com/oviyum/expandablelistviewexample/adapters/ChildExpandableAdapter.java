package com.oviyum.expandablelistviewexample.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by vinaydanaraddi on 7/3/16.
 */
public class ChildExpandableAdapter extends BaseExpandableListAdapter {

    Activity activity;

    public  ChildExpandableAdapter(Activity activity){
        this.activity = activity;
    }

    @Override
    public int getGroupCount() {
        return 1;
    }

    @Override
    public int getChildrenCount(int i) {
        return 5;
    }

    @Override
    public Object getGroup(int i) {
        return null;
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
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        TextView tv = new TextView(activity);
        tv.setText("-->Second Level");
        tv.setPadding(12, 7, 7, 7);
        tv.setBackgroundColor(Color.RED);

        return tv;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        TextView tv = new TextView(activity);
        tv.setText("child");
        tv.setPadding(15, 5, 5, 5);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setLayoutParams(new ListView.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        return tv;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
