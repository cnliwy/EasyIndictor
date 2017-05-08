package com.liwy.easyindictor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static com.liwy.easyindictor.R.id.indictor;

public class MainActivity extends AppCompatActivity {
    EasyIndicator indicator;
    EasyIndicator indicator2;
    TabView tabView;
    List<TabBean> tabList = new ArrayList<>();
    List<TabBean> tabList2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initIndictor();
        initIndictor2();
    }

    private void initIndictor(){
        indicator = (EasyIndicator)findViewById(indictor);
        TabConfig config = new TabConfig.Builder()
                .setDistance(5)                          // 设置文字和图片的距离
                .setTextColorNor(R.color.text_nor)      // 设置默认的文字颜色
                .setTextColorSel(R.color.text_sel)      // 设置选中后的文字颜色
                .setTextSize(16)                         // 设置文字的大小
                .setBgColorNor(R.color.bg_nor)          // 设置默认的背景色
//              .setBgColorSel(R.color.bg_sel)           // 设置选中后的背景色
                .setLineColor(R.color.colorAccent)     // 设置下划线颜色
                .setShowLine(true)                      // 设置是否显示下划线
                .builder();
        indicator.setConfig(config);
        // 设置图文导航栏（参数依次为：文字，初始图标，选中后图标）
//        tabList.add(new TabBean("聊天",R.drawable.ic_slide_time,R.drawable.ic_slide_happy));
//        tabList.add(new TabBean("空间",R.drawable.ic_slide_time,R.drawable.ic_slide_music));
//        tabList.add(new TabBean("设置",R.drawable.ic_slide_time,R.drawable.ic_slide_set));
        // 设置纯文字导航栏
        tabList.add(new TabBean("聊天"));
        tabList.add(new TabBean("空间"));
        tabList.add(new TabBean("设置"));
        // 将TabBean集合传入indictor，初始化导航栏子控件
        indicator.setTabs(tabList);
        indicator.setOnTabClickListener(new OnTabClickListener() {
            @Override
            public void onClick(TabView v) {
                System.out.println("点击了tab" + v.getIndex());
            }
        });
    }

    private void initIndictor2(){
        indicator2 = (EasyIndicator)findViewById(R.id.indictor2);
        TabConfig config = new TabConfig.Builder()
                .setDistance(5)                          // 设置文字和图片的距离
                .setTextColorNor(R.color.text_nor)      // 设置默认的文字颜色
                .setTextColorSel(R.color.text_sel)      // 设置选中后的文字颜色
                .setTextSize(13)                         // 设置文字的大小
                .setBgColorNor(R.color.bg_nor)          // 设置默认的背景色
//              .setBgColorSel(R.color.bg_sel)           // 设置选中后的背景色
                .setImgWidth(30)                         // 设置图片宽度
                .setImgHeight(30)                        // 设置图片高度
                .setLineColor(R.color.colorAccent)     // 设置下划线颜色
                .setShowLine(false)                      // 设置是否显示下划线
                .builder();
        indicator2.setConfig(config);
        // 设置图文导航栏（参数依次为：文字，初始图标，选中后图标）
        tabList2.add(new TabBean("聊天",R.drawable.ic_slide_time,R.drawable.ic_slide_happy));
        tabList2.add(new TabBean("空间",R.drawable.ic_slide_time,R.drawable.ic_slide_music));
        tabList2.add(new TabBean("设置",R.drawable.ic_slide_time,R.drawable.ic_slide_set));
        // 设置纯文字导航栏
//        tabList2.add(new TabBean("聊天"));
//        tabList2.add(new TabBean("空间"));
//        tabList2.add(new TabBean("设置"));
        // 将TabBean集合传入indictor，初始化导航栏子控件
        indicator2.setTabs(tabList2);
    }
}
