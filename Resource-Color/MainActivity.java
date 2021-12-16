package edu.hdu.android.color;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView)findViewById(R.id.text1);
        TextView tv2 = (TextView)findViewById(R.id.text2);
        TextView tv3 = (TextView)findViewById(R.id.text3);
        TextView tv4 = (TextView)findViewById(R.id.text4);

        tv1.setTextColor(...);
        tv2.setTextColor(...);
        tv3.setTextColor(...);
        tv4.setTextColor(...);
    }
}
