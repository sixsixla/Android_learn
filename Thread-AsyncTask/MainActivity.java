package hdu.course.anroid.asynctask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends Activity {

    private ImageView mImageView = null;
    private ProgressBar mProgressBar = null;
    private String URL = "...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //实例化控件
        this.mImageView = (ImageView) findViewById(R.id.imageView1);
        this.mProgressBar = (ProgressBar) findViewById(R.id.progressBar1);

        //实例化异步任务
        ImageDownloadTask task = new ImageDownloadTask();

        //执行异步任务
        task...
    }

    class ImageDownloadTask extends ... {

        @Override
        protected ... doInBackground(String... params) {
            Bitmap bitmap = null;    //待返回的结果
            String url = params[0];  //获取URL
            URLConnection connection;   //网络连接对象
            InputStream is;    //数据输入流

            try {
                connection = new URL(url).openConnection();
                is = connection....   //获取输入流
                BufferedInputStream buf = new BufferedInputStream(is);
                //解析输入流
                bitmap = BitmapFactory.decodeStream(buf);
                is.close();
                buf.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //返回给后面调用的方法
            return ...
        }

        @Override
        protected void onPreExecute() {
            // 显示等待圆环
            ...
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            // 下载完毕，隐藏等待圆环
            ...
            // 显示图片
            ...
        }
    }
}
