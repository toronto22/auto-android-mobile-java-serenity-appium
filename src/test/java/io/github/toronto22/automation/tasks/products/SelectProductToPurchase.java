package io.github.toronto22.automation.tasks.products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;


import static io.github.toronto22.automation.ui.ProductsPage.addToCardButtonByProductName;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProductToPurchase implements Interaction {
    String product;

    public SelectProductToPurchase(String itemName) {
        this.product = itemName;
    }

    @Step("{0} select product to purchase")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(addToCardButtonByProductName.of(product))
        );
    }

    public static SelectProductToPurchase with(String product) {
        return instrumented(SelectProductToPurchase.class, product);
    }

}

