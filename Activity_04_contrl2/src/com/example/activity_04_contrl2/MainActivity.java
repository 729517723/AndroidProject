package com.example.activity_04_contrl2;

import com.example.activity_04_contrl2.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {

	private RadioGroup group = null;
	private RadioButton manRadioButton = null;
	private RadioButton womanRadioButton = null;
	private CheckBox swCheckBox = null;
	private CheckBox runCheckBox = null;
	private CheckBox rdCheckBox = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        group = (RadioGroup) findViewById(R.id.RadioGroup1);
        manRadioButton = (RadioButton) findViewById(id.RB_Man);
        womanRadioButton = (RadioButton) findViewById(id.RB_Women);
        swCheckBox = (CheckBox) findViewById(id.CB_SW);
        runCheckBox = (CheckBox) findViewById(id.CB_RUN );
        rdCheckBox = (CheckBox) findViewById(id.CB_RD);
        
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if (manRadioButton.getId() == checkedId) {
					System.out.println("man");
					Toast.makeText(MainActivity.this, "man",Toast.LENGTH_LONG).show();
					
				} else {
					System.out.println("woman");
					Toast.makeText(MainActivity.this, "woman",Toast.LENGTH_LONG).show();
				}
				
			}
		});
        
        swCheckBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					System.out.println("swCheckBox checked!!");
				} else {
					System.out.println("swCheckBox not checked!!");
				}
			}
		});
        
        runCheckBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					System.out.println("runCheckBox checked!!");
				} else {
					System.out.println("runCheckBox not checked!!");
				}
			}
		});
        
        rdCheckBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) {
					System.out.println("rdCheckBox checked!!");
				} else {
					System.out.println("rdCheckBox not checked!!");
				}
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
    	menu.add(0, 1, 1, "about");
    	menu.add(0, 2, 2, "exit");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       if (item.getItemId() == 1) {
		Toast.makeText(MainActivity.this, "about is aready opened", Toast.LENGTH_LONG).show();
	} else {
		finish();
	}
        return super.onOptionsItemSelected(item);
    }
}
