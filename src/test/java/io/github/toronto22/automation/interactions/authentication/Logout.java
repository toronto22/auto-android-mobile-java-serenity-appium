package io.github.toronto22.automation.interactions.authentication;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static io.github.toronto22.automation.ui.BasePage.logoutButton;
import static io.github.toronto22.automation.ui.BasePage.navigationButton;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Interaction {

    @Step("{0} login")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(navigationButton),
                Click.on(logoutButton)
        );
    }
    @Step("login with credential: {0}")
    public static Logout perform() {
        return instrumented(Logout.class);
    }
}

