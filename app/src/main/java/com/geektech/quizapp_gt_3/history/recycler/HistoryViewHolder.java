package com.geektech.quizapp_gt_3.history.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.quizapp_gt_3.R;

public class HistoryViewHolder extends RecyclerView.ViewHolder {

   private TextView category;
   private TextView difficulty;
   private ImageView dots;
   private TextView question;
   private TextView time;



    public HistoryViewHolder(@NonNull View itemView) {
        super(itemView);
     this.category = itemView.findViewById(R.id.mixed);
     this.difficulty = itemView.findViewById(R.id.difficulty);
     this.dots = itemView.findViewById(R.id.dots);
     this.question = itemView.findViewById(R.id.correct);
     this.time = itemView.findViewById(R.id.time);
     this.dots.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     });
    }

}
