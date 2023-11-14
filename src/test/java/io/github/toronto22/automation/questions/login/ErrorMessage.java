package io.github.toronto22.automation.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static io.github.toronto22.automation.ui.LoginPage.errorMessageLabel;


@Subject("the displayed username")
public class ErrorMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return errorMessageLabel.resolveFor(actor).getText();
    }

    public static Question<String> text() { return new ErrorMessage(); }

}