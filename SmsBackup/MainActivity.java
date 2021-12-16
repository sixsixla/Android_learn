package edu.hdu.android.smsbackup;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 使用查询所有短信的uri
                Uri uri= ...
                //获取ContentResolver对象
                ContentResolver contentResolver = ...
                // 通过ContentResolver对象查询系统短信
                Cursor cursor=contentResolver....(..., new String[]{"address","date","type","body"},null,null,null);
                List<SmsInfo> list = ...
                while (...){
                    String address = cursor.getString(0);
                    long date = cursor.getLong(1);
                    int type = cursor.getInt(2);
                    String body = cursor.getString(3);
                    SmsInfo smsInfo = ...
                    list....
                }
                cursor.close();
                Sms_Xml...
            }
        });
    }
}
