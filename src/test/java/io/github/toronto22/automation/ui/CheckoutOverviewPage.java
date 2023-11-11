package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOverviewPage {
    public static final Target finishButton = Target.the("Continue Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-FINISH\"]/android.widget.TextView");
}
