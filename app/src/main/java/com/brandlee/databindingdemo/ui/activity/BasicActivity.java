package com.brandlee.databindingdemo.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.brandlee.databindingdemo.R;
import com.brandlee.databindingdemo.databinding.ActivityBasicBinding;
import com.brandlee.databindingdemo.model.User;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
        User user = new User("brand", "lee", 12);
        binding.setUser(user);
    }
}
