package io.github.toronto22.automation.interactions.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductsToMyCart implements Interaction {
    List<String> items;

    public AddProductsToMyCart(List<String> items) {
        this.items = items;
    }

    @Step("{0} add products to my card")
    public <T extends Actor> void performAs(T actor) {
        for (String item : items) {
            AddProductToMyCart.with(item);
        }
    }

    public static AddProductsToMyCart with(List<String> items) {
        return instrumented(AddProductsToMyCart.class, items);
    }

}

