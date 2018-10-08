package com.example.user.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Three extends AppCompatActivity {
     private MediaPlayer md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

    }
    public void clkBtn(View v){
        Log.i("test","clkBtn : " + v.getId());
        switch (v.getId()){
            case R.id.btn_1:
                _doStop();
                md = MediaPlayer.create(Three.this,R.raw.handclap);
                md.start();
                break;
            case R.id.btn_2:
                _doStop();
                md = MediaPlayer.create(Three.this,R.raw.beenzino);
                md.start();
                break;
            case R.id.btn_3:
                if(md==null){
                    return;
                }
                Button btn = (Button)v;
                String txt = btn.getText().toString();

                if(txt.equals(getString(R.string.pause))){
                    btn.setText(R.string.play);
                    md.pause();
                }else{
                    btn.setText(R.string.pause);
                    md.start();
                }
                break;
            case R.id.btn_4:
                _doStop();
                break;
        }
    }
    private void _doStop(){
        if(md!=null){
            md.stop();
            md.release();
            md = null;
        }
    }
}
