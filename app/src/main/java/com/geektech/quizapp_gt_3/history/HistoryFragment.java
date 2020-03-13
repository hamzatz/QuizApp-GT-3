package com.geektech.quizapp_gt_3.history;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.quizapp_gt_3.R;
import com.geektech.quizapp_gt_3.core.CoreFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends CoreFragment {


    public static HistoryFragment newInstance(){

     return  new HistoryFragment();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_history;
    }

    @Override
    protected void initView(View view) {

    }
}
