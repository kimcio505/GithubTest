package com.example.user.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView tv_hello = null, tv_name = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hello = findViewById(R.id.tv_hello);
        tv_name = findViewById(R.id.tv_name);

        tv_hello.setText("값을 바꿨지롱!");
        tv_name.setText("이름은 누구게!");
    }

}
