package org.example.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.example.automation.ui.NoteDetailsPage;

public class DetailNote implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return NoteDetailsPage.PICTURE_FIELD.resolveFor(actor).isCurrentlyVisible();
    }

    public static DetailNote hasPicture() {
        return new DetailNote();
    }
}
