package io.github.toronto22.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;


import static io.github.toronto22.automation.ui.ProductsPage.addToCardButtonByProductName;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCard implements Interaction {
    String itemName;

    public AddToCard(String itemName) {
        this.itemName = itemName;
    }

    @Step("{0} add to card")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(addToCardButtonByProductName.of(itemName))
        );

    }

    public static AddToCard with(String itemName) {
        return instrumented(AddToCard.class, itemName);
    }

}

