package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.widget.EditText;

import java.util.function.DoublePredicate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ここにjavaのコードを書く
    public void onClickButton(android.view.View view) {
        /*
        TextViewは文字を表示させる、EditTextは文字を入力する
        (TextView)とすることで、Viewなどではなく、TextViewだということを示す
        findViewByIdとすることで、idからなる値を受け取る
        同じアプリの中の部品を参照するため、this
         */
        TextView bmiScore = (TextView) this.findViewById(R.id.bmiScore);
        EditText heightForm = (EditText) this.findViewById(R.id.heightForm);
        EditText weightForm = (EditText) this.findViewById(R.id.weightForm);


        String strHeight,strWeight;
        //[getText]で、テキストフィールドに入力された値を取得し
        //[toString]で、それを文字列に変換
        strHeight = heightForm.getText().toString();
        strWeight = weightForm.getText().toString();

        double bmi,height,weight;
        height = Double.parseDouble(strHeight);
        weight = Double.parseDouble(strWeight);

        height /= 100;
        bmi = weight / (height * height);
        String bmiscore = String.format("%.1f",bmi);
        String msg = "BMIスコア：" + bmiscore;

        bmiScore.setText(msg);


    }
}