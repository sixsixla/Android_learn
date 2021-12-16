package edu.hdu.android.mediaplayersound;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener, OnCompletionListener, OnPreparedListener {

    private Button src,sd,stop,pause;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        src = (Button)findViewById(R.id.src);
        sd = (Button)findViewById(R.id.sd);
        stop = (Button)findViewById(R.id.Stop);
        pause = (Button)findViewById(R.id.Pause);

        src.setOnClickListener(this);
        sd.setOnClickListener(this);
        stop.setOnClickListener(this);
        pause.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        try
        {
            switch (arg0.getId())
            {
                case R.id.src:
                    if (mediaPlayer != null)
                        ... // 释放mediaPlayer
                    mediaPlayer =   // 创建新的MediaPlayer，载入raw/music.mp3
                    ...   // 播放
                    break;

                case R.id.sd:
                    if (mediaPlayer != null)
                        ... // 释放mediaPlayer
                    mediaPlayer = // 创建新的MediaPlayer
                    ...   // 设置播放文件为sd卡的music2.mp3
                    ...  // 设置OnPrepared监听器
                    ...  // 载入音乐文件
                    break;
                case R.id.Stop:
                    if (mediaPlayer != null)
                    {
                        mediaPlayer.stop();//单击停止按钮时，调用stop方法停止媒体播放器
                    }
                    break;
                case R.id.Pause:
                    ... // 暂停
            }
        }
        catch (Exception e) {
            //若产生异常，则弹出相应的Toast消息
            Toast.makeText(this, "异常："+ e.toString(), Toast.LENGTH_SHORT).show();
        }
        finally {

        }
    }
    @Override
    public void onCompletion(MediaPlayer arg0) {

    }
    @Override
    public void onPrepared(MediaPlayer arg0) {
        ... // 播放
    }


}