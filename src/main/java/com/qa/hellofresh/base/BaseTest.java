package com.qa.hellofresh.base;

import com.qa.hellofresh.support.DriverConnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public RemoteWebDriver driver;

    @BeforeMethod
    public void testStart(){
//        String exePath = "D:\\chromedriver.exe";
//        String exePath = "/opt/selenium/chromedriver-2.44";
//        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
//        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "http://softwaretestingmaterial.com";
//        String url = "http://automationpractice.com/index.php";
        driver.get(url);


//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability("version", "");
//        capabilities.setCapability("platform", "LINUX");
//        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"), capabilities);
//        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get("http://automationpractice.com/index.php");
    }

    public RemoteWebDriver getDriver(){
        return driver;
    }


    @AfterMethod
    public void testFinished(){
        driver.close();
        driver.quit();
    }

}
