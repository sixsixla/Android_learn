package hdu.course.android.handlerthread;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private StockHandlerThread stockHandlerThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);

        // 新建StockHandlerThread
        stockHandlerThread = ...
        // 启动stockHandlerThread
        stockHandlerThread....
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // 关闭stockHandlerThread
        stockHandlerThread.quit();
    }
}