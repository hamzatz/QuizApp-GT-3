package com.geektech.quizapp_gt_3.model;

import java.util.Date;

public class History {

    private int id;

    private String category;

    private String difficulty;

    private int questionAmount;

    private int correctQuestion;

    private Date CreateAt;

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

    public int getQuestionAmount() {
        return questionAmount;
    }

    public void setQuestionAmount(int questionAmount) {
        this.questionAmount = questionAmount;
    }

    public int getCorrectQuestion() {
        return correctQuestion;
    }

    public void setCorrectQuestion(int correctQuestion) {
        this.correctQuestion = correctQuestion;
    }

    public Date getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(Date createAt) {
        CreateAt = createAt;
    }
}
