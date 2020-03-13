package com.geektech.quizapp_gt_3.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;
import com.geektech.quizapp_gt_3.R;
import com.geektech.quizapp_gt_3.data.remote.IQuizApiClient;
import com.geektech.quizapp_gt_3.data.remote.QuizApiClient;
import com.geektech.quizapp_gt_3.model.Question;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.List;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private ViewPager mViewPager;
    private BottomNavigationView mBottomNav;
    MainViewPagerAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.main_view_pager);
        mViewPager.setAdapter(mAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                mBottomNav.getMenu().getItem(position).setChecked(true);
            }
        });

        mBottomNav = findViewById(R.id.bottom_nav);
        mBottomNav.setOnNavigationItemSelectedListener(this);
        setTheme(R.style.AppTheme);

        new QuizApiClient().getQuestions(new IQuizApiClient.QuestionsCallback() {
            @Override
            public void onSuccess(List<Question> question) {

            }

            @Override
            public void onFailure(Exception e) {

            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int page = 0;

        switch (menuItem.getItemId()) {
            case R.id.nav_history:
                page = 1;
                break;
            case R.id.nav_settings:
                page = 2;
                break;
        }

        mViewPager.setCurrentItem(page);
        return true;
    }


}


