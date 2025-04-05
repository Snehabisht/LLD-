package com.low_level_design.designPattern.observerPattern.observable;

import com.low_level_design.designPattern.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {

    enum STOCKS {
        IPHONE,
        WASHING_MACHINE
    }

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers();

    void setStockCount(int newStocksAdded);

    int getStocksCount();
}
