package com.scaler.lldbasics.designpatterns.factory.components.button;

public class IosButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing ios Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking ios Button");
    }
}
