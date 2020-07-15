package com.example.covid_19cepkatalou.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Covid-19 Nasıl Bulaşır?");
    }

    public LiveData<String> getText() {
        return mText;
    }
}