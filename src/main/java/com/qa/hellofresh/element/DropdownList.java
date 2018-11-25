package com.qa.hellofresh.element;

import com.qa.hellofresh.element.core.BaseDropdownList;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DropdownList extends BaseDropdownList {

    public DropdownList(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
