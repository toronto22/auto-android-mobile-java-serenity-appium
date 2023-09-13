package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompletePage {
    public static final Target backHomeButton =  Target.the("Continue Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-BACK HOME\"]/android.widget.TextView"));
}
