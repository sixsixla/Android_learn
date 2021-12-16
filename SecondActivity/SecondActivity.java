package hdu.course.android.secondactivity;


import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(...);

        TextView textview = ...

        Intent myintent = ... //获取Activity传递的Intent

        Bundle mybundle = ... //获取Intent的Bundle对象，该对象记录了传送的数据值

        String selectedRadioButton = ... // 获取存放在Bundle对象中的字符串

        if (selected_radiobutton == ...) // 处理“未选择”的情况，显示“没有任何OS被选择”
            ...
        else
            ... // 显示“...”被选择
    }

    public void onClickBack(View view) {
        finish(); /* 关闭当前Activity */
    }
}
