package io.github.toronto22.automation.tasks.authentication;

import io.github.toronto22.automation.model.User;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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
    @Step("login with credential: {0}")
    public static Login withCredential(User user) {
        return instrumented(Login.class, user.getUsername(), user.getPassword());
    }
}

