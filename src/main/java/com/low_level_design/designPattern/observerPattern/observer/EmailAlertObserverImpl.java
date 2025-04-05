package com.low_level_design.designPattern.observerPattern.observer;

import com.low_level_design.designPattern.observerPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    StockObservable stockObservable; // req to get info specific to th observable
    String email;

    public EmailAlertObserverImpl(StockObservable stockObservable, String email){
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update(StockObservable.STOCKS stock) {
        sendMessageToEmail(stock);
    }

    void sendMessageToEmail(StockObservable.STOCKS stock){
        System.out.println("hurry! only "+ stockObservable.getStocksCount()+" "+stock+" left");
        System.out.println("email sent to "+email);
    }
}
