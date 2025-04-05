package com.low_level_design.designPattern.observerPattern;

import com.low_level_design.designPattern.observerPattern.observable.IphoneObservableImpl;
import com.low_level_design.designPattern.observerPattern.observable.StockObservable;
import com.low_level_design.designPattern.observerPattern.observer.EmailAlertObserverImpl;
import com.low_level_design.designPattern.observerPattern.observer.MobileAlertObserverImpl;
import com.low_level_design.designPattern.observerPattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new MobileAlertObserverImpl(iphoneObservable,"00123");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneObservable,"xyz@abc.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphoneObservable,"9086");

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
        System.out.println();
        iphoneObservable.setStockCount(-10);
        System.out.println();
        iphoneObservable.setStockCount(100);

    }
}
