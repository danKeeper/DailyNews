package com.wuchang.dailynews.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import open.wuchang.com.dailynews.R;
import com.wuchang.dailynews.base.BaseActivity;

public class NewsActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_news;
    }

    @Override
    public View getToolbar() {
        return null;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activity_news);
        setSupportActionBar(toolbar);
    }

}
