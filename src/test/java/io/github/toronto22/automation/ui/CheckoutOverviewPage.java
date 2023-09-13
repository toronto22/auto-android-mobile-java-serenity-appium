package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewPage {
    public static final Target finishButton =  Target.the("Continue Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]/android.widget.TextView"));
    public static final Target cancelButton =  Target.the("Cancel Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-CANCEL\"]/android.widget.TextView"));
}
