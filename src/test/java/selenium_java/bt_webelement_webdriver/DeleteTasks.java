package selenium_java.bt_webelement_webdriver;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMTasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DeleteTasks extends BaseTest {
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
    public void deleteTask() throws InterruptedException {
//        String getSubjectName = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName)).getText();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName))).perform();
        driver.findElement(By.xpath(BTLocatorCRMTasks.iconDelete)).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        String deleteSuccess = driver.findElement(By.xpath(BTLocatorCRMTasks.deleteSuccessful)).getText();
        System.out.println("Thông báo xóa thành công: "+deleteSuccess);
        Thread.sleep(1000);

    }
    @Test(priority = 5)
    @Parameters(value = {"searchName"})
    public void checkResults(String searchName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(searchName);//Hapts 20251112235142
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMTasks.valueTable)).getText();
        if(firsRowColume.equals("No matching records found")){
            System.out.println("Xóa thành công lead name: " + searchName);
        }else {
            System.out.println("Xóa không thành công lead name: " + searchName);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DeleteTasks deleteTasks = new DeleteTasks();
        deleteTasks.createDriver();
        deleteTasks.loginCRM();
        deleteTasks.openfunction();
        deleteTasks.search("Task Hapts 20251113135806");
        deleteTasks.deleteTask();
        deleteTasks.checkResults("Task Hapts 20251113135806");
        deleteTasks.closeDriver();
    }
}
