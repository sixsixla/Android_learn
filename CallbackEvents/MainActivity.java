package hdu.course.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //响应按键按下事件
    public boolean ...(int keyCode, KeyEvent event) {
        // 显示Toast消息"按键已经按下了！"
        ...
        return super.onKeyDown(keyCode, event);
    }

    //响应按键松开事件
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        // 显示Toast消息"按键松开了！"
        ...
        return super.onKeyDown(keyCode, event);
    }

    //响应屏幕触摸操作
    public boolean onTouchEvent( MotionEvent event) {
        // 显示Toast消息"屏幕被触摸！"
        ...
        return super.onTouchEvent(event);
    }
}
