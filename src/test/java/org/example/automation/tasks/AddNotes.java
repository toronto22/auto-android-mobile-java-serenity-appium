package org.example.automation.tasks;

import com.google.common.collect.ImmutableList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.example.automation.model.Note;


import java.util.Collection;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AddNotes implements Task {

    private final List<Note> notes;

    protected AddNotes(List<Note> notes) {
        this.notes = ImmutableList.copyOf(notes);
    }

    @Step("{0} adds several notes")
    public <T extends Actor> void performAs(T actor) {
        notes.forEach(
                note -> actor.attemptsTo(AddANote.with(note))
        );
    }

    public static AddNotes with(Collection<Note> notes) {
        return instrumented(AddNotes.class, notes);
    }
}

