package com.apple.pages;

import com.apple.utilities.BrowserUtils;
import com.apple.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void appleNavigator(String tab, String module) {
        String tabLocator = "//a[@class='ac-gn-link ac-gn-link-" + tab + "']";
        String moduleLocator = "//span[normalize-space()='" + module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);

        }
    }


}
