package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.interactions.cart.CheckoutProductsInMyCart;
import io.github.toronto22.automation.interactions.products.SelectProductsToPurchase;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static io.github.toronto22.automation.data.UserInformation.torontoUser;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

@RunWith(SerenityRunner.class)
public class OrderingProductsTest extends BaseTest {
    @Test
    @DisplayName("Ordering products successfully")
    public void orderingProductsSuccessfully() {
        List<String> products = new ArrayList<>();
        products.add("Sauce Labs Bike Light");
        products.add("Sauce Labs Backpack");
        when(toronto).attemptsTo(
                SelectProductsToPurchase.with(products),
                CheckoutProductsInMyCart.with(torontoUser)
        );

        //TODO
    }


}
