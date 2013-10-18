package com.twincoders.custombuttondemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button okButton = (Button) findViewById(R.id.ok_button);
		Button cancelButton = (Button) findViewById(R.id.cancel_button);
		okButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onOkButtonPressed();
			}
		});
		cancelButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onCancelButtonPressed();
			}
		});
	}
	
	void onOkButtonPressed() {
		Toast.makeText(this, "OK button pressed", Toast.LENGTH_LONG).show();
	}
	
	void onCancelButtonPressed() {
		Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_LONG).show();
	}

}
