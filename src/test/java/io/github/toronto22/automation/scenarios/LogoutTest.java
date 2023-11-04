package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.tasks.authentication.Logout;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.github.toronto22.automation.ui.LoginPage.loginButton;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class LogoutTest extends BaseTest{
    @Test
    public void customerLogoutSuccessfully() {
        when(toronto).attemptsTo(
                Logout.perform()
        );

        then(toronto).attemptsTo(
                Ensure.that(loginButton).isDisplayed()
        );
    }


}
