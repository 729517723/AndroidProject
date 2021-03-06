package com.example.activity_02_intents;

import com.example.activity_02_intents.R.id;
import com.example.activity_02_intents.R.string;

import android.app.Activity;
//import android.content.DialogInterface;
//import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;//注意view的大小写

public class MainActivity extends Activity {
	private Button myButton = null;
	TextView tv=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.button);
        tv=(TextView)findViewById(id.textView1);
        tv.setText("这是Main");
        Intent intent = getIntent();
	     String val = intent.getStringExtra("testname");
	     tv.setText(val);
        myButton.setText("转到Other");
        
       
        //myButton.setOnClickListener((android.view.View.OnClickListener) new MyButtonListen());
        myButton.setOnClickListener(new MyButtonListen());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public class MyButtonListen implements View.OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(MainActivity.this,Other_Activity.class);
			startActivity(intent);
		}
		
    }
}
