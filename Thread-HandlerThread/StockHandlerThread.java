package hdu.course.android.handlerthread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public class StockHandlerThread extends ... implements Handler.Callback {

    public static int MSG_QUERY = 1;
    private Handler handler;

    public StockHandlerThread() {
        super("stock");
    }

    @Override
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        
        // 用getLooper()获取looper对象，用于新建handler
        handler = ...
        // 发送表示开始查询的消息
        handler....
    }

    @Override
    public boolean ...(...) {
        Log.i("stock-handlerthread", "handleMessage thread: " +Thread.currentThread());

        // 如果是开始查询的消息
        if (...) {

            Log.i("stock-handlerthread", "Got some results ");

            // 发送5秒后执行下一次查询的消息
            handler...

            return false;
        }

        return true;
    }

}
