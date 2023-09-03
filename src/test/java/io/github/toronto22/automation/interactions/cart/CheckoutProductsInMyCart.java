package io.github.toronto22.automation.interactions.cart;

import io.github.toronto22.automation.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckoutProductsInMyCart implements Interaction {
    User user;

    public CheckoutProductsInMyCart(User user) {
        this.user = user;
    }

    @Step("{0} checkout products in my cart")
    public <T extends Actor> void performAs(T actor) {
        //TODO
    }

    public static CheckoutProductsInMyCart with(User user) {
        return instrumented(CheckoutProductsInMyCart.class, user);
    }

}

