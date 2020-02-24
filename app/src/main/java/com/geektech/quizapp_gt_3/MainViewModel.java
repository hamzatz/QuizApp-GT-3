package com.geektech.quizapp_gt_3;

import android.widget.TextView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {



    private int mCounter = 0;

    public MutableLiveData<Integer> counter = new MutableLiveData<>();

    ArrayList<String> list = new ArrayList<>();

    public MutableLiveData<ArrayList> history = new MutableLiveData<>();




    void onIncrementClick() {
        mCounter ++;
        list.add("+");
        counter.setValue(mCounter);
        history.setValue(list);
    }

    void onDiscrementClick(){
        mCounter --;
        list.add("-");
        counter.setValue(mCounter);
        history.setValue(list);
    }






}
