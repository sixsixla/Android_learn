package hdu.course.android.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Activity1","onCreate()");
    }

    public void click(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    // Activity1可见时调用的方法

    // Activity1再次可见时调用的方法

    // Activity1获取到焦点时调用的方法

    // Activity1失去焦点时调用的方法

    // Activity1不可见时调用的方法

    // Activity1被销毁时调用的方法

}
