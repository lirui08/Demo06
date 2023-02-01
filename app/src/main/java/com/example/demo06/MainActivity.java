package com.example.demo06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.demo06.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    LiveViewModel vm;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        vm=new ViewModelProvider(this).get(LiveViewModel.class);
        binding.setVm(vm);
        binding.setLifecycleOwner(this);
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vm.liveData.postValue("live绑定");
                binding.setMytx("data绑定");
            }
        });
    }
}