package com.example.toode.layoutandroid;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    Button createNotificationButton = findViewById(R.id.notificacion);

    createNotificationButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        runNotification();
      }
    });
  }


  private void runNotification() {

    NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
      .setSmallIcon(R.drawable.ic_launcher_foreground)
      .setContentTitle("Veneury Devers Nolasco")
      .setContentText("Hola! bienvenido a mi aplicación invitado");


    Intent notificationIntent = new Intent(this, MainActivity.class);
    PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
    builder.setContentIntent(contentIntent);


    NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    manager.notify(0, builder.build());
  }
}
