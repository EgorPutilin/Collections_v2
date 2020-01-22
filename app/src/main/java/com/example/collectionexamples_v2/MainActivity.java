package com.example.collectionexamples_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Cat();
    }

    private void print2(ArrayList<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println("Cat name: " + cat.getName());
        }
    }
}
