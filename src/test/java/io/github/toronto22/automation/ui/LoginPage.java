package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target usernameInput = Target.the("Username Input").locatedBy(
            "//android.widget.EditText[@content-desc=\"test-Username\"]");
    public static final Target passwordInput = Target.the("Username Input").locatedBy(
            "//android.widget.EditText[@content-desc=\"test-Password\"]");
    public static final Target loginButton = Target.the("Username Input").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]");

    public static final Target errorMessageLabel = Target.the("Error Message").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView");
}
