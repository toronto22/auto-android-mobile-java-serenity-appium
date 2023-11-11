package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInformationPage {
    //Checkout Information
    public static final Target firstNameInput = Target.the("First Name Input").locatedBy(
            "//android.widget.EditText[@content-desc=\"test-First Name\"]");
    public static final Target lastNameInput = Target.the("Last Name Input").locatedBy(
            "//android.widget.EditText[@content-desc=\"test-Last Name\"]");
    public static final Target zipCodeInput = Target.the("Zip Code Input").locatedBy(
            "//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]");
    public static final Target cancelButton = Target.the("Cancel Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-CANCEL\"]/android.widget.TextView");
    public static final Target continueButton = Target.the("Continue Button").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView");
}
