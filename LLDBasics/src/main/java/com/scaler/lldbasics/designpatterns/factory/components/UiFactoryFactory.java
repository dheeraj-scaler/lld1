package com.scaler.lldbasics.designpatterns.factory.components;

public class UiFactoryFactory {
    // Practical factory
    public static UiFactory getUiFactoryUsingPlatformName(SupportedPlatform platformName) {
        if(platformName.equals(SupportedPlatform.ANDROID)) {
            return new AndroidUiFactory();
        } else if(platformName.equals(SupportedPlatform.IOS)) {
            return new IosUiFactory();
        } else {
            return new WindowsUiFactory();
        }
    }
}
