package com.example.hi_arch.scene3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hi_arch.scene2.User;

/**
 * 作者：haoshuai on 2021/4/16 11:11
 * 邮箱：
 * desc：
 */

public class HomeViewModel extends ViewModel {

    public LiveData<User> getUserInfo(){
        MutableLiveData<User> liveData = new MutableLiveData<>();
        User user = new User();
        user.nickName = "nickName";
        user.address ="address";

        liveData.postValue(user);
        return liveData;

    }
}
