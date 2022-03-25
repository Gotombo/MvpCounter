package com.example.mvpcounter.ui;

import android.content.Context;
import android.widget.Toast;

public class CounterModel {
    public int count = 0;
    public int getCount() {
        return count;
    }

    public void increment(){
        ++count;


    }

    public void decrement(){
        --count;
    }
}