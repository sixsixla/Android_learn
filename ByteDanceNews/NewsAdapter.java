package hdu.course.android.bytedancenews;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.Viewholder> {
    private Context context;
    private ... list;

    public NewsAdapter(Context context, ... list) {
        this.context = context;
        this.list = list;

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    // 自定义RecyclerView的ViewHolder类
    public static class Viewholder extends RecyclerView.ViewHolder {

        private final ImageView recyImage;
        private final TextView recyTitle;

        public Viewholder( View itemView) {
            super(itemView);
            // 获取RecyclerView中单个元素的UI组件：缩略图和标题
            recyImage = ...
            recyTitle = ...
        }
    }

    // 重写onCreateViewHolder回调方法
    // 该方法在每一个RecyclerView的元素创建时被回调，需加载其对应的布局文件
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, R.layout...., null);
        Viewholder holder = new Viewholder(view);
        return holder;
    }

    // 重写onBindViewHolder回调方法
    // 该方法在每一个RecyclerView的元素绘制时被回调
    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int i) {
        // 设置标题
        holder.recyTitle.setText(list.get(i)....);

        URL url = null;
        try {
            url = new URL(list.get(i)....);
        } catch (MalformedURLException e) {
            return;
        }
        try {
            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            // 设置缩略图
            holder....;
        } catch (IOException e) {
        }

    }

    // 返回列表元素的个数
    @Override
    public int getItemCount() {
        return ...
    }

}