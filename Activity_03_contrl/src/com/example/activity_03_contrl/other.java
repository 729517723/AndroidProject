package com.example.activity_03_contrl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class other extends Activity{
	TextView result;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	
	String str1,str2;
	int a;
	setContentView(R.layout.other);
	result = (TextView) findViewById(R.id.result);
	
	Intent intent = getIntent();
	
	str1=intent.getStringExtra("one");
	str2=intent.getStringExtra("two");
	a=Integer.parseInt(str1)*Integer.parseInt(str2);
	result.setText(a+"");
}
}
