package com.scaler.lldbasics.designpatterns.factory.components;

import com.scaler.lldbasics.designpatterns.factory.components.button.AndroidButton;
import com.scaler.lldbasics.designpatterns.factory.components.button.Button;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.AndroidDropDown;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.DropDown;

public class AndroidUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
