package hdu.course.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(...);

        Button button=(Button)findViewById(R.id.dialog);
        //按钮添加点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //设置对话框标题
                new ...(MainActivity.this)
                    ....("Warning") // "系统提示"
                    ....("Please save all data before exit")  //设置显示的内容
                    ....("Confirm",new DialogInterface.OnClickListener() { //添加确定按钮
                        public void onClick(DialogInterface dialog, int which) {//确定按钮的响应事件
                            finish();
                        }
                    })
                    ....("Cancel",new DialogInterface.OnClickListener() {  //添加返回按钮
                        public void onClick(DialogInterface dialog, int which) {//响应事件
                        }
                    })
                    ...;//显示此对话框
            }
        });
    }
}
