package com.push.demo.main;


import com.push.demo.app.Services;
import com.push.demo.app.Services.ServiceBinder;
import com.push.demo.device.Bluetooth;
import com.push.demo.device.Wifi;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

public class MainAty extends Activity {
	private Wifi mWifi = null;
	private Services mServices = null;
	private Bluetooth mBluetooth = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		mWifi = new Wifi();
		Intent intent = new Intent(MainAty.this, Services.class);
		bindService(intent, mConnect, Context.BIND_AUTO_CREATE);


		//ÃÌº”¿∂—¿œÓƒø
		mBluetooth = new Bluetooth();
	}

	private ServiceConnection mConnect = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			mServices = null;
		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			ServiceBinder Ibinder = (ServiceBinder) service;
			mServices = Ibinder.getService();

		}
	};

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mWifi = null;
	}

}
