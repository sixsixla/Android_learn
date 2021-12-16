package edu.hdu.android.sdcard;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends Activity {

    private EditText message;
    private Button write;
    private Button read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (EditText)findViewById(R.id.editText1);
        write = (Button)findViewById(R.id.button1);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 判断SDCard是否处于挂载状态
                if(...){
                    // 获取SDCard目录
                    File SDCard = ...
                    // 定义文件名称
                    File file = ...
                    FileOutputStream outStream;
                    try {
                        // 定义文件输出流
                        outStream = ...
                        try {
                            // 写入文件
                            outStream....
                            // 关闭输出流
                            outStream....
                        } catch (IOException e) {
                            Toast.makeText(MainActivity.this,"写入文件错误",Toast.LENGTH_SHORT).show();
                            e.printStackTrace();
                        }

                        Toast.makeText(MainActivity.this,"保存成功",Toast.LENGTH_SHORT).show();
                    } catch (FileNotFoundException e) {
                        Toast.makeText(MainActivity.this,"创建文件错误",Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(MainActivity.this,"没有找到SD卡",Toast.LENGTH_SHORT).show();
                }
            }
        });

        read = (Button)findViewById(R.id.button2);
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 判断SDCard是否处于挂载状态
                if(...){
                    // 获取SDCard目录
                    File SDCard = ...
                    // 定义文件名称
                    File file = ...
                    FileInputStream inStream;
                    String str = "";
                    try {
                        // 读取数据
                        inStream = ...
                        BufferedReader buff_reader = ...
                        str = ...
                        // 关闭输入流
                        inStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Toast.makeText(MainActivity.this,"读取SD卡内容：" + str,Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,"没有找到SD卡",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
