package edu.hdu.android.readcontacts;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取ContentResolver对象
        ContentResolver cr = ...
        // 获取电话本中开始一项的游标
        Cursor cursor = cr....(..., null, null, null, null);

        List<String> string = new ArrayList<String>();
        // 通过移动游标遍历联系人记录
        while (cursor.....) {
            //取得联系人名字
            int nameFieldColumnIndex = cursor.getColumnIndex(ContactsContract.PhoneLookup.DISPLAY_NAME);
            String contact = cursor.getString(nameFieldColumnIndex);
            //取得电话号码
            String ContactId = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
            Cursor phone = cr....(...., null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=" + ContactId, null, null);
            // 遍历该联系人的多个电话号码
            while (phone.moveToNext()) {
                String PhoneNumber = phone.getString(phone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                string.add(....);
            }
        }
        // 关闭游标
        cursor.close();

        // 获取定义的ListView用来显示通讯录信息
        ListView listView = ...
        listView....
    }
}
