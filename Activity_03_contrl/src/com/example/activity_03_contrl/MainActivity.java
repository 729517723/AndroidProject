package com.example.activity_03_contrl;

import android.R.id;
import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	private EditText first,second;
	private Button culButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        culButton = (Button) findViewById(R.id.button1);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	menu.add(0, 1, 1, R.string.about);
    	menu.add(0, 2, 2, R.string.exit);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (item.getItemId()==2) {
			finish();
		}
        else {
			Intent intent = new Intent(MainActivity.this, about.class);
			startActivity(intent);
		}
        return super.onOptionsItemSelected(item);
    }
    
 
    public void OnClick(View v)
    {
    	Intent intent = new Intent(MainActivity.this, other.class);
    	TextView textView = (TextView) findViewById(R.id.textView2);
    	
    	String str1,str2;
    	str1 = first.getText().toString();
    	str2 = second.getText().toString();
    	
    	intent.putExtra("one", str1);
    	intent.putExtra("two", str2);
    	
    	textView.setText("����ǣ�"+Integer.parseInt(str1)*Integer.parseInt(str2));
    	
    	startActivity(intent);
    }
    
}
