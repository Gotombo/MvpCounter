package com.example.mvpcounter.ui;

public class PresenterContract {
    interface CounterView{
        void updateCounter(int counter);
        void showToast();
        void changeTextColor();
    }
    interface CounterPresenter{
       public void increment();
        public void decrement();
        void checkConditionForToast();
        void checkConditionForTextColor();
        void attachView(CounterView counterView);
    }
}
