package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.data.UserInformation;
import io.github.toronto22.automation.tasks.authentication.Login;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest {
    @Managed(driver = "Appium")
    @Steps
    public WebDriver herMobileDevice;
    @CastMember(name = "Toronto22")
    Actor toronto;


    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        toronto.can(BrowseTheWeb.with(herMobileDevice));

        toronto.attemptsTo(
                Login.withCredential(UserInformation.torontoUser)
        );
    }
}
