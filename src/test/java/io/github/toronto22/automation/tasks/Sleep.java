package io.github.toronto22.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Sleep implements Task {
    int seconds;

    public Sleep(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Sleep in(int seconds) {
        return instrumented(Sleep.class, seconds);
    }
}
