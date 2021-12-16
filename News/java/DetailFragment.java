package .......;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
    private View view;
    private TextView text1,text2;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //加载布局文件
        .........

        if (view!=null){
            init();
        }

        // 设置初始化显示文字为activity中details的第一项
        setText(........);

        return view;
    }

    private void init() {
        // 获取两个TextView（text1与text2）的实例
        .......
    }
    public void setText(String[] text) {
        // 设置两个TextView的文字
        .......
    }
}
