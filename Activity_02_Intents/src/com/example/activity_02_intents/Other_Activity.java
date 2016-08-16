package com.example.activity_02_intents;

import org.w3c.dom.Text;

import com.example.activity_02_intents.R.id;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts.Intents;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.telephony.gsm.SmsManager;
import android.telephony.gsm.SmsMessage;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class Other_Activity extends Activity {
	private TextView textView = null;
	Button btn= null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		
		textView = (TextView) findViewById(R.id.textView1);
		btn=(Button)findViewById(id.btn);
		textView.setText("����Other");
		btn.setText("����Main");

		btn.setOnClickListener((android.view.View.OnClickListener) new clickListener());
		
	}
	
	 class clickListener implements View.OnClickListener{
		 @Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent intent =new Intent();
				intent.setClass(Other_Activity.this, MainActivity.class);
				//startActivity(intent);
				Other_Activity.this.startActivity(intent);
		}
	}
	 
	 public void OpenNew(View v){
		    /*Intent intent =new Intent(Other_Activity.this,MainActivity.class);
		    intent.putExtra("testname", "123");
		    startActivity(intent);    */
		 Uri uri = Uri.parse("smsto://18483639574");
		 Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
		 intent.putExtra("sms_body", "123456");
		 startActivity(intent);
		    }

}
