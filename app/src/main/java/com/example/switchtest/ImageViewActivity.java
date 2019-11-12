package com.example.switchtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImageViewActivity extends AppCompatActivity {
    TextView txt_msg;
    Intent intent;
    Bundle get_bag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        Button btn_back = findViewById(R.id.buttonBack);
        txt_msg = findViewById(R.id.txtmsg);
        intent = new Intent();

        get_bag = getIntent().getExtras();
        String num = get_bag.getString("NUM");
        int salary = get_bag.getInt("SALARY");
        String name = get_bag.getString("NAME");
        String phone = get_bag.getString("PHONE");
        txt_msg.setText("姓名"+name+"\n電話"+phone+"\n"+num+salary);
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
