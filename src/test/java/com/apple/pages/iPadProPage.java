package com.apple.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iPadProPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='iPad Pro']")
    public WebElement ipad_pro_subtile;
}
