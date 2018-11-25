package com.qa.hellofresh.element;

import com.qa.hellofresh.element.core.BaseButton;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Button.java - Represent button core behaviours
 *
 * @author Shiwantha
 * @version 1.0-SNAPSHOT
 * @since 11/07/2018
 */
public class Button extends BaseButton {

    public Button(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }
}
