package com.example.test8;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main2 extends Activity{

	
	
	private Button btn;
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		
		btn=(Button) findViewById(R.id.btnsin);
		
		
		btn.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				double p=Math.sin(Double.parseDouble(temp.in+""));
				
				fact(5);
				temp.out=p;
				temp.sw=true;
				
				finish();
			}
		});
		
		
		
		
	}

	private int fact(int a){
		
		
		
		
		return 1;
	}
	
	
	
}
