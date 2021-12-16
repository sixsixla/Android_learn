package edu.hdu.android.smslistener;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView mes_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.show_mes);

        //为content://sms的数据改变注册监听器
        ContentResolver contentResolver = ...
        Uri uri= ...
        contentResolver....(...,true, new SmsObsever(new Handler()));
    }
    //自定义的ContentObserver监听器类
    private class SmsObsever extends ContentObserver {
        public SmsObsever(Handler handler) {
            super(handler);
        }

        @Override
        public void ...(boolean selfChange) {
            // 查询发件箱中的短信。注：可使用"content://sms/inbox"
            Cursor cursor = ...
            // 遍历查询的结果集
            while (...){
                String address = ...
                String body = ...
                String time = ...
                textView....
            }
            cursor.close();
        }
    }

}
