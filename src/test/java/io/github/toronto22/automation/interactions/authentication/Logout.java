package io.github.toronto22.automation.interactions.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Interaction {

    @Step("{0} login")
    public <T extends Actor> void performAs(T actor) {
      //TODO
    }
    @Step("login with credential: {0}")
    public static Logout perform() {
        return instrumented(Logout.class);
    }
}

