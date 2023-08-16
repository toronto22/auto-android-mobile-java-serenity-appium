package io.github.toronto22.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
    public static Target titleLabel = Target.the("Products Title").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView");
    public static Target addToCardButtonByProductName = Target.the("Products with Title {0}").locatedBy(
            "//android.widget.TextView[@text='{0}']/../*[@content-desc='test-ADD TO CART']");

    public static Target productTitleLabel = Target.the("Products Title by name {0}").locatedBy(
            "//android.widget.TextView[@text='{0}']");
    public static Target productImageLabel = Target.the("Products image of product {0}").locatedBy(
            "//android.widget.TextView[@text='{0}']/../android.widget.ImageView");
    public static Target productPriceLabel = Target.the("Products price of product {0}").locatedBy(
            "//android.widget.TextView[@text='{0}']/../*[@content-desc='test-Price']");
    public static Target productItems = Target.the("Products items").locatedBy(
            "//android.view.ViewGroup[@content-desc='test-Item']");
    public static Target changeViewIcon = Target.the("Change view Icon").locatedBy(
            "//android.view.ViewGroup[@content-desc='test-Toggle']/android.widget.ImageView");
    public static Target filterIcon = Target.the("Filter Icon").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]");
    public static Target menuIcon = Target.the("Menu Icon").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-Menu\"]");
    public static Target cardIcon = Target.the("Card Icon").locatedBy(
            "//android.view.ViewGroup[@content-desc=\"test-Cart\"]");
    //Filter panel
    public static Target filterNameAToZButton = Target.the("Filter A to Z button").locatedBy(
            "//*[@text='Name (A to Z)']");
    public static Target filterNameZToAButton = Target.the("Filter Name (Z to A) button").locatedBy(
            "//*[@text='Name (Z to A)']");
    public static Target filterPriceLowToHighButton = Target.the("Filter Price (low to high) button").locatedBy(
            "//*[@text='Price (low to high)']");
    public static Target filterPriceHighToLowButton = Target.the("Filter Price (high to low) button").locatedBy(
            "//*[@text='Price (high to low)']");
    public static Target filterCancelButton = Target.the("Filter cancel button").locatedBy(
            "//*[@text='Cancel']");
}
