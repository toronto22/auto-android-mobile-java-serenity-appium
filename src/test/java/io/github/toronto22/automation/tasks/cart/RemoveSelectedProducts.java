package io.github.toronto22.automation.tasks.cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RemoveSelectedProducts implements Interaction {
    List<String> items;

    public RemoveSelectedProducts(List<String> items) {
        this.items = items;
    }

    @Step("{0} remove selected products")
    public <T extends Actor> void performAs(T actor) {
        //TODO
    }

    public static RemoveSelectedProducts with(List<String> items) {
        return instrumented(RemoveSelectedProducts.class, items);
    }

}

