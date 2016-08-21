package com.example.contrl_processbar;

import com.example.contrl_processbar.R.id;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.opengl.Visibility;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivity extends Activity {

	private ProgressBar firstbar = null;
	private ProgressBar secondbar = null;
	private Button begin = null;
	int i=0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        firstbar = (ProgressBar) findViewById(id.firstBar);
        secondbar = (ProgressBar) findViewById(id.secondBar);
        begin = (Button) findViewById(id.begin);
        begin.setOnClickListener(new OnClick());
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
    
    class OnClick implements View.OnClickListener{
    	@Override
    	public void onClick(View v) {
    		// TODO Auto-generated method stub
    		
    		if (i == 0) {
				 firstbar.setVisibility(View.VISIBLE);
				 secondbar.setVisibility(View.VISIBLE);
			}
    		else if (i<100) {
				firstbar.setProgress(i);
				firstbar.setSecondaryProgress(i+10);
			}
    		else {
				//firstbar.setVisibility(View.GONE);
				//secondbar.setVisibility(View.GONE);
			}
    		if(i != 100)
    		{
    			i=i+10;
    		}
    		else 
    		{
    			i=0;
    		}
    	}
    }
}
