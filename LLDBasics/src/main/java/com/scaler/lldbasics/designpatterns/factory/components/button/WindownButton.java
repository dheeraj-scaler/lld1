package com.scaler.lldbasics.designpatterns.factory.components.button;

public class WindownButton implements Button {

    @Override
    public void showButton() {
        System.out.println("Showing windows Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking windows Button");
    }
}
