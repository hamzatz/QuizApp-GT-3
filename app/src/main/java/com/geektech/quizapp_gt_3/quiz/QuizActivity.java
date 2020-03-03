package com.geektech.quizapp_gt_3.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.geektech.quizapp_gt_3.R;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, QuizActivity.class));
    }

}
