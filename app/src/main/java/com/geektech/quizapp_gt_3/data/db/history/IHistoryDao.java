package com.geektech.quizapp_gt_3.data.db.history;

import androidx.room.Delete;

import com.geektech.quizapp_gt_3.model.QuizRezult;



public interface IHistoryDao {

    @Delete
    void deleteAll(QuizRezult quizRezult);


}
