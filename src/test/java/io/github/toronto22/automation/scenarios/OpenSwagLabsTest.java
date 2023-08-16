package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.interactions.AddToCard;
import io.github.toronto22.automation.interactions.Login;
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

import static io.github.toronto22.automation.data.UserInformation.validUser;
@RunWith(SerenityRunner.class)
public class OpenSwagLabsTest {
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
    @DisplayName("Login to application successfully")
    public void loginWithValidCredential() {
        toronto.attemptsTo(Login.with(validUser));
    }

    @Test
    @DisplayName("Add to card successfully")
    public void AddToCardAnItem() {
        String item = "Sauce Labs Backpack";
        toronto.attemptsTo(
                Login.with(validUser),
                AddToCard.with(item)
        );
    }
}
