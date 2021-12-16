package edu.hdu.android.startservice;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button start_btn,stop_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_btn = findViewById(R.id.start);
        stop_btn = findViewById(R.id.stop);
        start_btn.setOnClickListener(this);
        stop_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //开启服务
            case R.id.start:
                Intent intent1 ...
                ...
                break;
            //关闭服务
            case R.id.stop:
                Intent intent2 = ...
                ...
                break;
            default:
                break;
        }
    }
}
