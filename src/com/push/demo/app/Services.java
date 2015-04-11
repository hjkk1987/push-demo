package com.push.demo.app;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class Services extends Service {
	private ServiceBinder IBinder = new ServiceBinder();

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return IBinder;
	}

	public class ServiceBinder extends Binder {
		public Services getServices() {
			return Services.this;
		}

	};
}
