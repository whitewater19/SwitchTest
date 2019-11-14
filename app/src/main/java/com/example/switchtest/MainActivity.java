package com.example.switchtest;
//開始學習切換Activity(顯性的意圖)
//1主介面拉TextView跟Button
//2新增一個Empty Activity(ImageView),都會附一個同名layout
//3在mipmap給一張圖,在介面拉ImageView,在自動資源視窗選Project定位
//4在介面拉Button,定位
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//5
        Button btn_next = findViewById(R.id.buttonNext);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
//8(28-30行)區別在傳值過去(簡單的如果只有兩個值要傳用putExtra,多些就要用bundle了)
                intent.putExtra("MSG","本月薪資:");
                       //傳值過去
                intent.putExtra("SALARY",50000);
//6
                intent.setClass(MainActivity.this,ImageViewActivity.class);
                                    //Context是現在的activity,     class是要跳過去的activity　
                startActivity(intent);
                finish();//讓現在activity結束(暫停)
            }
        });
    }
}
