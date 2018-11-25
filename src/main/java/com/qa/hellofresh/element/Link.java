package com.qa.hellofresh.element;

import com.qa.hellofresh.element.core.BaseLink;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Link extends BaseLink {

    public Link(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
