package com.push.demo.app;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class Services extends Service{
	public  ServiceBinder mIBinder=new ServiceBinder();
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
	}
	

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return mIBinder;
	}
	

	
	public class ServiceBinder extends Binder {
        public Services getService() {
            return Services.this;
        }
}
}
