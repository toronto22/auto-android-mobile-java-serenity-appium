package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BasePage {
    public static final Target navigationButton = Target.the("Navigation Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");

    public static final Target cartIcon = Target.the("Cart Icon").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
    //NAVIGATION
    public static final Target logoutButton = Target.the("Logout Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]");
}
