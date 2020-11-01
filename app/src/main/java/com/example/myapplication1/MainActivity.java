package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String tag = "tag";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "CLICKED");

                bubbleSort();
            }
        });
    }

    void bubbleSort() {
        Log.d(tag, "SORTING");

        List<Integer> list = new ArrayList<>();
//        list.add(9);
        list.add(14);
        list.add(7);
        list.remove(Integer.valueOf(14));

        for (int i = 0; i < list.size(); ++i) {
            Log.d(tag, String.valueOf(list.get(i)));
        }
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
}