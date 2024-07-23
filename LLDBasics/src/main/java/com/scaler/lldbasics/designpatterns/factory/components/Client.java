package com.scaler.lldbasics.designpatterns.factory.components;

import com.scaler.lldbasics.designpatterns.factory.components.button.Button;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.DropDown;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.getFactory(SupportedPlatform.IOS);

        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.clickDropDown();
    }
}
