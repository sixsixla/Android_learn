package edu.hdu.android.sysresource;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView)findViewById(R.id.imageView1);
        // 图片背景设置为音乐暂停键
        iv.setBackgroundResource(...);

        TextView tv = (TextView)findViewById(R.id.textView1);
        // 字体颜色设置为深绿色
        tv.setTextColor(...);

        Button b = (Button)findViewById(R.id.button1);
        // 按钮文字设置为“拷贝”
        b.setText(...);
    }
}
