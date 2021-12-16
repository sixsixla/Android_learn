package edu.hdu.android.autocompletetextview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

    private static final String[] phonenumberStr = new String[]    { "88888888", "88123456", "88800000", "85668888", "7777777", "86666666","7377777" };

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // 设置界面布局
        ...

        // 以phonenumberStr字符串数组生成 ArrayAdapter对象
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, phonenumberStr);

        // 获取AutoCompleteTextView对象
        ...

        // 通过setAdapter()来读取ArrayAdapter里的数据
        autoCompleteTextView.setAdapter(adapter);
    }

}
