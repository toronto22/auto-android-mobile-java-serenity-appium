package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutInformationPage {
    //Checkout Information
    public static final Target firstNameInput =  Target.the("First Name Input").located(
            By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"));
    public static final Target lastNameInput =  Target.the("Last Name Input").located(
            By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]"));
    public static final Target zipCodeInput =  Target.the("Zip Code Input").located(
            By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]"));
    public static final Target cancelButton =  Target.the("Cancel Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-CANCEL\"]/android.widget.TextView"));
    public static final Target continueButton =  Target.the("Continue Button").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView"));
}
