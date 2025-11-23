package selenium_java.bt_webelement_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMTasks;
import selenium_java.common.BaseTest;

public class BTTasks extends BaseTest {
    public void openfunction() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        Thread.sleep(1000);
        String taskSumary = driver.findElement(By.xpath(BTLocatorCRMTasks.headerTasksSummary)).getText();
        Assert.assertEquals(taskSumary, "Tasks Summary", "Tiêu đề trang Tasks không khớp");
        System.out.println("Trang Tasks hiển thị thành công");
    }

    public void openPopupAddNewTask() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonNewTask)).click();
        Thread.sleep(1000);
        String headerAddTask = driver.findElement(By.xpath(BTLocatorCRMTasks.headAddNewTask)).getText();
        Assert.assertEquals(headerAddTask, "Add new task", "Mở popup thêm mới task không thành công");
        System.out.println("Mở popup thêm mới task thành công");
    }

    //add tasks
    public void addNewTask(String subjectName, String hourlyRate, String startDate, String dueDate, String relatedTo) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath(BTLocatorCRMTasks.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).sendKeys(subjectName);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).sendKeys(hourlyRate);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).sendKeys(startDate);
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).sendKeys(dueDate);
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
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputRelatedToCustomer)).sendKeys(relatedTo);
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRelatedToCustomer)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxAssignees)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueAssignees)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxFollowers)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueFollowers)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.dropdownTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.labelTag)).click();
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)));
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.closepopupDetailAddTask)).click();
    }

    public void checkResults(String textnotification, String subjectName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnNameSubject)).getText();
        String actuaTaskName = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnNameSubject)).getText();
        Assert.assertEquals(actuaTaskName, subjectName, "Task thêm mới không thành công");
        System.out.println(textnotification + firsRowColume);
    }

    @Test(priority = 1)
    public void testAddNewTask() throws InterruptedException {
        String subjectName = "Task Hapt003";
        String hourlyRate = "1000";
        String startDate = "19-11-2025";
        String dueDate = "21-11-2025";
        String relatedTo = "pnj";
        loginCRM();
        openfunction();
        openPopupAddNewTask();
        addNewTask(subjectName, hourlyRate, startDate, dueDate, relatedTo);
        checkResults("Thêm mới thành công task name: ", subjectName);
    }

    public void search(String subjectName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);
        Thread.sleep(2000);
    }

    //edit tasks
    public void editTask(String subjectName, String hourlyRate, String startDate, String dueDate, String relatedTo, String tag) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName))).perform();
        driver.findElement(By.xpath(BTLocatorCRMTasks.iconEdit)).click();
        Thread.sleep(2000);
        //cập nhật thông tin task
        driver.findElement(By.xpath(BTLocatorCRMTasks.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).sendKeys(subjectName);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputHourlyRate)).sendKeys(hourlyRate);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputStartDate)).sendKeys(startDate);
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputDueDate)).sendKeys(dueDate);
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
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputRelatedToCustomer)).sendKeys(relatedTo);
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRelatedToCustomer)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.deleteTag)).click();
        Thread.sleep(500);
//        driver.findElement(By.xpath(BTLocatorCRMTasks.dropdownTag)).click();
//        Thread.sleep(500);
        driver.findElement(By.xpath(BTLocatorCRMTasks.dropdownTag)).sendKeys(tag);
        Thread.sleep(500);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.labelTag)).click();
        //đến thẻ iframe mô tả
        driver.switchTo().frame(driver.findElement(By.xpath(BTLocatorCRMTasks.iframeDescription)));
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).getText());
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).sendKeys("Hapt cập nhật mô tả task");
        //thoát thẻ iframe
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.closepopupDetailAddTask)).click();
    }

    @Test(priority = 2)
    public void testEditTask() throws InterruptedException {
        String subjectName = "Task Hapts001";
        String hourlyRate = "1000";
        String startDate = "19-11-2025";
        String dueDate = "21-11-2025";
        String relatedTo = "pnj";
        String tag = "Hapt";
        loginCRM();
        openfunction();
        search(subjectName);
        editTask(subjectName, hourlyRate, startDate, dueDate, relatedTo, tag);
        checkResults("Cập nhật thành công thành lead name: ", subjectName);
    }

    //delete tasks
    public void deleteTask(String subjectName) throws InterruptedException {
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
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);
        Thread.sleep(2000);
        String actuaTaskName = driver.findElement(By.xpath(BTLocatorCRMTasks.valueTable)).getText();
        Assert.assertEquals(actuaTaskName, "No matching records found", "Xóa không thành công Task name: " + subjectName);
        System.out.println("Xóa thành công Task name: " + subjectName);
    }

    @Test(priority = 3)
    public void testDeleteTask() throws InterruptedException {
        String subjectName = "Task Hapt003";
        loginCRM();
        openfunction();
        search(subjectName);
        deleteTask(subjectName);
    }
}
