package edu.hdu.android.httpurlconnection;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.InputStream;
import java.net.*;

public class MainActivity extends Activity {
    private ImageView iv;
    private Button show_btn;
    private EditText path_edit;
    //定义获取到图片和失败的状态码
    protected static final int SUCCESS=1;
    protected static final int ERROR=2;
    //创建消息处理器handler
    private Handler handler = new Handler(){
        public void ... {
            if (...) {
                Bitmap bitmap = ...;
                // 显示图片
                ...
            } else if (...) {
                Toast.makeText(MainActivity.this, "显示图片错误", Toast.LENGTH_SHORT).show();
            }
        }
    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    
    //组件初始化
    private void init(){
        iv = (ImageView)findViewById(R.id.images);
        show_btn = (Button)findViewById(R.id.get_show);
        path_edit = (EditText)findViewById(R.id.address);
        
        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获取输入的网络图片地址
                final String path = path_edit.getText().toString().trim();
                if (TextUtils.isEmpty(path)){
                    Toast.makeText(MainActivity.this,"图片路径不能为空",Toast.LENGTH_SHORT).show();
                } else {
                    //使用子线程访问网络，因为网络请求耗时，在4.0以后就不能放在主线程中了
                    ... thread = new ... {
                        private HttpURLConnection conn;
                        private Bitmap bitmap;

                        public void ...() {
                            //连接服务器GET请求
                            try {
                                URL url = ...;
                                //根据url发送http的请求
                                conn = ...
                                //设置请求的方式
                                conn....
                                //设置超时时间
                                conn.setConnectTimeout(5000);

                                //得到服务器返回的响应码
                                int state = conn....

                                if (state == 200) {
                                    //请求网络成功，获取输入流
                                    InputStream in = conn....
                                    //将流转换为Bitmap对象
                                    bitmap = BitmapFactory.decodeStream(in);
                                    //告诉消息处理器显示图片
                                    Message msg = ...
                                    // 设置msg的标志和数据
                                    msg....
                                    msg....
                                    // 向消息处理器handler发送消息
                                    handler....
                                } else {
                                    //请求网络失败，提示用户
                                    Message msg = ...
                                    msg...
                                    handler....
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                Message msg = ...
                                msg....
                                handler....
                            }
                        }
                    };

                    // 启动子线程
                    thread...
                }
            }
        });
    }
}
