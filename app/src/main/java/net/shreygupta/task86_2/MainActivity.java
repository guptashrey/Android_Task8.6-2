package net.shreygupta.task86_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String t = "Toast is used to broadcast a message on any specific event. It uses a static method makeText which takes three parameters: Toast.makeText(Context, Message, Duration).";
    String e = "Event Handling: It can be done by two types: 1. XML 2. Java.";
    String h = "History: Initially developed by Android Inc., which Google bought in 2005, Android was unveiled in 2007, along with the founding of the Open Handset Alliance – a consortium of hardware, software, and telecommunication companies.";
    String o = "Whenever we change the orientation i.e. Either landscape -> portrait Or portrait -> landscape. The activity created again. If we want to fix the orientation, we need to do it in the manifest file.";
    String l = "Life Cycle of an Activity: onCreate() -> onStart() -> onRestoreInstanceState() -> onResume -> onPause() -> onSaveInstanceState() -> onStop() -> onDestroy().";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = (Button) findViewById(R.id.toast);
        Button event = (Button) findViewById(R.id.event);
        Button history = (Button) findViewById(R.id.history);
        Button orientation = (Button) findViewById(R.id.orientation);
        Button lifecycle = (Button) findViewById(R.id.lifecycle);

        final TextView tv = (TextView) findViewById(R.id.tv);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(t);
            }
        });

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(e);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(h);
            }
        });

        orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(o);
            }
        });

        lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(l);

            }
        });
    }
}