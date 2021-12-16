package edu.hdu.android.file;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends Activity implements View.OnClickListener {

    public EditText username,passwd;
    public Button save,show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    // 组件初始化
    public void init(){
        username = (EditText)findViewById(R.id.username);
        passwd = (EditText)findViewById(R.id.password);
        save = (Button)findViewById(R.id.save);
        show = (Button)findViewById(R.id.show);

        //为按钮添加监听
        save....;
        show....;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.save_mes:
                //获取输入的账号和密码
                String user_str = username.getText().toString();
                String passwd_str = passwd.getText().toString();
                String user_mes = "用户名为：" + user_str + "\n" + "密码为：" + passwd_str;
                FileOutputStream fi_out;
                try {
                    // 保存输入的数据
                    fi_out = ...
                    fi_out....
                    // 关闭输出流
                    fi_out....
                }catch (Exception e){
                    e.printStackTrace();
                }
                Toast.makeText(this,"用户信息已保存",Toast.LENGTH_SHORT).show();
                break;
            case R.id.show_mes:
                // 读取信息
                String mes="";
                try {
                    FileInputStream fi_input;
                    fi_input = ...
                    byte[] buffer = ...
                    fi_input....
                    mes = new String(buffer);
                    // 关闭输入流
                    fi_input....;
                }catch (Exception e){
                    e.printStackTrace();
                }
                // 将读取的信息显示为Toast消息

                break;
            default:
                break;
        }
    }
}
