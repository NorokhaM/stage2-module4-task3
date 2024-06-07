package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver  implements Observer {

    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle=event.getSource();
        double a=rectangle.getSideA();
        double b=rectangle.getSideB();
        RectangleValues rectangleValues=new RectangleValues(a*b, 2*a+2*b);
        RectangleWarehouse.getInstance().put(rectangle.getId(),rectangleValues);
    }
}
