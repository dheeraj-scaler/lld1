package com.scaler.lldbasics.designpatterns.factory.components.dropdown;

public class IosDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Showing Ios dropdown");
    }

    @Override
    public void clickDropDown() {
        System.out.println("Clicking Ios dropdown");
    }
}
