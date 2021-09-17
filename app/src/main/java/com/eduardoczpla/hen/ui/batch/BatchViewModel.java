package com.eduardoczpla.hen.ui.batch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BatchViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BatchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Eduardo Lindo Enjetado");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
