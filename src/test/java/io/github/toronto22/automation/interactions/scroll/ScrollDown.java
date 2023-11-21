package io.github.toronto22.automation.interactions.scroll;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollDown implements Interaction {
    Target target;
    int limit;

    public ScrollDown(Target target) {
        this.target = target;
        limit = 5;
    }

    public ScrollDown(Target target, int limit) {
        this.target = target;
        this.limit = limit;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        AndroidDriver driver = (AndroidDriver) ((WebDriverFacade) BrowseTheWeb.as(t).getDriver()).getProxiedDriver();
        downToElement(driver, By.xpath(target.getCssOrXPathSelector()), limit);
    }

    public static ScrollDown to(Target target) {
        return instrumented(ScrollDown.class, target);
    }

    public static ScrollDown to(Target target, int limit) {
        return instrumented(ScrollDown.class, target, limit);
    }

    public static void downToElement(AppiumDriver driver, By by, int limit) {
        int count = 0;
        WebElement element = null;
        boolean found = false;
        while (!found && count <= limit) {
            try {
                count++;
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
                element = wait.until(ExpectedConditions.elementToBeClickable(by));
                found = true;
            } catch (TimeoutException e) {
                Dimension size = driver.manage().window().getSize();
                int startX = size.width / 2;
                int startY = (int) (size.height * 0.8);
                int endX = size.width / 2;
                int endY = (int) (size.height * 0.5);

                PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
                Sequence dragNDrop = new Sequence(finger, 1);
                dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
                dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                dragNDrop.addAction(new Pause(finger, Duration.ofMillis(300)));
                dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY));
                dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
                driver.perform(Collections.singletonList(dragNDrop));
            }
        }

        if (element == null) {
            throw new NotFoundException("Cannot find the element: " + by.toString());
        }
    }
}
