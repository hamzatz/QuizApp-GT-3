package com.geektech.quizapp_gt_3.main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.geektech.quizapp_gt_3.model.QuestionsResponse;
import com.geektech.quizapp_gt_3.R;
import com.geektech.quizapp_gt_3.data.remote.IQuizApiClient;
import com.geektech.quizapp_gt_3.data.remote.QuizApiClient;
import com.geektech.quizapp_gt_3.model.Result;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    private ViewPager mViewPager;
    private MainViewModel mainViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        MainFragment fragment;
        fragment = new MainFragment();
        ft.replace(R.id.container_main, fragment);
        ft.commit();
        setTheme(R.style.AppTheme);
    }


//        FragmentManager fm = getSupportFragmentManager();
//        fragment = fm.findFragmentByTag("myFragmentTag");
//        if (fragment == null) {
//            FragmentTransaction ft = fm.beginTransaction();
//            fragment =new MyFragment();
//            ft.add(android.R.id.content,fragment,"myFragmentTag");
//            ft.commit();
//        }


//        mainViewModel = ViewModelProviders
//                .of(this)
//                .get(MainViewModel.class);
//
//        new QuizApiClient().getQuestions(new IQuizApiClient.QuestionsCallback() {
//
//            @Override
//            public void onSuccess(List<Result> question) {
//
//            }
//
//            @Override
//            public void onFailure(Exception e) {
//
//            }
//        });
//
//    }
//
//
//    public void initViews() {

    // mViewPager = findViewById(R.id.view_pager);
//        mViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int position) {
//
//
//            }
//
//        });
//    }
}