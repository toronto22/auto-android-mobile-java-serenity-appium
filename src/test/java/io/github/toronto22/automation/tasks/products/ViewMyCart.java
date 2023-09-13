package io.github.toronto22.automation.tasks.products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewMyCart implements Interaction {


    @Step("{0} view my cart")
    public <T extends Actor> void performAs(T actor) {
        //TODO
    }

    public static ViewMyCart perform() {
        return instrumented(ViewMyCart.class);
    }

}

