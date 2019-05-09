package com.example.silvia.timerevent;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    Thread t;
    private static final String TAG = "StopRunnable";

    private final int Sleep_Item = 20000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        final TextView textView= findViewById(R.id.textView);
//         Button button= findViewById(R.id.btnstop);
//
//
//        t= new Thread()
//        {
//
//            @Override
//            public void run() {
//
//                while (!isInterrupted())
//                {
//                    try {
//                        Thread.sleep(1000);
//
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                count++;
//
//                                textView.setText(String.valueOf(count));
//
//
//                            }
//                        });
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//
//
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                t.start();
//
//            }
//        });
//


        new Handler().postDelayed(new Runnable()
        {
            public  void run()
            {
                Toast.makeText(MainActivity.this, "5 Segundos", Toast.LENGTH_SHORT).show();
            };

        },Sleep_Item);

    }
}
