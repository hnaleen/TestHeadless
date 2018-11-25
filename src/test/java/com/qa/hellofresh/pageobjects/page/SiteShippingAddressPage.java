package com.qa.hellofresh.pageobjects.page;

import com.qa.hellofresh.base.BasePage;
import com.qa.hellofresh.exception.ApplicationException;
import com.qa.hellofresh.exception.ScriptException;
import com.qa.hellofresh.pageobjects.panel.SiteHeaderPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SiteShippingAddressPage extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(SiteShippingAddressPage.class);

    private By chkBx_agreement      = By.id("uniform-cgv");
    private By btn_proceedAddress   = By.name("processCarrier");

    SiteHeaderPanel siteHeaderPanel;

    public SiteShippingAddressPage(RemoteWebDriver driver) {
        super(driver);
        this.siteHeaderPanel = new SiteHeaderPanel(driver);
    }

    /**
     * Step: Make agree policy agreement
     * @return SiteShippingAddressPage
     */
    public SiteShippingAddressPage step_Agreement_MakeAgree() throws ScriptException, ApplicationException {
        test_step_initiation();
        checkBox(chkBx_agreement).check();
        log.info("Make agree policy agreement");
        return this;
    }

    /**
     * Step: Proceed with default shipping address
     * @return SitePaymentPage
     */
    public SitePaymentPage step_Proceed_With_Default_Shipping_Address() throws ScriptException, ApplicationException {
        test_step_initiation();
        button(btn_proceedAddress).click();
        log.info("Proceed with default shipping address");
        return new SitePaymentPage(driver);
    }


}
