package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.data.UserInformation;
import io.github.toronto22.automation.tasks.authentication.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.Before;


public class BaseTest {
    @CastMember(name = "Toronto22")
    Actor toronto;


    @Before
    public void set_the_stage() {
        toronto.attemptsTo(
                Login.withCredential(UserInformation.torontoUser)
        );
    }
}
