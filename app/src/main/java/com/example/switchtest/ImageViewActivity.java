package com.example.switchtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImageViewActivity extends AppCompatActivity {
//9(13行)
      TextView txt_msg;
//7
      Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        Button btn_back = findViewById(R.id.buttonBack);
//10(25-29)
        txt_msg = findViewById(R.id.txtmsg);
        intent = getIntent();
        String num = intent.getStringExtra("MSG");
        int salary = intent.getIntExtra("SALARY",0);
        txt_msg.setText(num+salary);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent();
                intent.setClass(ImageViewActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
