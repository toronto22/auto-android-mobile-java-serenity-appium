package io.github.toronto22.automation.tasks.products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RemoveProductsFromMyCart implements Interaction {
    List<String> items;

    public RemoveProductsFromMyCart(List<String> items) {
        this.items = items;
    }

    @Step("{0} remove products from my card")
    public <T extends Actor> void performAs(T actor) {
      //TODO
    }

    public static RemoveProductsFromMyCart with(List<String> items) {
        return instrumented(RemoveProductsFromMyCart.class, items);
    }

}

