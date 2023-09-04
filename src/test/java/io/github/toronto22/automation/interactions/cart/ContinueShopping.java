package io.github.toronto22.automation.interactions.cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinueShopping implements Interaction {


    @Step("{0} continue shopping")
    public <T extends Actor> void performAs(T actor) {
        //TODO
    }

    public static ContinueShopping with() {
        return instrumented(ContinueShopping.class);
    }

}

