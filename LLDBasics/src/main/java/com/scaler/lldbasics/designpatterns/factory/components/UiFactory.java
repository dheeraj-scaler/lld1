package com.scaler.lldbasics.designpatterns.factory.components;

import com.scaler.lldbasics.designpatterns.factory.components.button.Button;
import com.scaler.lldbasics.designpatterns.factory.components.dropdown.DropDown;

public interface UiFactory {

    Button createButton();
    DropDown createDropDown();
}
