package com.low_level_design.designPattern.observerPattern.observer;

import com.low_level_design.designPattern.observerPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    StockObservable stockObservable;
    String phone;

    public MobileAlertObserverImpl(StockObservable stockObservable  , String phone){
        this.stockObservable = stockObservable;
        this.phone = phone;
    }

    @Override
    public void update(StockObservable.STOCKS stock) {
        sendMessageToPhone(stock);
    }
    void sendMessageToPhone(StockObservable.STOCKS stock){
        System.out.println("hurry! only "+ stockObservable.getStocksCount()+" "+stock+" left");
        System.out.println("message sent to "+phone);
    }
}
