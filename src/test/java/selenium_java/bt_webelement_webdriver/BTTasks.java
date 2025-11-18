package selenium_java.bt_webelement_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMTasks;
import selenium_java.common.BaseTest;

public class BTTasks extends BaseTest {
    String subjectName = "Task Hapt003";
    String searchName = "Task Hapt003";

    public void openfunction() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        Thread.sleep(1000);
        String taskSumary = driver.findElement(By.xpath(BTLocatorCRMTasks.headerTasksSummary)).getText();
        if (taskSumary.equals("Tasks Summary")) {
            System.out.println("Mở chức năng Tasks thành công!");
        } else {
            System.out.println("Mở chức năng Tasks không thành công!");
        }
    }

    public void openPopupAddNewTask() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonNewTask)).click();
        Thread.sleep(1000);
        String headerAddLead = driver.findElement(By.xpath(BTLocatorCRMTasks.headAddNewTask)).getText();
        if (headerAddLead.equals("Add new task")) {
            System.out.println("Mở popup thêm mới task thành công");
        } else {
            System.out.println("Mở popup thêm mới task không thành công");
        }
    }

    //add tasks
    public void addNewTask() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).sendKeys(subjectName);
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
        driver.findElement(By.xpath(BTLocatorCRMTasks.labelTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.closepopupDetailAddTask)).click();
    }

    public void checkResults(String textnotification) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnNameSubject)).getText();
        System.out.println(textnotification + firsRowColume);
    }

    @Test(priority = 1)
    public void testAddNewTask() throws InterruptedException {
        loginCRM();
        openfunction();
        openPopupAddNewTask();
        addNewTask();
        checkResults("Thêm mới thành công task name: ");
    }

    public void search() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(searchName);
        Thread.sleep(2000);
    }

    //edit tasks
    public void editTask() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName))).perform();
        driver.findElement(By.xpath(BTLocatorCRMTasks.iconEdit)).click();
        Thread.sleep(2000);
        //cập nhật thông tin task
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

    @Test(priority = 2)
    public void testEditTask() throws InterruptedException {
        loginCRM();
        openfunction();
        search();
        editTask();
        checkResults("Cập nhật thành công thành lead name: ");
    }

    //delete tasks
    public void deleteTask() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName))).perform();
        driver.findElement(By.xpath(BTLocatorCRMTasks.iconDelete)).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        String deleteSuccess = driver.findElement(By.xpath(BTLocatorCRMTasks.deleteSuccessful)).getText();
        System.out.println("Thông báo xóa thành công: " + deleteSuccess);
        Thread.sleep(1000);
        //kiểm tra kết quả xóa
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(searchName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMTasks.valueTable)).getText();
        if (firsRowColume.equals("No matching records found")) {
            System.out.println("Xóa thành công lead name: " + searchName);
        } else {
            System.out.println("Xóa không thành công lead name: " + searchName);
        }
    }

    @Test(priority = 3)
    public void testDeleteTask() throws InterruptedException {
        loginCRM();
        openfunction();
        search();
        deleteTask();
    }
}
