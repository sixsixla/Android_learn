package edu.hdu.android.startservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void ...() {
        super....();
        Log.v("test_Service",...);
    }

    @Override
    public int ...(Intent intent, int flags, int startId) {
        Log.v("test_Service",...);
        return super....(intent, flags, startId);
    }
    
    @Override
    public void ...() {
        Log.v("test_Service",...);
        super....;
    }
}
