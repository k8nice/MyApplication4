//package com.nice.myapplication;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//
//public class MyActivity extends Activity {
//    @Override
//    public void onCreate(@Nullable final Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//        //得到按钮实例
//        Button hellobtn = findViewById(R.id.hellobutton);
//        //设置监听按钮点击事件
//        hellobtn.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                //得到textview实例
//                TextView hellotv = findViewById(R.id.hellotextView);
//                //弹出Toast提示按钮被点击了
//                Toast.makeText(MyActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
//                //读取strings.xml定义的interact_message信息并写到textview上
//                hellotv.setText(R.string.interact_message);
//            }
//        });
//    }
//}
