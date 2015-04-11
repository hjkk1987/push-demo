package com.push.demo.main;

import com.push.demo.app.Services;
import com.push.demo.app.Services.ServiceBinder;
import com.push.demo.device.Bluetooth;
import com.push.demo.device.Wifi;
import com.push.demo.view.PlayInter;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

public class MainAty extends Activity {
	private Wifi mWifi = null;
	private Bluetooth mBluetooth = null;
	private PlayInter mPlay = null;
	private Services mServices = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		mWifi = new Wifi();

		// ÃÌº”¿∂—¿œÓƒø
		mBluetooth = new Bluetooth();
		mPlay = new PlayInter();
		Intent intent = new Intent(MainAty.this, Services.class);
		bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
	}

	ServiceConnection mServiceConnection = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			mServices = null;
		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			ServiceBinder mBinder = (ServiceBinder) service;
			mServices = mBinder.getService();
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
		unbindService(mServiceConnection);
	}

}
