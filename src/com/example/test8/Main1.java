package com.example.test8;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Main1 extends Activity {

	
	private TextView show;
	
	private ImageView n1;
	private ImageView n2;
	private ImageView n3;
	private ImageView n4;
	private ImageView n5;
	private ImageView n6;
	private ImageView n7;
	private ImageView n8;
	private ImageView n9;
	private ImageView n0;
	
	private ImageView nf1;
	private ImageView nf2;
	private ImageView nf3;
	private ImageView nf4;
	private ImageView nf5;
	private ImageView nf6;
	
	
	private int V1;
	private String F;
	private int V2;
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main1);
		
		
		n1=(ImageView) findViewById(R.id.n1);
		n2=(ImageView) findViewById(R.id.n2);
		n3=(ImageView) findViewById(R.id.n3);
		n4=(ImageView) findViewById(R.id.n4);
		n5=(ImageView) findViewById(R.id.n5);
		n6=(ImageView) findViewById(R.id.n6);
		n7=(ImageView) findViewById(R.id.n7);
		n8=(ImageView) findViewById(R.id.n8);
		n9=(ImageView) findViewById(R.id.n9);
		n0=(ImageView) findViewById(R.id.n0);
		
		
		nf1=(ImageView) findViewById(R.id.nf1);
		nf2=(ImageView) findViewById(R.id.nf2);
		nf3=(ImageView) findViewById(R.id.nf3);
		nf4=(ImageView) findViewById(R.id.nf4);
		nf5=(ImageView) findViewById(R.id.nf5);
		nf6=(ImageView) findViewById(R.id.nf6);
		
		show=(TextView) findViewById(R.id.show);
		
		
		
		
		
		n1.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"1");
				
				//startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"+ "09351101527")));
				
			}
		});
		
		n2.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"2");
			}
		});
		
		n3.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				show.setText(show.getText()+"3");
				
			}
		});
		
		n4.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				show.setText(show.getText()+"4");
			}
		});
		
		n5.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"5");
			}
		});
		
		n6.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"6");
			}
		});
		
		n7.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"7");
			}
		});
		
		n8.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"8");
			}
		});
		
		n9.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"9");
			}
		});
		
		n0.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				show.setText(show.getText()+"0");
			}
		});
		
		
		
		
		nf1.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				V1=Integer.parseInt(show.getText().toString());
				F="+";
				show.setText("");
			}
		});
		
		nf2.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				V1=Integer.parseInt(show.getText().toString());
				F="-";
				show.setText("");
			}
		});
		
		nf3.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				V1=Integer.parseInt(show.getText().toString());
				F="*";
				show.setText("");
				
			}
		});
		
		nf4.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				V1=Integer.parseInt(show.getText().toString());
				F="/";
				show.setText("");
			}
		});
		
		
		nf5.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				
				if(F !="" && show.getText().toString()!=""){	
				int res=0;
				V2=Integer.parseInt(show.getText().toString());
				show.setText("");
				
				
				if(F=="+"){
					
					res=V1+V2;
				}
				
				
				if(F=="-"){
					
					res=V1-V2;
				}
				
				if(F=="*"){
					
					res=V1*V2;
				}

				if(F=="/"){
	
					res=V1/V2;
				}
				
				
				show.setText(res+"");
				}
				
				
			}
		});
		
		
		
		
		nf6.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0) {
				
				temp.in=Integer.parseInt(show.getText().toString());
				
				Intent next=new Intent(Main1.this,Main2.class);
				startActivity(next);
				
				
			}
		});
		
		
		
	}



	
	protected void onResume() {
		
		super.onResume();
		if(temp.sw==true){
			
			show.setText(temp.out+"");
			
		}
		
		
	}

	
	
	

}
