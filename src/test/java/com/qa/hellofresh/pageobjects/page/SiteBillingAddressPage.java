package com.qa.hellofresh.pageobjects.page;

import com.qa.hellofresh.base.BasePage;
import com.qa.hellofresh.exception.ApplicationException;
import com.qa.hellofresh.exception.ScriptException;
import com.qa.hellofresh.pageobjects.panel.SiteHeaderPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiteBillingAddressPage extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(SiteBillingAddressPage.class);

    private By btn_proceedAddress  = By.name("processAddress");

    SiteHeaderPanel siteHeaderPanel;

    public SiteBillingAddressPage(RemoteWebDriver driver) {
        super(driver);
        this.siteHeaderPanel = new SiteHeaderPanel(driver);
    }

    /**
     * Step: Checkout proceed with default billing address
     * @return SiteShippingAddressPage
     */
    public SiteShippingAddressPage step_Proceed_With_Default_Billing_Address() throws ScriptException, ApplicationException {
        test_step_initiation();
        button(btn_proceedAddress).click();
        log.info("Checkout proceed with default billing address");
        return new SiteShippingAddressPage(driver);
    }


}
