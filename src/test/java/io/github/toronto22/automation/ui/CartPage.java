package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target checkoutButton = Target.the("Checkout Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]");

}
