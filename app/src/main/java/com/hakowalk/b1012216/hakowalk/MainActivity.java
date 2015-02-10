package com.hakowalk.b1012216.hakowalk;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity {

    private ImageButton map_btn;
    private ImageButton course_btn;
    private ImageButton info_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.map_btn = (ImageButton) findViewById(R.id.map_btn);
        this.map_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.hakowalk.b1012216.hakowalk",
                        "com.hakowalk.b1012216.hakowalk.MapActivity");
                startActivity(intent);
            }
        });

        this.course_btn = (ImageButton) findViewById(R.id.course_btn);
        this.course_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.hakowalk.b1012216.hakowalk",
                        "com.hakowalk.b1012216.hakowalk.CourseActivity");
                startActivity(intent);
            }
        });

        this.info_btn = (ImageButton) findViewById(R.id.info_btn);
        this.info_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.hakowalk.b1012216.hakowalk",
                        "com.hakowalk.b1012216.hakowalk.InfoActivity");
                startActivity(intent);
            }
        });
    }



}
