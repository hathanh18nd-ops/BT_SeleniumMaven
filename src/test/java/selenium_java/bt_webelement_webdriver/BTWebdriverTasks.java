package selenium_java.bt_webelement_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import selenium_java.bt_locators.BTLocatorCRMTasks;

import java.time.Duration;

public class BTWebdriverTasks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.navigate().to("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonLogin)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonNewTask)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).sendKeys("Test thêm mới Task 001");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).sendKeys("1000");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).sendKeys("10-11-2025", Keys.ENTER);
        //driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).sendKeys("11-11-2025", Keys.ENTER);
        driver.findElement(By.xpath(BTLocatorCRMTasks.labelCBBPriority)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxPriority)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValuePriority)).click();
        Thread.sleep(10000);
        driver.quit();

    }
}
