package hdu.course.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends Activity {
    //定义名字数组
    private String[] name={"张三","王五","赵六"};
    //定义描述任务数组
    private String[] desc={"唱歌","跳舞","打球"};
    //定义头像数组
    private int[] icon=new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(...);
        ListView listView = (ListView)findViewById(R.id.listview1);

        //创建一个list集合，list集合的元素是MAP
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        for(int i = 0; i < name.length; i++) {
            Map<String, Object> listitem=new HashMap<String, Object>();
            listitem.put(...);
            listitem.put(...);
            listitem.put(...);
            list.add(...);
        }

        //创建一个SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(...);

        //为listView设置adapter
        listView....;
    }
}
