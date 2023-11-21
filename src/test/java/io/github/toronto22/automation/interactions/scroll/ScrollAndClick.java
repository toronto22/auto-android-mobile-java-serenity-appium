package io.github.toronto22.automation.interactions.scroll;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollAndClick implements Interaction {
    Target target;
    int limit;

    public ScrollAndClick(Target target) {
        this.target = target;
        limit = 5;
    }
    public ScrollAndClick(Target target,int limit) {
        this.target = target;
        this.limit = limit;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                ScrollDown.to(target,limit),
                Click.on(target)
        );
    }

    public static ScrollAndClick on(Target target) {
        return instrumented(ScrollAndClick.class, target);
    }
    public static ScrollAndClick on(Target target, int limit) {
        return instrumented(ScrollAndClick.class, target, limit);
    }
}
