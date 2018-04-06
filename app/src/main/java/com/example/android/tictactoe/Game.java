package com.example.android.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game extends AppCompatActivity {

    int[][] z = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                z[i][j] = 0;
            }
        }

//        NotificationCompat.Builder mBuilder= new NotificationCompat.Builder(Game.this);
//        mBuilder.setContentTitle("TicTacToe");
//        mBuilder.setContentText("Game in Progress");
//        mBuilder.setSmallIcon(R.drawable.img);
//        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        mNotificationManager.notify(1,mBuilder.build());
    }

    int ctr = 0,win=0;
    char[][] a = new char[3][3];

    private void check(){
        int ctr1=100,ctr3=0;
        if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]){
            if(a[0][0]=='X')
                ctr1=1;
            else if(a[0][0]=='O')
                ctr1=0;
        }
        if(a[0][2]==a[1][1]&&a[1][1]==a[2][0]){
            if(a[0][2]=='X')
                ctr1=1;
            else if(a[0][2]=='O')
                ctr1=0;
        }
        if(a[0][0]==a[0][1]&&a[0][1]==a[0][2]){
            if(a[0][2]=='X')
                ctr1=1;
            else if(a[0][2]=='O')
                ctr1=0;
        }
        if(a[1][0]==a[1][1]&&a[1][1]==a[1][2]){
            if(a[1][0]=='X')
                ctr1=1;
            else if(a[1][0]=='O')
                ctr1=0;
        }
        if(a[2][0]==a[2][1]&&a[2][1]==a[2][2]){
            if(a[2][2]=='X')
                ctr1=1;
            else if(a[2][2]=='O')
                ctr1=0;
        }
        if(a[0][0]==a[1][0]&&a[1][0]==a[2][0]){
            if(a[2][0]=='X')
                ctr1=1;
            else if(a[2][0]=='O')
                ctr1=0;
        }
        if(a[0][1]==a[1][1]&&a[1][1]==a[2][1]){
            if(a[2][1]=='X')
                ctr1=1;
            else if(a[2][1]=='O')
                ctr1=0;
        }
        if(a[0][2]==a[1][2]&&a[1][2]==a[2][2]){
            if(a[2][2]=='X')
                ctr1=1;
            else if(a[2][2]=='O')
                ctr1=0;
        }

        if(ctr1==1){
            TextView t = (TextView)findViewById(R.id.main_text);
            t.setText("Player 1 wins.");
            win=1;
        }
        else if(ctr1==0){
            TextView t = (TextView)findViewById(R.id.main_text);
            t.setText("Player 2 wins.");
            win=1;
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(z[i][j]==0){
                    ctr3=1;
                }
            }
        }
        if(ctr3==0&&ctr1!=1&&ctr1!=0){
            TextView t = (TextView)findViewById(R.id.main_text);
            t.setText("Draw");
        }
    }


    private void displaybox() {
        String temp;
        if(ctr==0)
            temp="Player 1";
        else
            temp="Player 2";
        TextView t = (TextView)findViewById(R.id.main_text);
        t.setText(temp);
    }

    public void b00(View view) {
        if(win==0){
            if (z[0][0] == 0) {
                if (ctr == 0) {
                    a[0][0] = 'X';
                    ctr = 1;
                } else {
                    a[0][0] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b00);
                p1_button.setText(String.valueOf(a[0][0]));
            }

        z[0][0] = 1;
        displaybox();
        check();
        }
    }


    public void b01(View view) {
        if(win==0) {
            if (z[0][1] == 0) {
                if (ctr == 0) {
                    a[0][1] = 'X';
                    ctr = 1;
                } else {
                    a[0][1] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b01);
                p1_button.setText(String.valueOf(a[0][1]));
            }

            z[0][1] = 1;
            displaybox();
            check();
        }
    }

    public void b02(View view) {
        if(win==0) {
            if (z[0][2] == 0) {
                if (ctr == 0) {
                    a[0][2] = 'X';
                    ctr = 1;
                } else {
                    a[0][2] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b02);
                p1_button.setText(String.valueOf(a[0][2]));
            }

            z[0][2] = 1;
            displaybox();
            check();
        }
    }

    public void b10(View view) {
        if (win == 0) {
            if (z[1][0] == 0) {
                if (ctr == 0) {
                    a[1][0] = 'X';
                    ctr = 1;
                } else {
                    a[1][0] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b10);
                p1_button.setText(String.valueOf(a[1][0]));
            }

        z[1][0] = 1;
        displaybox();
        check();
        }
    }

    public void b11(View view) {
        if(win==0){
            if (z[1][1] == 0) {
                if (ctr == 0) {
                    a[1][1] = 'X';
                    ctr = 1;
                } else {
                    a[1][1] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b11);
                p1_button.setText(String.valueOf(a[1][1]));
            }

        z[1][1] = 1;
        displaybox();
        check();
        }
    }

    public void b12(View view) {
        if(win==0) {
            if (z[1][2] == 0) {
                if (ctr == 0) {
                    a[1][2] = 'X';
                    ctr = 1;
                } else {
                    a[1][2] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b12);
                p1_button.setText(String.valueOf(a[1][2]));
            }

            z[1][2] = 1;
            displaybox();
            check();
        }
    }

    public void b20(View view) {
        if(win==0) {
            if (z[2][0] == 0) {
                if (ctr == 0) {
                    a[2][0] = 'X';
                    ctr = 1;
                } else {
                    a[2][0] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b20);
                p1_button.setText(String.valueOf(a[2][0]));
            }

            z[2][0] = 1;
            displaybox();
            check();
        }
    }

    public void b21(View view) {
        if(win==0) {
            if (z[2][1] == 0) {
                if (ctr == 0) {
                    a[2][1] = 'X';
                    ctr = 1;
                } else {
                    a[2][1] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b21);
                p1_button.setText(String.valueOf(a[2][1]));
            }

            z[2][1] = 1;
            displaybox();
            check();
        }
    }

    public void b22(View view) {
        if(win==0) {
            if (z[2][2] == 0) {
                if (ctr == 0) {
                    a[2][2] = 'X';
                    ctr = 1;
                } else {
                    a[2][2] = 'O';
                    ctr = 0;
                }
                Button p1_button = (Button) findViewById(R.id.b22);
                p1_button.setText(String.valueOf(a[2][2]));
            }

            z[2][2] = 1;
            displaybox();
            check();
        }
    }

    public void reset(View view){
        win=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] =' ';
            }
        }
        ctr=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                z[i][j] =0;
            }
        }
        displaybox();
        Button p1_button = (Button) findViewById(R.id.b22);
        p1_button.setText(String.valueOf(a[2][2]));

        p1_button = (Button) findViewById(R.id.b21);
        p1_button.setText(String.valueOf(a[2][1]));

        p1_button = (Button) findViewById(R.id.b20);
        p1_button.setText(String.valueOf(a[2][0]));

        p1_button = (Button) findViewById(R.id.b12);
        p1_button.setText(String.valueOf(a[1][2]));

        p1_button = (Button) findViewById(R.id.b11);
        p1_button.setText(String.valueOf(a[1][1]));

        p1_button = (Button) findViewById(R.id.b10);
        p1_button.setText(String.valueOf(a[1][0]));

        p1_button = (Button) findViewById(R.id.b02);
        p1_button.setText(String.valueOf(a[0][2]));

        p1_button = (Button) findViewById(R.id.b01);
        p1_button.setText(String.valueOf(a[0][1]));

        p1_button = (Button) findViewById(R.id.b00);
        p1_button.setText(String.valueOf(a[0][0]));


    }
}
