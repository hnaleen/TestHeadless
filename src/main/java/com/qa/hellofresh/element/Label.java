package com.qa.hellofresh.element;

import com.qa.hellofresh.element.core.BaseLabel;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Label extends BaseLabel {

    public Label(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
