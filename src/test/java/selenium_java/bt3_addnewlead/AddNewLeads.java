package selenium_java.bt3_addnewlead;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import selenium_java.common.BaseTest;

import java.util.List;

public class AddNewLeads extends BaseTest {
    public void openfunctionLead() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconLeadSummary)).click();
        Thread.sleep(1000);
    }
    public void verifyOpenfunctionLead(){
        List<WebElement> checkheaderLead = driver.findElements(By.xpath(BTLocatorCRMLeads.headerLeadsSummary));
        Assert.assertTrue(checkheaderLead.size() > 0, "Trang Leads không hiển thị");
        System.out.println("Trang Leads hiển thị thành công");
    }

    public void openPopupAddNewLead() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonNewLead)).click();
        Thread.sleep(1000);
    }
    public void verifyOpenPopupAddNewLead(){
        List<WebElement> checkheaderAddNewLead = driver.findElements(By.xpath(BTLocatorCRMLeads.headAddNewLead));
        Assert.assertTrue(checkheaderAddNewLead.size() > 0, "Mở popup thêm mới lead không thành công");
        System.out.println("Mở popup thêm mới lead thành công");
    }

    // thêm mới lead
    public void addNewLead(String tag, String address, String position, String name, String emailaddress, String website,
                           String phone, String leadvalue, String company, String city, String state, String country,
                           String zipcode, String defaultlanguage, String description) throws InterruptedException {
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
        Thread.sleep(3000);
    }
    public void closePopupAddNewLead() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.closepopupDetailLead)).click();
        Thread.sleep(1000);
    }

    public void checkResults(String textnotification, String name) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(name);
        Thread.sleep(2000);
        String actualLeadName = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColumeSubject)).getText();
        Assert.assertEquals(actualLeadName, name, "Lead thêm mới không thành công");
        System.out.println(textnotification + actualLeadName);
    }

    @Test()
    public void testAddNewLead() throws InterruptedException {
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
        String description = "hapt test thêm mới lead no click public";
        openfunctionLead();
        verifyOpenfunctionLead();
        openPopupAddNewLead();
        verifyOpenPopupAddNewLead();
        addNewLead(tag, address, position, name, emailaddress, website, phone, leadvalue, company, city, state, country, zipcode, defaultlanguage, description);
        closePopupAddNewLead();
        checkResults("Lead Name mới thêm: ",name);
    }
}
