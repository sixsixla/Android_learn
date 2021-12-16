package hdu.course.android.secondactivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends Activity {

    RadioButton radioButton1,radioButton2,radioButton3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(...);

        // 获取单选框视图组件的对象实例
        radioButton1 = ...
        radioButton2 = ...
        radioButton3 = ...
    }

    public void onClickSubmit(View view) {

        Intent myIntent = ... /* 新建Intent对象 */
        myIntent.setClass(MainActivity.this, ... /* 指定要启动的Activity */ );

        Bundle myBundle = ... /* 创建Bundle对象，用于存放要被传送的数据 */

        if(radioButton1.isChecked())
            myBundle.... /* 如果radioButton1被选中，在Bundle对象中存放radioButton1对应的字符串 */
        else if (radioButton2.isChecked())
            ...
        else if (radioButton3.isChecked())
            ...
        else
            ... /* 如果没有选中任何RadioButton，在Bundle对象中存放字符串“未选择” */

        myIntent.putExtras(... /* 将Bundle对象放到Intent对象中 */);

        startActivity(... /* 启动目标Activity，并将Intent对象传给它 */);
    }
}
