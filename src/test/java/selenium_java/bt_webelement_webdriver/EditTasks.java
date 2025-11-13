package selenium_java.bt_webelement_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import selenium_java.bt_locators.BTLocatorCRMTasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EditTasks extends BaseTest {
    @Test(priority = 1)
    public void loginCRM() throws InterruptedException {
        driver.get(BTLocatorCRMTasks.url);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonLogin)).click();
        Thread.sleep(1000);
        boolean check = driver.findElement(By.xpath(BTLocatorCRMTasks.menuDashboard)).isDisplayed();
        if (check) {
            System.out.println("Đăng nhập CRM thành công!");
        } else {
            System.out.println("Đăng nhập không thành công!");
        }
    }
    @Test(priority = 2)
    public void openfunction() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        Thread.sleep(500);
    }
    @Test(priority = 3)
    @Parameters(value = {"searchName"})
    public void search(String searchName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(searchName);
        Thread.sleep(1000);
    }
    @Test(priority = 4)
    public void editTask() throws InterruptedException {
        String getSubjectName = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName)).getText();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName))).perform();
        driver.findElement(By.xpath(BTLocatorCRMTasks.iconEdit)).click();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    @Parameters(value = {"subjectName"})
    public void editValue(String subjectName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).sendKeys(subjectName);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).sendKeys("1000");
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).sendKeys("15-11-2025");
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).sendKeys("17-11-2025");
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
//        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxAssignees)).click();
//        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueAssignees)).click();
//        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxFollowers)).click();
//        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueFollowers)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.deleteTag)).click();
        Thread.sleep(500);
//        driver.findElement(By.xpath(BTLocatorCRMTasks.dropdownTag)).click();
//        Thread.sleep(500);
        driver.findElement(By.xpath(BTLocatorCRMTasks.dropdownTag)).sendKeys("hapt");
        Thread.sleep(500);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.labelTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.closepopupDetailAddTask)).click();

    }
    @Test(priority = 6)
    @Parameters(value = {"subjectName"})
    public void checkResults(String subjectName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);//Hapts 20251112235142
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnNameSubject)).getText();
        System.out.println("Cập nhật thành công thành lead name: " + firsRowColume);
    }

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedDateTime = now.format(formatter);
//        createDriver();
//        loginCRM();
//        openfunction();
//        search("Task Hapt1");
//        editTask();
//        editValue("Task Hapts " + formattedDateTime);
//        checkResults("Task Hapts " + formattedDateTime);
//        checkResults("Hapts 20251112235142");
//        closeDriver();
    }
}
