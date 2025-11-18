package selenium_java.bt_webelement_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import selenium_java.common.BaseTest;

public class BTLeads extends BaseTest {
    String leadName = "Hapt000";
    String email = "Hapt000@gmail.com";
    String searchName = "Hapt000";

    public void openfunction() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconLeadSummary)).click();
        Thread.sleep(1000);
        String leadSumary = driver.findElement(By.xpath(BTLocatorCRMLeads.headerLeadsSummary)).getText();
        if (leadSumary.equals("Leads Summary")) {
            System.out.println("Mở chức năng Lead thành công");
        } else {
            System.out.println("Mở chức năng Lead không thành công");
        }
    }

    public void openPopupAddNewLead() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonNewLead)).click();
        Thread.sleep(1000);
        String headerAddLead = driver.findElement(By.xpath(BTLocatorCRMLeads.headAddNewLead)).getText();
        if (headerAddLead.equals("Add new lead")) {
            System.out.println("Mở popup thêm mới lead thành công");
        } else {
            System.out.println("Mở popup thêm mới lead không thành công");
        }
    }

    // thêm mới lead
    public void addNewLead() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputTag)).sendKeys("Hapt", Keys.ENTER);
        driver.findElement(By.xpath(BTLocatorCRMLeads.labelTag)).click();
//        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputName)).sendKeys(leadName);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputAddress)).sendKeys("Đại Linh");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPosition)).sendKeys("NV");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmailAddress)).sendKeys(email);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputState)).sendKeys("Cái Bang");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputWebsite)).sendKeys("https://crm.anhtester.com/admin/leads");
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownCountry)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCountry)).sendKeys("Vietnam");
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueCountry)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPhone)).sendKeys("0818268331");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputZipCode)).sendKeys("100000");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputLeadValue)).sendKeys("200");
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDefaultLanguage)).sendKeys("Vietnamese");
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCompany)).sendKeys("PNJ");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDescription)).sendKeys("hapt test thêm mới lead no click public");
//        boolean checkCheckboxPublic = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
//        System.out.println("Checkbox Remember Me is selected : " + checkCheckboxPublic);
        driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).click();
//        boolean checkCheckboxPublics = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
//        System.out.println("Checkbox Remember Me is selected after: " + checkCheckboxPublics);
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonSave)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(BTLocatorCRMLeads.closepopupDetailAddLead)).click();//đóng popup sau khi thêm mới
    }

    public void checkResults(String textnotification) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(leadName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume)).getText();
        System.out.println(textnotification + firsRowColume);
    }

    @Test(priority = 1)
    public void testAddNewLead() throws InterruptedException {
        loginCRM();
        openfunction();
        openPopupAddNewLead();
        addNewLead();
        checkResults("Giá trị lead thêm mới: ");
    }

    public void search() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(searchName);
        Thread.sleep(2000);
    }

    // edit lead
    public void editLead() throws InterruptedException {
        //màn hinh chức năng cập nhât lead
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume))).perform();
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconEdit)).click();
        Thread.sleep(1000);
        //cập nhật thông tin lead
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
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputName)).sendKeys(leadName);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputAddress)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputAddress)).sendKeys("Đại Linh");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPosition)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPosition)).sendKeys("NV");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCity)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmailAddress)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmailAddress)).sendKeys(email);
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputState)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputState)).sendKeys("Cái Bang");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputWebsite)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputWebsite)).sendKeys("https://crm.anhtester.com/admin/leads");
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownCountry)).click();
//        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCountry)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCountry)).sendKeys("Vietnam");
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueCountry)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPhone)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPhone)).sendKeys("0818268331");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputZipCode)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputZipCode)).sendKeys("100000");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputLeadValue)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputLeadValue)).sendKeys("200");
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDefaultLanguage)).sendKeys("Vietnamese");
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueDefaultLanguage)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCompany)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCompany)).sendKeys("PNJ");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDescription)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDescription)).sendKeys("hapt test thêm edit lead");
//        driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.editbuttonSave)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(BTLocatorCRMLeads.closepopupDetailAddLead)).click();
    }

    @Test(priority = 2)
    public void testEditLead() throws InterruptedException {
        loginCRM();
        openfunction();
        search();
        editLead();
        checkResults("Cập nhật thành công thành lead name: ");
    }

    //delete lead
    public void deleteLead() throws InterruptedException {
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
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(searchName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMLeads.valueTable)).getText();
        if (firsRowColume.equals("No matching records found")) {
            System.out.println("Xóa thành công lead name: " + searchName);
        } else {
            System.out.println("Xóa không thành công lead name: " + searchName);
        }
    }

    @Test(priority = 3)
    public void testDeleteLead() throws InterruptedException {
        loginCRM();
        openfunction();
        search();
        deleteLead();
    }
}
