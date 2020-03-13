package com.geektech.quizapp_gt_3.settings;




import android.view.View;

import androidx.fragment.app.Fragment;

import com.geektech.quizapp_gt_3.R;
import com.geektech.quizapp_gt_3.core.CoreFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends CoreFragment {


    public static  SettingsFragment newInstance(){

        return new SettingsFragment();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_settings;
    }

    @Override
    protected void initView(View view) {

    }
}
