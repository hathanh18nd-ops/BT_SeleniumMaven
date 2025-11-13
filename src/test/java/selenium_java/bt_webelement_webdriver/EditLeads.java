package selenium_java.bt_webelement_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMLeads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EditLeads extends BaseTest {
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
    public void editLead() throws InterruptedException {
//        String getLeadName = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume)).getText();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume))).perform();
        driver.findElement(By.xpath(BTLocatorCRMLeads.iconEdit)).click();
        Thread.sleep(1000);
    }
    @Test(priority = 5)
    @Parameters(value = {"leadName", "email"})
    public void editValue(String leadName, String email) throws InterruptedException {
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
        driver.findElement(By.xpath("//div[@id='lead-modal']//button[@class='close']")).click();//đóng popup sau khi thêm mới

    }
    @Test(priority = 6)
    @Parameters(value = {"leadName"})
    public void checkResults(String leadName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(leadName);//Hapts 20251112235142
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume)).getText();
        System.out.println("Cập nhật thành công thành lead name: " + firsRowColume);
    }

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedDateTime = now.format(formatter);
//        createDriver();
//        loginCRM();
//        openfunction();
//        search("hapt t");
//        editLead();
//        editValue("Hapts " + formattedDateTime, "hapts"+ formattedDateTime +"@gmail.com");
//        checkResults("Hapts " + formattedDateTime);
//        checkResults("Hapts 20251112235142");
//        closeDriver();
    }
}
