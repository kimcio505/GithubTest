package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {
    private TextView tv_content = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);
    }

    public void clkbtn1(View v){
        Button btn = (Button)v;


        if(v.getId() ==R.id.btn_1){
            tv_content.setText(btn.getText());
        }else if(v.getId()==R.id.btn_2){
            tv_content.setText(btn.getText());
        }else if(v.getId()==R.id.btn_3){
            tv_content.setText(btn.getText());
        }
    }
}
