package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target continueShoppingButton =  Target.the("Continue Shopping Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE SHOPPING\"]/android.widget.TextView"));

    public static final Target checkoutButton =  Target.the("Checkout Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView"));

}
