package org.example.automation.testcases;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.example.automation.model.Note;
import org.example.automation.questions.factory.NoteDashboard;
import org.example.automation.tasks.AddANote;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

public class OpenNoteTest {
    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;
    private Note note = new Note();
    List<Note> notes = new ArrayList();
    Actor toronto = new Actor("Toronto22");

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        toronto.can(BrowseTheWeb.with(herMobileDevice));
    }


    @Test
    public void add_note_successfully(){
        theActorInTheSpotlight().attemptsTo(AddANote.with(note));

        this.note = new Note.NoteBuilder().called("Test Note").
                withDescription("Description Test").build();
        toronto.attemptsTo(AddANote.with(note));
        toronto.should(
                seeThat(NoteDashboard.numberOfNotes(),is(3)),
                seeThat(NoteDashboard.displayed(), hasItem(note))
        );
    }
}
