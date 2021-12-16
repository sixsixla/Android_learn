package edu.hdu.android.event;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button1);
        Button btn2 = /* Get Button2 */
        Button btn3 = /* Get Button3 */

        btn1.setOnClickListener(/* Create OnClickListener object using inner class */);
        /* bind OnClickListener to btn2 */
        /* bind OnClickListener to btn3 */

    }

    class Button1Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"Button 1 clicked",Toast.LENGTH_SHORT).show();

        }
    }

    /* Define inner class of OnClickListener for Button2 */

    /* Define inner class of OnClickListener for Button3 */

}
