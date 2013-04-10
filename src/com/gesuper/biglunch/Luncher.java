package com.gesuper.biglunch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Luncher extends Activity {
	private SimpleDateFormat mClockFormat;
	private TextView mClockTv;
	private TextView mWeatherTv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_luncher);
		this.initResource();
	}

	private void initResource() {
		// TODO Auto-generated method stub
		this.mClockTv = (TextView)this.findViewById(R.id.luncher_clock_tv);
		this.mWeatherTv = (TextView)this.findViewById(R.id.luncher_weather_tv);
		this.mClockFormat = new SimpleDateFormat("HH : mm", Locale.getDefault());
		this.updateClockTime();
	}

	private void updateClockTime() {
		// TODO Auto-generated method stub
		this.mClockTv.setText(this.mClockFormat.format(new Date()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.luncher, menu);
		return true;
	}

}
