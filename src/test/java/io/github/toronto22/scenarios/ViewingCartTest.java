package io.github.toronto22.scenarios;

import io.github.toronto22.BaseTest;
import io.github.toronto22.automation.questions.cart.SelectedProduct;
import io.github.toronto22.automation.tasks.cart.ContinueShopping;
import io.github.toronto22.automation.tasks.cart.RemoveSelectedProducts;
import io.github.toronto22.automation.tasks.products.SelectProductsToPurchase;
import io.github.toronto22.automation.tasks.products.ViewMyCart;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static io.github.toronto22.automation.ui.ProductsPage.titleLabel;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class ViewingCartTest extends BaseTest {


    @Test
    public void customerViewThereCartAfterSelectProductsToPurchase() {
        List<String> items = new ArrayList<>();
        items.add("Sauce Labs Bike Light");
        items.add("Sauce Labs Backpack");
        items.add("Sauce Labs Bolt T-Shirt");
        items.add("Sauce Labs Fleece Jacket");
        items.add("Sauce Labs Onesie");
        items.add("Test.allTheThings() T-Shirt (Red)");

        when(toronto).attemptsTo(
                SelectProductsToPurchase.with(items),
                ViewMyCart.perform()
        );
        then(toronto).should(
                seeThat(SelectedProduct.consistOf(items), Matchers.is(true))
        );

    }

    @Test
    public void customerRemoveProductsToBuyInThereCart() {
        List<String> items = new ArrayList<>();
        items.add("Sauce Labs Bike Light");
        items.add("Sauce Labs Backpack");
        items.add("Sauce Labs Bolt T-Shirt");
        items.add("Sauce Labs Fleece Jacket");
        items.add("Sauce Labs Onesie");
        items.add("Test.allTheThings() T-Shirt (Red)");

        List<String> removedItems = new ArrayList<>();
        removedItems.add("Sauce Labs Bike Light");
        removedItems.add("Sauce Labs Onesie");
        removedItems.add("Test.allTheThings() T-Shirt (Red)");
        when(toronto).attemptsTo(
                SelectProductsToPurchase.with(items),
                ViewMyCart.perform(),
                RemoveSelectedProducts.with(removedItems)
        );
        items.removeAll(removedItems);
        then(toronto).should(
                seeThat(SelectedProduct.consistOf(items), Matchers.is(true))
        );
    }

    @Test
    public void customerContinueToBuyMoreItem() {
        List<String> items = new ArrayList<>();
        items.add("Sauce Labs Bike Light");
        items.add("Sauce Labs Backpack");
        items.add("Sauce Labs Bolt T-Shirt");
        items.add("Sauce Labs Fleece Jacket");
        items.add("Sauce Labs Onesie");
        items.add("Test.allTheThings() T-Shirt (Red)");
        when(toronto).attemptsTo(
                SelectProductsToPurchase.with(items),
                ViewMyCart.perform(),
                ContinueShopping.perform()
        );

        then(toronto).attemptsTo(
                Ensure.that(titleLabel).isDisplayed()
        );

    }


}
