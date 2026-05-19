package selenium_java.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import selenium_java.bt_locators.XpathAgentNode;

import java.time.Duration;
import java.util.List;

public class BaseAGN {
    public static WebDriver driver;

    @BeforeMethod
    public void createDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //loginAGN();
    }
    @AfterMethod
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
    public void loginAGN() throws InterruptedException {
        driver.get(XpathAgentNode.url);
        driver.findElement(By.xpath(XpathAgentNode.buttonTaiKhoan)).sendKeys("admin");
        driver.findElement(By.xpath(XpathAgentNode.buttonMatKhau)).sendKeys("admin");
        driver.findElement(By.xpath(XpathAgentNode.buttonDangNhap)).click();
        Thread.sleep(1000);
    }
}
