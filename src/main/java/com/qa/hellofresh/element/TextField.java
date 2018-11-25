package com.qa.hellofresh.element;

import com.qa.hellofresh.element.core.BaseTextField;
import com.qa.hellofresh.exception.ApplicationException;
import com.qa.hellofresh.exception.FrameworkException;
import com.qa.hellofresh.exception.ScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;

/**
 * TextField.java - Represent text-field core behaviours
 *
 * @author Shiwantha
 * @version 1.0-SNAPSHOT
 * @since 11/07/2018
 */
public class TextField extends BaseTextField {

    public TextField(RemoteWebDriver driver, By locator) throws FrameworkException {
        super(driver, locator);

    }

    public void enterTextAndSubmit(String text) throws ScriptException, ApplicationException {
        super.enterText(text);
        baseTextFieldElement = driver.findElement(locator);
        baseTextFieldElement.sendKeys(org.openqa.selenium.Keys.ENTER);
    }

    public void enterTextAndSubmitForcefully(String text) {
        WebElement element = driver.findElement(locator);
        element.click();
        keyBoard.clearTextField();
        keyBoard.typeText(text);
        keyBoard.type("\n");
    }
}
