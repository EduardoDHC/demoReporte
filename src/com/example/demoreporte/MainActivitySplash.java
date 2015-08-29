package com.example.demoreporte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivitySplash extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		lanzarThread();
	}

	public void lanzarThread(){
		Thread hilo = new Thread(){
			public void run(){
				try{
					sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent menuPrincipal = new Intent( MainActivitySplash.this,MainActivity.class);
					startActivity(menuPrincipal);
				}
			}
		};
		hilo.start();
	}
}
