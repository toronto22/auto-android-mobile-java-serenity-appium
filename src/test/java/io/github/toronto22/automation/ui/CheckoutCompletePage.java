package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutCompletePage {
    public static final Target backHomeButton = Target.the("Continue Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-BACK HOME\"]/android.widget.TextView");
}
