package com.geektech.quizapp_gt_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.geektech.quizapp_gt_3.adapter.ViewPageAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private MainViewModel mainViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      mainViewModel = ViewModelProviders
              .of(this)
              .get(MainViewModel.class);

      ViewPager viewPager = findViewById(R.id.view_pager);
      viewPager.setAdapter(new ViewPageAdapter(getSupportFragmentManager()));

    }

}

