package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target usernameInput =  Target.the("Username Input").located(
            By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));
    public static final Target passwordInput = Target.the("Username Input").located(
            By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));
    public static final Target loginButton = Target.the("Username Input").located(
            By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));
}
