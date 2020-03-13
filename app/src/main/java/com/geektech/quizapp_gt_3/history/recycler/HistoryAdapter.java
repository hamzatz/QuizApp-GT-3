package com.geektech.quizapp_gt_3.history.recycler;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.geektech.quizapp_gt_3.model.Question;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolder> {

    private ArrayList<Question> mHistories = new ArrayList<>();


    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

   return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return this.mHistories.size();
    }
}

