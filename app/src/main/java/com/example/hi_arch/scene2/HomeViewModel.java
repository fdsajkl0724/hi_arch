package com.example.hi_arch.scene2;

import androidx.databinding.ObservableField;

/**
 * 作者：haoshuai on 2021/4/15 16:28
 * 邮箱：
 * desc：
 */

public class HomeViewModel {

    public ObservableField<User> userField = new ObservableField<>();
    public void getUserInfo(){
        User user = new User();
        user.nickName = "nickName";
        user.address ="address";

        userField.set(user);

    }
}
