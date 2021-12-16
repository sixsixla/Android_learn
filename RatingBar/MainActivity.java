package edu.hdu.android.ratingbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.RatingBar.OnRatingBarChangeListener;


public class MainActivity extends Activity {

    private RatingBar ratingBarStyleSmall; //声明评分条控件ratingBarStyleSmall
    private RatingBar ratingBarStyleIndicator; //声明评分条控件ratingBarStyleIndicator
    private RatingBar ratingBarDefault; //声明评分条控件ratingBarStyle
    private TextView textviewIndicator;  //声明文本视图控件textviewIndicator
    private TextView textviewSmall;  //声明文本视图控件textviewSmall
    private TextView textviewDefault;  //声明文本视图控件textviewSmall

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewDefault = ...;
        ratingBarDefault = ...;

        // 注册ratingBarDefault的状态改变监听器，需要在该监听器中实现onRatingChanged方法。
        ratingBarDefault.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            // 覆盖父类onRatingChanged方法。当ratingBarDefault的状态发生改变时，该方法被调用
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                int numStars = ... //获取ratingBarDefault的星星的总量
                float currating = ... //获取当前评分即已被选择的星的数量
                textviewDefault.setText(...);
            }
        });

    }
}