package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 2016-10-04.
 */

public class Next extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);

        Intent intent = getIntent();
        String intentstr = intent.getStringExtra("quest");
        int intentnum = intent.getIntExtra("button",0);

        Person p = (Person) getIntent().getSerializableExtra("person");

        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText("Intent 로 받은 값 :" + p.sex + " 태그 :" + p.tag + " 받아온 String : "
                + intentstr + " 받아온 num : " + intentnum);

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
