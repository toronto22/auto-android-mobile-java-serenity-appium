package io.github.toronto22.automation.interactions.products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProductsToPurchase implements Interaction {
    List<String> products;

    public SelectProductsToPurchase(List<String> items) {
        this.products = items;
    }

    @Step("{0} select products to purchase")
    public <T extends Actor> void performAs(T actor) {
        for (String product : products) {
            SelectProductToPurchase.with(product);
        }
    }

    public static SelectProductsToPurchase with(List<String> items) {
        return instrumented(SelectProductsToPurchase.class, items);
    }

}

