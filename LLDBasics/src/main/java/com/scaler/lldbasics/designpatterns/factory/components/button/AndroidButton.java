package com.scaler.lldbasics.designpatterns.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing android Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Android Button");
    }
}
