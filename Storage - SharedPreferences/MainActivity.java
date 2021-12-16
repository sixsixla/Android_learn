package edu.hdu.android.sharedpreferences;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText name,collage;
    private CheckBox cbWork,cbMarry;
    // 声明要保存的文件名为table.xml、SharedPreferences、SharedPreferences.Editor
    ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取SharedPreferences的实例，同时创建table.xml文件
        ...
        // 获取SharedPreferences.Editor的实例
        ...

        name = (EditText)findViewById(R.id.editText1);
        collage = (EditText)findViewById(R.id.editText2);
        cbWork = (CheckBox)findViewById(R.id.checkBox1);
        cbMarry = (CheckBox)findViewById(R.id.checkBox2);

        // 获取table.xml中数据，并对widgets进行赋值
        name.setText(...);
        collage.setText(...);
        cbWork.setChecked(...);
        cbMarry.setChecked(...);
    }

    // app被停止时保存数据
    ...
}
