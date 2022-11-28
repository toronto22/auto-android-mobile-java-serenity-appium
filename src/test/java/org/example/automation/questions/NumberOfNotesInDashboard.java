package org.example.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.example.automation.ui.NotesWelcomePage;

public class NumberOfNotesInDashboard implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return NotesWelcomePage.NOTES.resolveAllFor(actor).size();
    }
}
