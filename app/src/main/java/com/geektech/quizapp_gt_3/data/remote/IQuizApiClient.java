package com.geektech.quizapp_gt_3.data.remote;

import com.geektech.quizapp_gt_3.model.Question;

import java.util.List;

public interface IQuizApiClient {

    void getQuestions(QuestionsCallback callback);

    interface QuestionsCallback{

        void onSuccess(List<Question> question);

        void onFailure(Exception e);
    }
}
