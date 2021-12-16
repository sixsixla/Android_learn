package hdu.course.android.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private TextView textview1;  //声明文本视图控件textview1
    private TextView textview2;  //声明文本视图控件textview2

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main);
            init();  //初始化空间
            createComponent(); //根据XML创建组件
            register(); //将组件添加到到上下文菜单中
        }
        catch (Exception e) {
            Toast.makeText(MainActivity.this, "异常错误：" + e.toString(),Toast.LENGTH_LONG).show();
        }
        finally {

        }
    }

    /* 初始化文本视图控件为空 */
    public void init()
    {
        textview1 = null;
        textview2 = null;
    }

    /* 根据XML属性创建控件 */
    public void createComponent()
    {
        textview1 = (TextView) this.findViewById(R.id.textview1);
        textview2 = (TextView) this.findViewById(R.id.textview2);
    }

    /* 使用registerForContextMenu将控件注册到上下文菜单中 */
    public void register()
    {
        ...
        ...
    }


    @Override
    public void ...(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo)
    {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (view == textview1)
        {
            contextMenu....(R.drawable.icon);  //  设置上下文菜单的图标
            contextMenu....("My Menu");  //设置上下文菜单的标题

            /*使用add方法添加子菜单，
             * 第一个参数：组 ID为1
             * 第二个参数：菜单项 ID为0
             * 第三个参数：顺序号  为0
             * 第四个参数：菜单项上显示的内容为"菜单1"*/
            ...
        }
        else if(view == textview2)
        {
            SubMenu submenu1 = contextMenu.addSubMenu("二级菜单1");  // 使用addSubMenu添加子菜单，参数指定子菜单显示的内容
            submenu1....(R.drawable.icon);   //设置子菜单的图标
            /*使用add方法添加子菜单，
             * 第一个参数：组 ID为0
             * 第二个参数：菜单项 ID为0
             * 第三个参数：顺序号  为0
             * 第四个参数：菜单项上显示的内容为"菜单1"*/
            submenu1.add(0, 0, 0, "二级菜单1/菜单1"); //添加子菜单
            submenu1.add(0, 1, 1, "二级菜单1/菜单2");    //添加子菜单
            submenu1.setGroupCheckable(1, true, true);        //设置整个组可选

            SubMenu submenu2 = contextMenu.addSubMenu("二级菜单2");
            ...

            SubMenu submenu3 = contextMenu.addSubMenu("二级菜单3");
            ...

            SubMenu submenu4 = contextMenu.addSubMenu("二级菜单4");
            ...

            SubMenu submenu5 = contextMenu.addSubMenu("二级菜单5");
            ...

            SubMenu submenu6 = contextMenu.addSubMenu("二级菜单6");
            ...
        }
    }

}
