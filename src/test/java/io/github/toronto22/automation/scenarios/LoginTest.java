package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.data.UserInformation;
import io.github.toronto22.automation.interactions.authentication.Login;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(driver = "Appium")
    @Steps
    public WebDriver herMobileDevice;
    @CastMember(name = "Toronto22")
    Actor toronto;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        toronto.can(BrowseTheWeb.with(herMobileDevice));
    }

    @Test
    @DisplayName("Login Successfully With Valid Credential")
    public void loginSuccessfullyWithValidCredential() {
        toronto.attemptsTo(
                Login.withCredential(UserInformation.validUser)
        );
    }

    @Test
    @DisplayName("Login Unsuccessfully With Invalid Credential")
    public void loginUnsuccessfullyWithInvalidCredential() {
        toronto.attemptsTo(
                Login.withCredential(UserInformation.invalidUser)
        );
        //TODO
    }

}
