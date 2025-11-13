package selenium_java.bt_webelement_webdriver;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMLeads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DeleteLeads extends BaseTest {
    @Test(priority = 1)
    public void loginCRM() throws InterruptedException {
        driver.get(BTLocatorCRMLeads.url);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        Thread.sleep(1000);
        boolean check = driver.findElement(By.xpath(BTLocatorCRMLeads.menuDashboard)).isDisplayed();
        if (check) {
            System.out.println("Đăng nhập CRM thành công!");
        } else {
            System.out.println("Đăng nhập không thành công!");
        }
    }
    @Test(priority = 2)
    public void openfunction() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        Thread.sleep(500);
    }
    @Test(priority = 3)
    @Parameters(value = {"searchName"})
    public void search(String searchName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(searchName);
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void deleteLead() throws InterruptedException {
//        String getLeadName = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume)).getText();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume))).perform();
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconDelete)).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String deleteSuccess = driver.findElement(By.xpath(BTLocatorCRMLeads.deleteSuccessful)).getText();
        System.out.println(deleteSuccess);
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    @Parameters(value = {"searchName"})
    public void checkResults(String searchName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(searchName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMLeads.valueTable)).getText();
        if(firsRowColume.equals("No matching records found")){
            System.out.println("Xóa thành công lead name: " + searchName);
        }else {
            System.out.println("Xóa không thành công lead name: " + searchName);
        }
    }
}
