package .....;

import android.os.Bundle;
import android.app.....;
import android.view.View;
import android.widget.Button;

public class MainActivity extends .... implements ..... {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.set......;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                SecondRightFragment secondFragment = ...; // 创建SecondRightFragment实例
                android.app.FragmentManager fragmentManager = ...;  // 获取FragmentManager实例
                android.app.FragmentTransaction transaction = fragmentManager....;  // 开启FragmentTransaction
                transaction.replace(...., ....);  // 替代右边的fragment
                transaction.addToBackStack(null);
                transaction.....;  // 提交FragmentTransaction
                break;
            default:
                break;
        }
    }
}
