package hdu.course.android.bytedancenews;

import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import okhttp3.Cache;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends Activity {

    private List<News> list;
    private NewsAdapter newsAdapter;
    private RecyclerView recyclerView;
    private OkHttpClient client;
    private String date;
    private Request request;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch (msg.what) {
            case 1:
                Toast.makeText(MainActivity.this, "" + date, Toast.LENGTH_LONG).show();
                break;
            case 2:
                String str = (String) msg.obj;
                // 使用Gson解析HTTP Response
                NewsResponse newsResponse = new Gson().fromJson(str, new TypeToken<NewsResponse>(){}.getType());
                // 从解析结果中获取News列表
                ... data =
                // 创建适配器
                newsAdapter = ...
                //布局管理器
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                        LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                //分割线
                recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                        DividerItemDecoration.VERTICAL));

                // 为RecyclerView设置适配器
                ...
                break;
        }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = ...
        list = new ArrayList<>();
        initData();
    }

    private void initData() {
        int cachesize = 10 * 1024 * 1024;
        Cache cache = new Cache(getCacheDir(), cachesize);
        // 初始化OkHttpClient
        OkHttpClient client = ...
                .cache(cache)
                ....

        // 创建一个HTTP Request对象
        request = ...
                .url(...)
                ....

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                handler.sendEmptyMessage(1);
            }

            // HTTP请求成功，发送Message让Handler执行
            @Override
            public void onResponse(okhttp3.Call call, final Response response) throws IOException {
                String responseData = response.body().string();
                ...
            }
        });
    }
}