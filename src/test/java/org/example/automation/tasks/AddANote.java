package org.example.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;
import org.example.automation.interactions.EnterANote;
import org.example.automation.model.Note;
import org.example.automation.ui.AddNotePage;
import org.example.automation.ui.NotesWelcomePage;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AddANote implements Task {

    private final Note note;

    protected AddANote(Note note) {
        this.note = note;
    }

    @Step("{0} adds a note")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NotesWelcomePage.ADD_NOTE_BUTTON),
                EnterANote.with(note),
                Click.on(AddNotePage.CONFIRM_ADD_NOTE_BUTTON)
        );
    }

    public static AddANote with(Note note) {
        return instrumented(AddANote.class, note);
    }
}

