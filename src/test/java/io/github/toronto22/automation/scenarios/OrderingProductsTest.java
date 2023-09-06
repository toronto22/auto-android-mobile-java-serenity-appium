package io.github.toronto22.automation.scenarios;

import io.github.toronto22.automation.interactions.products.SelectProductsToPurchase;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(SerenityRunner.class)
public class OrderingProductsTest extends BaseTest {
    @Test
    @DisplayName("Ordering products successfully")
    public void orderingProductsSuccessfully() {
        List<String> products = new ArrayList<>();
        toronto.attemptsTo(
                SelectProductsToPurchase.with(products)
        );
    }


}
