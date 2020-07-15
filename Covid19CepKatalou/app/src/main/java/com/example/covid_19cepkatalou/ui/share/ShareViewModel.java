package com.example.covid_19cepkatalou.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("COVİD-19'un Vücudumuza Zararı Nedir?");
    }

    public LiveData<String> getText() {
        return mText;
    }
}