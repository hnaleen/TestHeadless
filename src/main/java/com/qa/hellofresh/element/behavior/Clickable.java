package com.qa.hellofresh.element.behavior;

import com.qa.hellofresh.exception.ApplicationException;
import com.qa.hellofresh.exception.ScriptException;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Clickable.java -  Interface type of click action related class
 *
 * @author Shiwantha
 * @version 1.0-SNAPSHOT
 * @since 11/07/2018
 */
public class Clickable {

    public void click(RemoteWebDriver driver, By locator) throws ApplicationException, ScriptException {
        try {
            WebElement element;
            element = (new WebDriverWait(driver, 5000 / 1000)).until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (ElementNotVisibleException e) {
            throw new ScriptException("Element Not Clickable");
        } catch (InvalidElementStateException e) {
            throw new ApplicationException("Element Not editable");
        } catch (StaleElementReferenceException e) {
            throw new ScriptException("Element No longer attached to page DOM");
        } catch (WebDriverException e){
            throw new ScriptException("Element is not clickable at current point");
        }
    }
}
