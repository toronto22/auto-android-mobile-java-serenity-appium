package io.github.toronto22.automation.questions.cart;

import io.github.toronto22.automation.interactions.scroll.ScrollDown;
import io.github.toronto22.automation.questions.navigation.CheckoutCompletedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import java.util.List;

import static io.github.toronto22.automation.ui.CartPage.removeItemButtonByName;

public class SelectedProduct implements Question<Boolean> {
    List<String> items;

    public SelectedProduct(List<String> items) {
        this.items = items;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        for (String item: items) {
            ScrollDown.to(removeItemButtonByName.of(item)).performAs(actor);
            boolean isDisplayed = actor.asksFor(Visibility.of(removeItemButtonByName.of(item)));
            if(!isDisplayed) return false;
        }
        return true;
    }

    public static Question<Boolean> consistOf(List<String> items) { return new SelectedProduct(items); }
}
