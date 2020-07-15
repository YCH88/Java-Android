package com.example.covid_19cepkatalou.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("COVİD-19'dan Nasıl Korunuruz");
    }

    public LiveData<String> getText() {
        return mText;
    }
}