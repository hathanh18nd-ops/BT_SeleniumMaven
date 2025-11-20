package selenium_java.bt3_plus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import selenium_java.common.BaseTest;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;

public class EditAndDeleteLeads extends BaseTest {
    public void openfunction() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconLeadSummary)).click();
        Thread.sleep(1000);
        List<WebElement> checkheaderLead = driver.findElements(By.xpath(BTLocatorCRMLeads.headerLeadsSummary));
        Assert.assertTrue(checkheaderLead.size() > 0, "Trang Leads không hiển thị");
        String leadSumary = driver.findElement(By.xpath(BTLocatorCRMLeads.headerLeadsSummary)).getText();
        Assert.assertEquals(leadSumary, "Leads Summary", "Tiêu đề trang Leads không khớp");
        System.out.println("Trang Leads hiển thị thành công");
    }

    public void openPopupAddNewLead() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonNewLead)).click();
        Thread.sleep(1000);
        String headerAddLead = driver.findElement(By.xpath(BTLocatorCRMLeads.headAddNewLead)).getText();
        Assert.assertEquals(headerAddLead, "Add new lead", "Mở popup thêm mới lead không thành công");
        System.out.println("Mở popup thêm mới lead thành công");
    }

    // thêm mới lead
    public void addNewLead(String tag, String address, String position, String name, String emailaddress, String website,
                           String phone, String leadvalue, String company, String city, String state, String country,
                           String zipcode, String defaultlanguage, String description) throws InterruptedException, AWTException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputTag)).sendKeys(tag, Keys.ENTER);
        driver.findElement(By.xpath(BTLocatorCRMLeads.labelTag)).click();
//        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputName)).sendKeys(name);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputAddress)).sendKeys(address);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPosition)).sendKeys(position);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCity)).sendKeys(city);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmailAddress)).sendKeys(emailaddress);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputState)).sendKeys(state);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputWebsite)).sendKeys(website);
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownCountry)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCountry)).sendKeys(country);
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueCountry)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPhone)).sendKeys(phone);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputZipCode)).sendKeys(zipcode);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputLeadValue)).sendKeys(leadvalue);
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDefaultLanguage)).sendKeys(defaultlanguage);
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCompany)).sendKeys(company);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDescription)).sendKeys(description);
//        boolean checkCheckboxPublic = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
//        System.out.println("Checkbox Remember Me is selected : " + checkCheckboxPublic);
        driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).click();
//        boolean checkCheckboxPublics = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
//        System.out.println("Checkbox Remember Me is selected after: " + checkCheckboxPublics);
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonSave)).click();
        //tắt popup Save address
        Robot robot = new Robot();
        robot.mouseMove(1480, 110);// tọa độ con trỏ chuột theo từng màn hình
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
        driver.findElement(By.xpath(BTLocatorCRMLeads.closepopupDetailAddLead)).click();//đóng popup sau khi thêm mới
    }

    public void checkResults(String textnotification, String name) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(name);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume)).getText();
        String actualLeadName = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColumeSubject)).getText();
        Assert.assertEquals(actualLeadName, name, "Lead thêm mới không thành công");
        System.out.println(textnotification + firsRowColume);
    }

    public void search(String name) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(name);
        Thread.sleep(2000);
    }

    // màn hinh chức năng cập nhât lead
    public void openPopupEditLead() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume))).perform();
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconEdit)).click();
        Thread.sleep(1000);
        boolean checkheaderEditLead = driver.findElement(By.xpath(BTLocatorCRMLeads.editbuttonEdit)).isDisplayed();
        Assert.assertTrue(checkheaderEditLead, "Mở chức năng cập nhật lead không thành công");
        System.out.println("Mở chức năng cập nhật lead thành công");
    }

    // edit lead
    public void editLead(String address, String position, String name, String emailaddress, String website,
                         String phone, String leadvalue, String company, String city, String state, String country,
                         String zipcode, String defaultlanguage, String description) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.deleteTag)).click();
//        driver.findElement(By.xpath(BTLocatorCRMLeads.deleteTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownTag)).click();
//        driver.findElement(By.xpath(BTLocatorCRMLeads.inputTag)).sendKeys("Hapt", Keys.ENTER);
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.labelTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputName)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputName)).sendKeys(name);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputAddress)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputAddress)).sendKeys(address);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPosition)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPosition)).sendKeys(position);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCity)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCity)).sendKeys(city);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmailAddress)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmailAddress)).sendKeys(emailaddress);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputState)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputState)).sendKeys(state);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputWebsite)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputWebsite)).sendKeys(website);
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownCountry)).click();
//        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCountry)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCountry)).sendKeys(country);
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueCountry)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPhone)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPhone)).sendKeys(phone);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputZipCode)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputZipCode)).sendKeys(zipcode);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputLeadValue)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputLeadValue)).sendKeys(leadvalue);
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDefaultLanguage)).sendKeys(defaultlanguage);
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCompany)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCompany)).sendKeys(company);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDescription)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDescription)).sendKeys(description);
//        driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.editbuttonSave)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(BTLocatorCRMLeads.closepopupDetailAddLead)).click();
    }

    //delete lead
    public void deleteLead(String name) throws InterruptedException {
        //xóa lead
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume))).perform();
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconDelete)).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        String deleteSuccess = driver.findElement(By.xpath(BTLocatorCRMLeads.deleteSuccessful)).getText();
        System.out.println("Thông báo xóa thành công: " + deleteSuccess);
        Thread.sleep(1000);
        //kiểm tra kết quả xóa
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(name);
        Thread.sleep(2000);
        String actualLeadName = driver.findElement(By.xpath(BTLocatorCRMLeads.valueTable)).getText();
        Assert.assertEquals(actualLeadName, "No matching records found", "Xóa không thành công lead name: " + name);
        System.out.println("Xóa thành công lead name: " + name);
    }

    public void mousePress() throws InterruptedException, AWTException {

        Robot robot = new Robot();
        //Di chuyển trỏ chuột đến vị trí x,y
        robot.mouseMove(1480, 110);// tọa độ con trỏ chuột theo từng màn hình
        //Dalay giống sleep
        robot.delay(2000);
        //Click chuột trái
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //Thả chuột trái ra
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(2000);
    }

    @Test()
    public void testEditDeleteLead() throws InterruptedException, AWTException {
        String tag = "Hapt";
        String address = "Đại Linh";
        String position = "NV";
        String name = "Hapt000";
        String emailaddress = "Hapt000@gmail.com";
        String website = "https://crm.anhtester.com/admin/leads";
        String phone = "0818268331";
        String leadvalue = "200";
        String company = "PNJ";
        String city = "Hà Nội";
        String state = "Cái Bang";
        String country = "Vietnam";
        String zipcode = "100000";
        String defaultlanguage = "Vietnamese";
        String description = "hapt test thêm mới lead";
        String descriptioned = "hapt test cập nhật lead";
        loginCRM();
        openfunction();
        openPopupAddNewLead();
        addNewLead(tag, address, position, name, emailaddress, website, phone, leadvalue, company, city, state, country, zipcode, defaultlanguage, description);
//        mousePress();
        search(name);
        openPopupEditLead();
        editLead(address, position, name, emailaddress, website, phone, leadvalue, company, city, state, country, zipcode, defaultlanguage, descriptioned);
        checkResults("Cập nhật thành công lead name: ", name);
        search(name);
        deleteLead(name);
    }
}
