package ........;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class TitlesFragment extends Fragment {
    private View view;
    private String[] titles;
    private String[][] details;
    private ListView listView;

    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState){
        //加载布局文件
        .........

        // 从activity中获取titles和details
        .........

        if (view!=null){
            init();
        }

        // 为listView添加监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // 通过activity实例获取另一个Fragment（右侧Fragment）对象
                .........

                // 设置获取到的Fragment对象的文字内容
                .........

            }
        });
        return view;
    }

    private void init() {
        // 获取ListView（listView）实例
        .........

        if (titles != null) {
            // 为listView设置adapter
            .........
        }
    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int i) {
            return titles[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            // 加载listView每一项的布局
            view = View.inflate(getActivity(), R.layout.title_item_layout, null);

            // 获取title_item_layout中TextView的实例
            .........

            // 为该TextView设置文字为titles中的第i项
            .........

            return view;
        }
    }
}
