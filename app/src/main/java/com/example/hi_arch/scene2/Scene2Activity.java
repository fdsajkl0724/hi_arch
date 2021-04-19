package com.example.hi_arch.scene2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.example.hi_arch.R;
import com.example.hi_arch.databinding.ActivityScene2Binding;

public class Scene2Activity extends AppCompatActivity {
    private static final String TAG = "hao";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityScene2Binding binding= DataBindingUtil.setContentView(this, R.layout.activity_scene2);
        final HomeViewModel model = new HomeViewModel();
        binding.setViewModel(model);

        model.getUserInfo();
        binding.editAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.e(TAG, "afterTextChanged: "+model.userField.get().address );
            }
        });
    }
}