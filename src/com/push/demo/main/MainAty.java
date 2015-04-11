package com.push.demo.main;

import com.push.demo.device.Bluetooth;
import com.push.demo.device.Wifi;

import android.app.Activity;
import android.os.Bundle;

public class MainAty extends Activity {
	private Wifi mWifi = null;
	private Bluetooth mBluetooth = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mWifi = new Wifi();
		//���������Ŀ
		mBluetooth = new Bluetooth();
	}

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
