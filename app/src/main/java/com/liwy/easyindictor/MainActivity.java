package com.liwy.easyindictor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EasyIndicator indicator;
    TabView tabView;
    List<TabBean> tabBeen = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initIndictor();
        tabView = (TabView)findViewById(R.id.tabview);
        tabView.setBackgroundColor(Color.WHITE);
    }

    private void initIndictor(){
        indicator = (EasyIndicator)findViewById(R.id.indictor);
        TabConfig config = new TabConfig.Builder()
                .setDistance(5)                         // 设置文字和图片的距离
                .setTextColorNor(R.color.text_nor)      // 设置默认的文字颜色
                .setTextColorSel(R.color.text_sel)      // 设置选中后的文字颜色
                .setBgColorNor(R.color.bg_nor)              //设置默认的背景色
                .setBgColorSel(R.color.bg_sel)    // 设置选中后的背景色
                .setImgWidth(30)                        // 设置图片宽度
                .setImgHeight(30)                       // 设置图片高度
                .setShowLine(true)                      // 设置是否显示下划线
                .builder();
        indicator.setConfig(config);
//        tabBeen.add(new TabBean("聊天",R.drawable.ic_slide_time,R.drawable.ic_slide_happy));
//        tabBeen.add(new TabBean("空间",R.drawable.ic_slide_time,R.drawable.ic_slide_music));
//        tabBeen.add(new TabBean("设置",R.drawable.ic_slide_time,R.drawable.ic_slide_set));
        tabBeen.add(new TabBean("聊天"));
        tabBeen.add(new TabBean("空间"));
        tabBeen.add(new TabBean("设置"));
        indicator.setTabs(tabBeen);
    }
}
