package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityFragment extends AppCompatActivity {
    private TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
    }
    public void change(View view){
        if(view.getId()==R.id.bt1){
            tv1.setVisibility(View.VISIBLE);
            tv2.setVisibility(View.INVISIBLE);
        }else if(view.getId()==R.id.bt2){
            tv1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.VISIBLE);
        }
    }
}
