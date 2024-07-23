package com.scaler.lldbasics.designpatterns.factory.components;

import com.scaler.lldbasics.designpatterns.factory.components.button.Button;
import com.scaler.lldbasics.designpatterns.factory.components.button.WindownButton;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.DropDown;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.WindowsDropdown;

public class WindowsUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new WindownButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropdown();
    }
}
