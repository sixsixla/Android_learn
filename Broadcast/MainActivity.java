package edu.hdu.android.intentreceiver;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button1);

        // 动态注册广播（BatteryReceiver）
        BatteryReceiver batteryReceiver = ...;
        IntentFilter intentFilter = ...;
        intentFilter....;
        this.....

        // 动态注册广播（SmsReceiver）
        ...

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 发送广播给Receiver
                ...
            }
        });
    }
}
