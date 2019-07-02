package com.luck.utilset;

import android.content.Intent;
import android.util.SparseArray;
import android.view.View;

import com.luck.library.base.BaseActivity;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private SparseArray<Class<? extends BaseActivity>> mActivityArray = new SparseArray<Class<? extends BaseActivity>>() {
        {
            put(R.id.btnPhoneRegex, PhoneRegexActivity.class);
            put(R.id.btnToasty, ToastyActivity.class);
            put(R.id.btnLanguageChange, LanguageActivity.class);
        }
    };

    @Override
    protected void initPage() {

    }

    @Override
    protected int getPageLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.btnLanguageChange, R.id.btnPhoneRegex, R.id.btnToasty})
    public void onBtnClick(View v) {
        startActivity(new Intent(mActivity, mActivityArray.get(v.getId())));
    }
}
