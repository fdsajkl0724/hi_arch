package com.example.hi_arch.scene3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.hi_arch.R;
import com.example.hi_arch.databinding.ActivityScene3Binding;
import com.example.hi_arch.scene2.User;

public class Scene3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityScene3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_scene3);
        ViewModelProvider provider = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory());

        HomeViewModel model = provider.get(HomeViewModel.class);
        model.getUserInfo().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                binding.setUser(user);
            }
        });



    }
}