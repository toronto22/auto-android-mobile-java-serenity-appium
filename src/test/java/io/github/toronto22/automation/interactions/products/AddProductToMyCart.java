package io.github.toronto22.automation.interactions.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;


import static io.github.toronto22.automation.ui.ProductsPage.addToCardButtonByProductName;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToMyCart implements Interaction {
    String itemName;

    public AddProductToMyCart(String itemName) {
        this.itemName = itemName;
    }

    @Step("{0} add product to my card")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(addToCardButtonByProductName.of(itemName))
        );
    }

    public static AddProductToMyCart with(String itemName) {
        return instrumented(AddProductToMyCart.class, itemName);
    }

}

