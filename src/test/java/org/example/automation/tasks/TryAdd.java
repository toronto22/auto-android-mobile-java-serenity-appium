package org.example.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import org.example.automation.ui.AddNotePage;
import org.example.automation.ui.NotesWelcomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TryAdd implements Task {

    @Step("{0} tries to add a note, and cancel")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NotesWelcomePage.ADD_NOTE_BUTTON),
                Click.on(AddNotePage.CANCEL_ADD_NOTE_BUTTON)
        );
    }

    public static TryAdd andCancel() {
        return instrumented(TryAdd.class);
    }
}
