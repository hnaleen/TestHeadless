package com.qa.hellofresh.element;

import com.qa.hellofresh.element.core.BaseCheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckBox extends BaseCheckBox {

    public CheckBox(RemoteWebDriver driver, By locator) {
        super(driver, locator);

    }

}
