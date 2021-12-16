package edu.hdu.android.bindservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btn1,btn2,btn3;
    private MyBindService.MyBinder myBinder;
    private MyConn conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //绑定服务
            case R.id.button1:
                if (conn == null) {
                    conn = ...
                }
                Intent intent = ...
                ...
                break;
            //调用服务中的方法
            case R.id.button2:
                ...
                break;
            //解除绑定
            case R.id.button3:
                if (conn != null) {
                    ...
                    conn = null;
                }
                break;
            default:
                break;
        }
    }
    // 创建MyConn类，用于实现连接服务
    private class MyConn implements ... {
        //成功绑定到服务时调用的方法
        @Override
        public void ...(ComponentName componentName, IBinder iBinder) {
            myBinder = ...
            Log.v("MainActivity","服务绑定成功");
        }
    }
}
