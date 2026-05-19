package selenium_java.bt4_edittask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMTasks;
import selenium_java.common.BaseTest;

import java.util.List;

public class EditTasks extends BaseTest {
    public void openfunctionTask() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        Thread.sleep(1000);
    }
    public void verifyOpenfunctionTask(){
        List<WebElement> checkheadertaskSumary = driver.findElements(By.xpath(BTLocatorCRMTasks.headerTasksSummary));
        Assert.assertTrue(checkheadertaskSumary.size() > 0, "Trang Tasks không hiển thị");
        System.out.println("Trang Tasks hiển thị thành công");
    }

    public void openPopupAddNewTask() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonNewTask)).click();
        Thread.sleep(1000);
    }
    public void verifyopenPopupAddNewTask(){
        List<WebElement> checkheaderNewTask = driver.findElements(By.xpath(BTLocatorCRMTasks.headAddNewTask));
        Assert.assertTrue(checkheaderNewTask.size() > 0, "Mở popup thêm mới task không thành công");
        System.out.println("Mở popup thêm mới task thành công");
    }

    //add tasks
    public void addNewTask(String subjectName, String hourlyRate, String startDate, String dueDate, String relatedTo) throws InterruptedException {
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
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRelatedToCus)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxRTCustomer)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputRTCustomer)).sendKeys(relatedTo);
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRTCustomer)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxAssignees)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueAssignees)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxFollowers)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueFollowers)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.dropdownTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.labelTag)).click();
        //đến thẻ iframe mô tả
        driver.findElement(By.xpath(BTLocatorCRMTasks.textareaDescription)).click();
        driver.switchTo().frame(driver.findElement(By.xpath(BTLocatorCRMTasks.iframeDescription)));
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).sendKeys("Hapt nhập mô tả task");
        //thoát thẻ iframe
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)).click();
        Thread.sleep(5000);
    }
    public void closePopupTaskDetail() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.closepopupDetailAddTask)).click();
        Thread.sleep(1000);
    }

    public void checkResults(String textnotification, String subjectName) throws InterruptedException {
//        driver.findElement(By.xpath(BTLocatorCRMTasks.menuTasks)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnNameSubject)).getText();
        String actuaTaskName = driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnNameSubject)).getText();
        Assert.assertEquals(actuaTaskName, subjectName, "Task thêm mới không thành công");
        System.out.println(textnotification + firsRowColume);
    }

    public void search(String subjectName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);
        Thread.sleep(2000);
    }
//mở popup edit task
    public void openPopupEditTask() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMTasks.rowColumnName))).perform();
        driver.findElement(By.xpath(BTLocatorCRMTasks.iconEdit)).click();
        Thread.sleep(2000);
    }
    public void verifyopenPopupEditTask(){
        String headerEditTask = driver.findElement(By.xpath(BTLocatorCRMTasks.headerEditTask)).getText().trim();
        Assert.assertTrue(headerEditTask.contains("Edit task"), "Mở popup Edit task không thành công");
        System.out.println("Mở popup Edit task thành công");
    }
    //edit tasks
    public void editTask(String subjectName, String hourlyRate, String startDate, String dueDate, String relatedTo, String tag) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.checkboxPublic)).click();
        String subject = driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).getAttribute("value");
        System.out.println("giá trị Subject trước khi cập nhật"+subject);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).sendKeys(subjectName);
        String subjected = driver.findElement(By.xpath(BTLocatorCRMTasks.inputSubject)).getAttribute("value");
        System.out.println("giá trị Subject khi cập nhật"+subjected);
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
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRelatedToCus)).click();
        driver.findElement(By.xpath(BTLocatorCRMTasks.comboboxRTCustomer)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputRTCustomer)).sendKeys(relatedTo);
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.clickValueRTCustomer)).click();
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
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputTaskDescription)).sendKeys("Hapt cập nhật mô tả task");
        //thoát thẻ iframe
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMTasks.buttonSave)).click();
        Thread.sleep(5000);
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
    }
    public void verifyDeleteTask(String subjectName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).clear();
        driver.findElement(By.xpath(BTLocatorCRMTasks.inputSearchTask)).sendKeys(subjectName);
        Thread.sleep(2000);
        List<WebElement> checkValueDelete = driver.findElements(By.xpath(BTLocatorCRMTasks.valueTable));
        Assert.assertTrue(checkValueDelete.size() > 0, "Xóa không thành công Task name: " + subjectName);
        System.out.println("Xóa thành công Task name: " + subjectName);
    }

    @Test()
    public void testEditTask() throws InterruptedException {
        String subjectName = "Task Hapt002";
        String subjectNameed = "Task Hapt003";
        String hourlyRate = "1000";
        String startDate = "19-11-2025";
        String dueDate = "21-11-2025";
        String relatedTo = "pnj";
        String tag = "Hapt";
        openfunctionTask();
        verifyOpenfunctionTask();
        openPopupAddNewTask();
        verifyopenPopupAddNewTask();
        addNewTask(subjectName, hourlyRate, startDate, dueDate, relatedTo);
        closePopupTaskDetail();
        checkResults("Thêm mới thành công Task name: ", subjectName);
//        search(subjectName);
        openPopupEditTask();
        verifyopenPopupEditTask();
        editTask(subjectNameed, hourlyRate, startDate, dueDate, relatedTo, tag);
        closePopupTaskDetail();
        checkResults("Cập nhật thành công Task name: ", subjectNameed);
//        search(subjectNameed);
//        deleteTask();
//        verifyDeleteTask(subjectNameed);
    }
}
