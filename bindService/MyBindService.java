package edu.hdu.android.bindservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyBindService extends Service {

    //创建服务的代理，调用服务中的方法
    class MyBinder extends ... {
        public void test(){
            customMethod();
        }
    }
    //自定义方法
    private void customMethod() {
        Log.v("test_bindService","自定义的customMethod()方法");
    }

    // 创建服务
    @Override
    public void ...() {
        Log.v("test_bindService",...);
        super....;
    }

    // 绑定服务
    @Override
    public ...(Intent intent) {
        Log.v("test_bindService",...);
        return ...;
    }

    // 解除绑定
    @Override
    public boolean ...(Intent intent) {
        Log.v("test_bindService",...);
        return super....;
    }

}
