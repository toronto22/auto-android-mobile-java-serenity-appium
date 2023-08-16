package io.github.toronto22.automation.interactions;

import io.github.toronto22.automation.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static io.github.toronto22.automation.ui.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Interaction {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Step("{0} login")
    public <T extends Actor> void performAs(T actor) {
        if (username != null && !username.equals("")) {
            actor.attemptsTo(
                    Enter.theValue(username).into(usernameInput)
            );
        }
        if (password != null && !password.equals("")) {
            actor.attemptsTo(
                    Enter.theValue(password).into(passwordInput)
            );
        }
        actor.attemptsTo(
                Click.on(loginButton)
        );
    }

    public static Login with(User user) {
        return instrumented(Login.class, user.getUsername(), user.getPassword());
    }
}

