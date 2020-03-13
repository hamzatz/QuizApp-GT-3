package com.geektech.quizapp_gt_3.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.geektech.quizapp_gt_3.data.db.converters.DateConverter;
import com.geektech.quizapp_gt_3.data.db.converters.QuestionsConverter;

import java.util.Date;
import java.util.List;

@Entity (tableName = "quiz_result")
public class QuizRezult {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "difficulty")
    private String difficulty;

    @ColumnInfo(name = "correct_answers_amount")
    private String correctAnswersAmount;

    @ColumnInfo(name = "questions")
    @TypeConverters({QuestionsConverter.class})
    private List<Question> questions;

    @ColumnInfo(name = "created_at")
    @TypeConverters({DateConverter.class})
    private Date createdAt;



    public QuizRezult(int id, String category, String difficulty, String correctAnswersAmount, List<Question> questions, Date createdAt) {
        this.id = id;
        this.category = category;
        this.difficulty = difficulty;
        this.correctAnswersAmount = correctAnswersAmount;
        this.questions = questions;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCorrectAnswers() {
        return correctAnswersAmount;
    }

    public void setCorrectAnswers(String correctAnswersAmount) {
        this.correctAnswersAmount = correctAnswersAmount;
    }

    public String getCorrectAnswersAmount() {
        return correctAnswersAmount;
    }

    public void setCorrectAnswersAmount(String correctAnswersAmount) {
        this.correctAnswersAmount = correctAnswersAmount;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
