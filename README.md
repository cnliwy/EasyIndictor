# EasyIndictor
a indictor could be used vary easy!
使用简介
===
```
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
        // 带图
//        tabBeen.add(new TabBean("聊天",R.drawable.ic_slide_time,R.drawable.ic_slide_happy));
//        tabBeen.add(new TabBean("空间",R.drawable.ic_slide_time,R.drawable.ic_slide_music));
//        tabBeen.add(new TabBean("设置",R.drawable.ic_slide_time,R.drawable.ic_slide_set));
        // 不带图
        tabBeen.add(new TabBean("聊天"));
        tabBeen.add(new TabBean("空间"));
        tabBeen.add(new TabBean("设置"));
        indicator.setTabs(tabBeen);
```
