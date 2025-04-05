package com.low_level_design.designPattern.observerPattern.observable;

import com.low_level_design.designPattern.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

import static com.low_level_design.designPattern.observerPattern.observable.StockObservable.STOCKS.IPHONE;

public class IphoneObservableImpl implements StockObservable{

    int stocksCount;
    List<NotificationAlertObserver> observerList = new ArrayList<>();

    public IphoneObservableImpl(){
        this.stocksCount = 0;
    }

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: observerList){
            notificationAlertObserver.update(IPHONE);
        }
    }

    @Override
    public void setStockCount(int newStocksAdded) {
        if(stocksCount == 0){
            stocksCount += newStocksAdded;
            notifySubscribers();
        } else {
            stocksCount += newStocksAdded;
        }
    }

    @Override
    public int getStocksCount() {
        return stocksCount;
    }
}
