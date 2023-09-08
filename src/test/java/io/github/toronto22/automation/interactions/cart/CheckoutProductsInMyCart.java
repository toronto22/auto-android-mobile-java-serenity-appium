package io.github.toronto22.automation.interactions.cart;

import io.github.toronto22.automation.model.User;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static io.github.toronto22.automation.ui.BasePage.cartIcon;
import static io.github.toronto22.automation.ui.CartPage.checkoutButton;
import static io.github.toronto22.automation.ui.CheckoutInformationPage.*;
import static io.github.toronto22.automation.ui.CheckoutOverviewPage.finishButton;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckoutProductsInMyCart implements Interaction {
    User user;

    public CheckoutProductsInMyCart(User user) {
        this.user = user;
    }

    @Step("{0} checkout products in my cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(cartIcon),

                //Cart
                Click.on(checkoutButton),

                //Checkout: Information
                Enter.theValue(user.getFirstName()).into(firstNameInput),
                Enter.theValue(user.getLastName()).into(lastNameInput),
                Enter.theValue(user.getZipCode()).into(zipCodeInput),
                Click.on(continueButton),

                //Checkout: Overview
                Click.on(finishButton)
        );
    }

    public static CheckoutProductsInMyCart with(User user) {
        return instrumented(CheckoutProductsInMyCart.class, user);
    }

}

