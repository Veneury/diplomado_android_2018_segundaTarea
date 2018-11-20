package com.example.toode.layoutandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
//Button button;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main3);

    findViewById(R.id.buttonone).setOnClickListener(this);
    findViewById(R.id.buttontwo).setOnClickListener(this);
    findViewById(R.id.buttontre).setOnClickListener(this);
    findViewById(R.id.buttonfor).setOnClickListener(this);

  }
@Override
  public void onClick(View v) {

    int color;

    View contenedor = v.getRootView();

    switch (v.getId()) {
      case R.id.buttonone:
        color = Color.parseColor("#DD4F42");
        break;
      case R.id.buttontwo:
        color = Color.parseColor("#19A15F");
        break;
      case R.id.buttontre:
        color = Color.parseColor("#FED04F");
        break;
      case R.id.buttonfor:
        color = Color.parseColor("#3C64A1");
        break;
      default:
        color = Color.WHITE; // Blano
    }

    contenedor.setBackgroundColor(color);
  }
}


