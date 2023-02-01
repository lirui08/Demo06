package com.example.demo06;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LiveViewModel extends ViewModel {
    public MutableLiveData<String> liveData=new MutableLiveData<>();

    public MutableLiveData<String> getLiveData() {
        return liveData;
    }
}
