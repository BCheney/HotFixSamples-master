package com.bhl.hotfixsample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import archmages.github.hotfixsamples.R;

/**
 * 项目名称：HotFixSample
 * 类描述：
 * 创建人：Cheney
 * 创建时间：2016-04-08 3:40
 * 修改人：Cheney
 * 修改时间：2016-04-08 3:40
 * 修改备注：
 */
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textView = (TextView) findViewById(R.id.textview);
		BugClass bugClass = new BugClass();
		textView.setText(bugClass.bug());
	}
}
