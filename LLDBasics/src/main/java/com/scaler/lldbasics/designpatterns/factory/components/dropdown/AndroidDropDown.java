package com.scaler.lldbasics.designpatterns.factory.components.dropdown;

public class AndroidDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing Android dropdown");
    }

    @Override
    public void clickDropDown() {
        System.out.println("Clicking Android dropdown");
    }
}
