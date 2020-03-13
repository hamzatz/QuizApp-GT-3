package com.geektech.quizapp_gt_3.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.geektech.quizapp_gt_3.R;
import com.geektech.quizapp_gt_3.core.CoreFragment;
import com.geektech.quizapp_gt_3.quiz.QuizActivity;
import com.geektech.quizapp_gt_3.utils.SimpleOnSeekBarChangeListener;

import org.angmarch.views.NiceSpinner;


public class MainFragment extends CoreFragment {

    private TextView amountText;
    private NiceSpinner categorySpinner;
    private NiceSpinner difficultySpinner;
    private SeekBar seekBar;
    private Button btnStart;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    private void seekbarListener() {
        this.seekBar.setOnSeekBarChangeListener(new SimpleOnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                super.onProgressChanged(seekBar, progress, fromUser);
                if (progress < 6) {
                    seekBar.setProgress(5);
                }

            }
        });
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initView(View view) {


        this.seekBar = view.findViewById(R.id.seekbar);
        this.seekBar.setMax(50);
        this.categorySpinner = view.findViewById(R.id.spinner_one);
        this.difficultySpinner = view.findViewById(R.id.spinner_two);
        this.amountText = view.findViewById(R.id.text_amount);
        this.btnStart = view.findViewById(R.id.btn_start);
        this.seekbarListener();

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuizActivity.start(getContext(), 10, "any", "easy");
            }
        });


    }
}