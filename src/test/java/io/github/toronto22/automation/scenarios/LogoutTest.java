package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.interactions.authentication.Logout;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LogoutTest extends BaseTest{
    @Test
    @DisplayName("Customer logout successfully")
    public void customerLogoutSuccessfully() {
        toronto.attemptsTo(
                Logout.perform()
        );
    }


}
