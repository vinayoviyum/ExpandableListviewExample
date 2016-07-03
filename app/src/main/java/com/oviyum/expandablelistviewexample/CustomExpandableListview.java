package com.oviyum.expandablelistviewexample;

import android.content.Context;
import android.widget.ExpandableListView;

/**
 * Created by vinaydanaraddi on 6/28/16.
 */
public class CustomExpandableListview extends ExpandableListView {

    public CustomExpandableListview(Context context) {
        super(context);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        widthMeasureSpec = MeasureSpec.makeMeasureSpec(960,
                MeasureSpec.AT_MOST);
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(600,
                MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
