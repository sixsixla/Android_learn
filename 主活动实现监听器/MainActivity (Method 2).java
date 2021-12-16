package edu.hdu.android.event;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity /* implement OnClickListener */ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button1);
        Button btn2 = /* Get Button2 */
        Button btn3 = /* Get Button3 */

        btn1.setOnClickListener(this);
        /* bind OnClickListener to btn2 */
        /* bind OnClickListener to btn3 */
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(MainActivity.this,"Button 1 clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                /* Show toast message of "Button 2 clicked" */
                break;
            case R.id.button3:
                /* Show toast message of "Button 3 clicked" */
                break;
            default:
                break;
        }
    }
}
