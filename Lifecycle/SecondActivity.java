package hdu.course.android.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Log.i("Activity2","onCreate()");
    }

    // Activity2可见时调用的方法

    // Activity2再次可见时调用的方法

    // Activity2获取到焦点时调用的方法

    // Activity2失去焦点时调用的方法

    // Activity2不可见时调用的方法

    // Activity2被销毁时调用的方法

}
