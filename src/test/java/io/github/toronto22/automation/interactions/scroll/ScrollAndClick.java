package io.github.toronto22.automation.interactions.scroll;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollAndClick implements Interaction {
    Target target;

    public ScrollAndClick(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                ScrollDown.to(target),
                Click.on(target)
        );
    }

    public static ScrollAndClick on(Target target) {
        return instrumented(ScrollAndClick.class, target);
    }

}
