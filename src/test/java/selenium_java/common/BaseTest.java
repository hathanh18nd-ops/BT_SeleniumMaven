package selenium_java.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import selenium_java.bt_locators.BTLocatorCRMLeads;

import java.time.Duration;
import java.util.List;

public class BaseTest {
    public static WebDriver driver;

    @BeforeMethod
    public void createDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
    public void loginCRM() throws InterruptedException {
        driver.get(BTLocatorCRMLeads.url);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        Thread.sleep(1000);
        List<WebElement> checkmenuDashboard = driver.findElements(By.xpath(BTLocatorCRMLeads.menuDashboard));
        Assert.assertTrue(checkmenuDashboard.size() > 0, "Login failed - Đăng nhập không thành công");
        System.out.println("Đăng nhập thành công");
    }
}
