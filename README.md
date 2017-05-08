# EasyIndictor 使用简介
##导航栏效果图
![avatar](https://github.com/cnliwy/EasyIndictor/tree/master/screenshot/pic1.png)</br>
##方式一：
```
        indicator = (EasyIndicator)findViewById(R.id.indictor);
        //config配置信息可参考TabConfig.Builder类
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
        // 设置图文导航栏（参数依次为：文字，初始图标，选中后图标）
//        tabList.add(new TabBean("聊天",R.drawable.ic_slide_time,R.drawable.ic_slide_happy));
//        tabList.add(new TabBean("空间",R.drawable.ic_slide_time,R.drawable.ic_slide_music));
//        tabList.add(new TabBean("设置",R.drawable.ic_slide_time,R.drawable.ic_slide_set));
        // 设置纯文字导航栏
        tabList.add(new TabBean("聊天"));
        tabList.add(new TabBean("空间"));
        tabList.add(new TabBean("设置"));
        indicator.setTabs(tabList);
```

##方式二（绑定ViewPager）：
```
        indicator = (EasyIndicator)findViewById(R.id.indictor);
        //config配置信息可参考TabConfig.Builder类
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
        // 设置图文导航栏（参数依次为：文字，初始图标，选中后图标）
//        tabList.add(new TabBean("聊天",R.drawable.ic_slide_time,R.drawable.ic_slide_happy));
//        tabList.add(new TabBean("空间",R.drawable.ic_slide_time,R.drawable.ic_slide_music));
//        tabList.add(new TabBean("设置",R.drawable.ic_slide_time,R.drawable.ic_slide_set));
        // 设置纯文字导航栏
        tabList.add(new TabBean("聊天"));
        tabList.add(new TabBean("空间"));
        tabList.add(new TabBean("设置"));
        indicator.setTabs(tabList);
        indicator.setTabAndViewPager(tabList,viewPager);
```
