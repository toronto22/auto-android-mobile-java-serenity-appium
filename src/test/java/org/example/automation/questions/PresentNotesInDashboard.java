package org.example.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.example.automation.model.Note;
import org.example.automation.ui.builder.NoteBuilder;

import java.util.List;

public class PresentNotesInDashboard implements Question<List<Note>> {
    @Override
    public List<Note> answeredBy(Actor actor) {
        return  NoteBuilder.getNoteListInUI(actor);
    }
}
