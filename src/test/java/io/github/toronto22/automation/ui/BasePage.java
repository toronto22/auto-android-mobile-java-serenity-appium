package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BasePage {
    public static final Target navigationButton =  Target.the("Navigation Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView"));
    //NAVIGATION
    public static final Target logoutButton =  Target.the("Logout Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]"));
}
