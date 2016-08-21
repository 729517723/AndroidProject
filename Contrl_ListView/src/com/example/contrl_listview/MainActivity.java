package com.example.contrl_listview;

import java.util.ArrayList;
import java.util.HashMap;

import android.R.id;
import android.R.integer;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;


public class MainActivity extends ListActivity {

	 HashMap<String, String> map1 = new HashMap<String, String>();
     HashMap<String, String> map2 = new HashMap<String, String>();
     HashMap<String, String> map3 = new HashMap<String, String>();
     HashMap<String, String> maptemp = new HashMap<String, String>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        System.out.println("sss");
        
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
        int i=0;
       
        
        map1.put("user_name", "xiaomin");
        map1.put("user_ip", "192.168.1.1");
        map2.put("user_name", "xiaohong");
        map2.put("user_ip", "192.168.1.2");
        map3.put("user_name", "xiaoli");
        map3.put("user_ip", "192.168.1.3");
        
        System.out.println("sss");
        
        list.add(map1);
        list.add(map2);
        list.add(map3);
        
        for (i=0;i<3;i++) {
        	maptemp = list.get(i);
        	System.out.println(maptemp.get("user_name")+"    "+maptemp.get("user_ip"));
		}
        
        
        SimpleAdapter smAdapter = new SimpleAdapter(this, list,R.layout.user, new String[]{"user_name","user_ip"}, new int[] {R.id.user_name,R.id.user_ip} );
        this.setListAdapter(smAdapter);
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
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	// TODO Auto-generated method stub
    	super.onListItemClick(l, v, position, id);
    	if (id == 0) {
    		System.out.println(map1.get("user_name"));
    		System.out.println(map1.get("user_ip"));
    		Toast.makeText(this,map1.get("user_name")+"   "+map1.get("user_ip"), Toast.LENGTH_LONG).show();
		} else if (id == 1){
			System.out.println(map2.get("user_name"));
		    System.out.println(map2.get("user_ip"));
		    Toast.makeText(this,map2.get("user_name")+"   "+map2.get("user_ip"), Toast.LENGTH_LONG).show();
		} 
		else {
			System.out.println(map3.get("user_name"));
		    System.out.println(map3.get("user_ip"));
		    Toast.makeText(this,map3.get("user_name")+"   "+map3.get("user_ip"), Toast.LENGTH_LONG).show();
		}	
    }
}
