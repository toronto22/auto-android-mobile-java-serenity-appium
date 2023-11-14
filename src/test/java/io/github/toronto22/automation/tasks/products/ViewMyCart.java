package io.github.toronto22.automation.tasks.products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;


import static io.github.toronto22.automation.ui.BasePage.cartIcon;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewMyCart implements Interaction {


    @Step("{0} view my cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(cartIcon)
        );
    }

    public static ViewMyCart perform() {
        return instrumented(ViewMyCart.class);
    }

}

