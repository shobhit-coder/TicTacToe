package com.example.android.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button b = (Button) findViewById(R.id.play);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

//                int notificationId = 001;
//// Build intent for notification content
//                Intent viewIntent = new Intent(this, ViewEventActivity.class);
//                viewIntent.putExtra(EXTRA_EVENT_ID, eventId);
//                PendingIntent viewPendingIntent =
//                        PendingIntent.getActivity(this, 0, viewIntent, 0);
//
//                NotificationCompat.Builder notificationBuilder =
//                        new NotificationCompat.Builder(this)
//                                .setSmallIcon(R.drawable.ic_event)
//                                .setContentTitle(eventTitle)
//                                .setContentText(eventLocation)
//                                .setContentIntent(viewPendingIntent);
//
//                // Get an instance of the NotificationManager service
//                NotificationManagerCompat notificationManager =
//                        NotificationManagerCompat.from(this);
//
//// Issue the notification with notification manager.
//                notificationManager.notify(notificationId, notificationBuilder.build());
//


                Intent i = new Intent(MainScreenActivity.this,Game.class);
                startActivity(i);
            }
        });

//        NotificationManager m = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
//        m.cancel(1);


    }
}
