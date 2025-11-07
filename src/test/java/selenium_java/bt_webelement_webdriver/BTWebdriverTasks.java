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
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).sendKeys("Test thêm mới Task 002");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).sendKeys("1000");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).sendKeys("10-11-2025");
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).sendKeys("11-11-2025");
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.labelCBBPriority)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxPriority)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValuePriority)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxRepeatEvery)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRepeatEvery)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxRelatedTo)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRelatedTo)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxRelatedToCustomer)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputRelatedToCustomer)).sendKeys("pnj");
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRelatedToCustomer)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxAssignees)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueAssignees)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxFollowers)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueFollowers)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.dropdownTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueTag)).click();
        //driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).sendKeys("Test thêm mới Task 001 bằng Selenium WebDriver");
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
