package io.github.toronto22.automation.questions.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static io.github.toronto22.automation.ui.CheckoutCompletePage.backHomeButton;

public class CheckoutCompletedPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return backHomeButton.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> isDisplayed() { return new CheckoutCompletedPage(); }
}
