package org.example.automation.questions.factory;

import net.serenitybdd.screenplay.Question;
import org.example.automation.model.Note;
import org.example.automation.questions.NumberOfNotesInDashboard;
import org.example.automation.questions.PresentNotesInDashboard;

import java.util.List;


public class NoteDashboard {
    public static Question<Integer> numberOfNotes() {
        return new NumberOfNotesInDashboard();
    }

    public static Question<List<Note>> displayed() {
        return new PresentNotesInDashboard();
    }
}
