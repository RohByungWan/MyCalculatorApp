package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mycalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    boolean isFirstInput = true; //첫번째 숫자인지 두번째 숫자인지 체크 해주는 boolean
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());


    }
    //numButtonClick 메서드로 xml 에 있는 Button을 한번에 등록 하여 코드
    //가독성과 생산성 증가
    public void numButtonClick(View view) {
        Button button = findViewById(view.getId());
        String getButtonText = button.getText().toString();
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText(getButtonText);
            activityMainBinding.formulaTextView.setText(getButtonText);
            isFirstInput = false;
        }else  {
            activityMainBinding.resultTextView.append(getButtonText);
            activityMainBinding.formulaTextView.append(getButtonText);
        }
    }



}