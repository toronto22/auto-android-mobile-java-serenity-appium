package io.github.toronto22.scenarios;

import io.github.toronto22.BaseTest;
import io.github.toronto22.automation.questions.navigation.CheckoutCompletedPage;
import io.github.toronto22.automation.tasks.cart.CheckoutProductsInMyCart;
import io.github.toronto22.automation.tasks.products.SelectProductsToPurchase;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static io.github.toronto22.automation.data.UserInformation.torontoUser;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class OrderingProductsTest extends BaseTest {
    @Test
    public void orderingProductsSuccessfully() {
        List<String> products = new ArrayList<>();
        products.add("Sauce Labs Bike Light");
        products.add("Sauce Labs Backpack");
        when(toronto).attemptsTo(
                SelectProductsToPurchase.with(products),
                CheckoutProductsInMyCart.with(torontoUser)
        );
        then(toronto).should(
                seeThat(CheckoutCompletedPage.isDisplayed(), Matchers.is(true))
        );

    }


}
