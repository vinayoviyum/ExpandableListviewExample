package com.oviyum.expandablelistviewexample;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;

import com.oviyum.expandablelistviewexample.adapters.ParentExpnadableAdapter;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ExpandableListView expandableListViee = (ExpandableListView)findViewById(R.id.abc);
		expandableListViee.setAdapter(new ParentExpnadableAdapter(this));

	}
}


