package io.github.toronto22.scenarios;

import io.github.toronto22.automation.data.UserInformation;
import io.github.toronto22.automation.tasks.authentication.Login;
import io.github.toronto22.automation.questions.login.ErrorMessage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.github.toronto22.automation.ui.ProductsPage.titleLabel;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @CastMember(name = "Toronto22")
    Actor toronto;

    @Test
    public void loginSuccessfullyWithValidCredential() {
        toronto.attemptsTo(
                Login.withCredential(UserInformation.validUser),
                Ensure.that(titleLabel).isDisplayed()
        );
    }

    @Test
    public void loginUnsuccessfullyWithInvalidCredential() {
        String errorMessage = "Username and password do not match any user in this service.";
        when(toronto).attemptsTo(
                Login.withCredential(UserInformation.invalidUser)
        );

       then(toronto).should(
               seeThat("The error message", ErrorMessage.text(),equalTo(errorMessage))
       );
    }

}
