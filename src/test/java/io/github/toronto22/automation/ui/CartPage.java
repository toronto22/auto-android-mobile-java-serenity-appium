package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target checkoutButton = Target.the("Checkout Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]");
    public static final Target removeItemButtonByName = Target.the("Remove Item Button By Name").locatedBy(
            "//*[@text='{0}']/../..//android.view.ViewGroup[@content-desc='test-REMOVE']");
}
