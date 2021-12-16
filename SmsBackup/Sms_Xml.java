package edu.hdu.android.smsbackup;

import android.content.Context;
import android.os.Environment;
import android.util.Xml;
import android.view.View;
import android.widget.Toast;

import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

class Sms_Xml {
    // 将短信保存在sd卡下的mes.xml文件下
    public static void smsBackup(List<SmsInfo> list){ 
        try{
            XmlSerializer serial= Xml.newSerializer();
            File file = ...
            FileOutputStream fi_out = ...
            // 初始化序列号器，指定xml数据写入到哪个文件以及编码
            serial.setOutput(fi_out,"utf-8");
            serial.startDocument("utf-8",true);
            // 根节点
            serial.startTag(null,"smss");
            for (SmsInfo info : list){
                // 构建父节点<sms>
                serial....(null,"sms");
                serial....(null,"id", info....); // 设置父节点<sms>的id属性
                // <body>子节点
                serial....(null,"body"); // <body>起始标签
                serial....(info.....);   // <body>标签的内容
                serial....(null,"body"); // <body>结束标签
                // <address>子节点
                ...
                // <type>子节点
                ...
                // <date>子节点
                ...
                // 结束<sms>父节点
                serial....(null,"sms");
            }
            serial.endTag(null,"smss");
            serial.endDocument();
            // 关闭文件输出流
            fi_out....
            Toast.makeText(...,"短信备份成功",Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(...,"短信备份失败",Toast.LENGTH_SHORT).show();
        }
    }
}
