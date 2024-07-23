package com.scaler.lldbasics.designpatterns.factory.components;

import com.scaler.lldbasics.designpatterns.factory.components.button.Button;
import com.scaler.lldbasics.designpatterns.factory.components.button.IosButton;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.DropDown;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.IosDropDown;

public class IosUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
