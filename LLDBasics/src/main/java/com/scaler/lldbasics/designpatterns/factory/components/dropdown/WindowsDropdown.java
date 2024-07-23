package com.scaler.lldbasics.designpatterns.factory.components.dropdown;

public class WindowsDropdown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Showing windows dropdown");
    }

    @Override
    public void clickDropDown() {
        System.out.println("Clicking windows dropdown");
    }
}
