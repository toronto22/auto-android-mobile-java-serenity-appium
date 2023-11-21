package io.github.toronto22.automation.tasks.cart;

import io.github.toronto22.automation.interactions.scroll.ScrollAndClick;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static io.github.toronto22.automation.ui.CartPage.continueShoppingButton;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinueShopping implements Interaction {


    @Step("{0} continue shopping")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollAndClick.on(continueShoppingButton, 15)
        );
    }

    public static ContinueShopping perform() {
        return instrumented(ContinueShopping.class);
    }

}

