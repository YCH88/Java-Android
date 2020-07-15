package com.example.covid_19cepkatalou.ui.home;

import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("COVID-19 Nedir?");

    }

    public LiveData<String> getText() {
        return mText;
    }
}