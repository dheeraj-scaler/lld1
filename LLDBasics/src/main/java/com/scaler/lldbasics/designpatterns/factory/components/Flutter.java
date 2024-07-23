package com.scaler.lldbasics.designpatterns.factory.components;

public class Flutter {

    void refreshUI() {
        System.out.println("Refreshing the UI");
    }

    void setTheme() {
        System.out.println(" Setting the theme");
    }

    public UiFactory getFactory(SupportedPlatform platformName) {
        return UiFactoryFactory.getUiFactoryUsingPlatformName(platformName);
    }
}
