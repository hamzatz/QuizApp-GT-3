package com.geektech.quizapp_gt_3;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.geektech.quizapp_gt_3.adapter.ViewPageAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    private MainViewModel mViewModel;
    TextView textView;
    Button increment,discrement;

    public  SecondFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       return inflater.inflate(R.layout.fragment_second, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.counter);
        increment = view.findViewById(R.id.btn_increment);
        discrement = view.findViewById(R.id.btn_discrement);


        mViewModel = ViewModelProviders
                .of(this)
                .get(MainViewModel.class);

      int pos= getArguments().getInt("position");
      switch (pos){

          case 0:
              textView.setVisibility(View.GONE);
              break;

          case 1:
              mViewModel.counter.observe(getActivity(), new Observer<Integer>() {
                  @Override
                  public void onChanged(Integer integer) {
                      textView.setText(integer.toString());
                  }
              });

              increment.setVisibility(View.GONE);
              discrement.setVisibility(View.GONE);

          case  2:
              mViewModel.history.observe(getActivity(), new Observer<ArrayList>() {
                  @Override
                  public void onChanged(ArrayList arrayList) {
                      textView.setText(arrayList.toString());
                  }
              });
              increment.setVisibility(View.GONE);
              discrement.setVisibility(View.GONE);
              break;
      }
      increment.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mViewModel.onIncrementClick();

          }
      });
      discrement.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mViewModel.onDiscrementClick();
          }
      });
    }
}
