package edu.hdu.android.videoview;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends Activity {

    private VideoView videoView;
    private Button play,stop;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView =
        play = ...
        stop = ...
        // 设置videoView播放的视频
        videoView....

        play.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 播放视频
                ...
            }
        });

        stop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 停止视频
                ...
            }
        });

        // 添加进度控制条
        try {
            videoView.setMediaController(new MediaController(this));
        } catch (Exception e) {
            Toast.makeText(this, "异常："+ e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
