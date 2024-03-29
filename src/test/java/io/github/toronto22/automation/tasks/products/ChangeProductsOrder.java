package io.github.toronto22.automation.tasks.products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangeProductsOrder implements Interaction {
    String rule;

    public ChangeProductsOrder(String rule) {
        this.rule = rule;
    }

    @Step("{0} change products order")
    public <T extends Actor> void performAs(T actor) {
        //TODO
    }

    public static ChangeProductsOrder by(String rule) {
        return instrumented(ChangeProductsOrder.class, rule);
    }

}

