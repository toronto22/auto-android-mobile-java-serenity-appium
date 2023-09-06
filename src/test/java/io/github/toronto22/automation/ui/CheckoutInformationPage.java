package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutInformationPage {
    //Checkout Information
    public static final Target firstNameInput =  Target.the("First Name Input").located(
            By.xpath(""));
    public static final Target lastNameInput =  Target.the("Last Name Input").located(
            By.xpath(""));
    public static final Target zipCodeInput =  Target.the("Zip Code Input").located(
            By.xpath(""));
    public static final Target cancelButton =  Target.the("Cancel Button").located(
            By.xpath(""));
    public static final Target continueButton =  Target.the("Continue Button").located(
            By.xpath(""));
}
