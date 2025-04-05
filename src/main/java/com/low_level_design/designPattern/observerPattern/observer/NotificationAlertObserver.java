package com.low_level_design.designPattern.observerPattern.observer;

import com.low_level_design.designPattern.observerPattern.observable.StockObservable;

public interface NotificationAlertObserver {
    void update(StockObservable.STOCKS stock);
}
