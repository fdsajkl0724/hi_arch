package com.example.hi_arch.scene1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hi_arch.R;
import com.example.hi_arch.scene2.User;

/**
 * 作者：haoshuai on 2021/4/15 15:55
 * 邮箱：
 * desc：
 */

public class Scene1Activity extends BaseActivity<HomePresenter> implements HomeContract.View {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene1);
        mPresenter.getUserInfo();
    }

    @Override
    public void onGetUserInfoResult(User user, String errorMsg) {

    }



}
