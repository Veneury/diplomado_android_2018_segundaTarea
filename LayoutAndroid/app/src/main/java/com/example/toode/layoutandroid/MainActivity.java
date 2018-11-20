package com.example.toode.layoutandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button next;
  Button dos;
  Button tres;
  Button cuatro;
  Button cinco;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    next = (Button) findViewById(R.id.linerlayoutvertical);
    dos=(Button)findViewById(R.id.linerlayouthorizontal);
    tres=(Button)findViewById(R.id.relativelayout);
    cuatro=(Button)findViewById(R.id.tablelayout);
    cinco=(Button)findViewById(R.id.framelayout);


    next.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Intent next = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(next);
      }

    });

    dos.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Intent dos = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(dos);
      }

    });
    cuatro.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Intent cuatro = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(cuatro);
      }

    });

    tres.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Intent tres = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(tres);
      }

    });

    cinco.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Intent cinco = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(cinco);
      }

    });
  }


  }

