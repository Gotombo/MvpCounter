package com.example.mvpcounter.ui;

import android.widget.TextView;
import android.widget.Toast;

public class CounterPresenter implements PresenterContract.CounterPresenter{
    PresenterContract.CounterView counterView;
    CounterModel counterModel;

    public CounterPresenter(){
        counterModel = new CounterModel();

    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCounter(counterModel.getCount());



    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCounter(counterModel.getCount());
    }
    @Override
    public void checkConditionForToast() {
        if (counterModel.getCount() == 5) {
            counterView.showToast();
        }
    }

    @Override
    public void checkConditionForTextColor() {
        if( counterModel.getCount() == 10){
            counterView.changeTextColor();

        }
    }



    @Override
    public void attachView(PresenterContract.CounterView counterView) {
        this.counterView = counterView;

    }
}
