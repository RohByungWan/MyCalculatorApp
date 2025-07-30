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



    //계산기에서 0~9번 까지의 버튼 이벤트 실행
    //isFirstInput이 위에 boolean으로 true가 선언 되어있어 만약에 true이면 setText실행 후
    //isFirstInput을 false로 바꿔 else로 넘어가게 한 후 append 실행
    //이렇게 되면 계산기 앱에서 1을 연속적으로 누를 수 있다.
    public void num1Click(View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("1"); // setText는 기존에 있는 내용을 지우고
            activityMainBinding.formulaTextView.setText("1");// 새로운 문자열을 셋팅해주는 메서드.
            isFirstInput = false;
        }else {
            activityMainBinding.resultTextView.append("1"); // append는 기존 내용을 유지한 채
            activityMainBinding.formulaTextView.append("1");// 뒤에 문자열을 붙혀주는 메서드
        }
    }

    public void num2Click(View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("2"); // setText는 기존에 있는 내용을 지우고
            activityMainBinding.formulaTextView.setText("2");// 새로운 문자열을 셋팅해주는 메서드.
            isFirstInput = false;
        }else {
            activityMainBinding.resultTextView.append("2"); // append는 기존 내용을 유지한 채
            activityMainBinding.formulaTextView.append("2");// 뒤에 문자열을 붙혀주는 메서드
        }
    }

    public void num3Click(View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("3");
            activityMainBinding.formulaTextView.setText("3");
            isFirstInput = false;
        }else {
            activityMainBinding.resultTextView.append("3");
            activityMainBinding.formulaTextView.append("3");
        }
    }




}