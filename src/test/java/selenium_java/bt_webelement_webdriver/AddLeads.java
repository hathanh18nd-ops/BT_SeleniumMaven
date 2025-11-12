package selenium_java.bt_webelement_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import selenium_java.bt_locators.BTLocatorCRMLeads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddLeads extends BaseTest {
    public static void loginCRM() throws InterruptedException {
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

    public static void openLeadsSummary() throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        Thread.sleep(500);
    }

    public static void addNewLead(String leadName, String email) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonNewLead)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputTag)).sendKeys("Hapt", Keys.ENTER);
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueTag)).click();
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
        boolean checkCheckboxPublic = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
        System.out.println("Checkbox Remember Me is selected : " + checkCheckboxPublic);
        driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).click();
        boolean checkCheckboxPublics = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
        System.out.println("Checkbox Remember Me is selected after: " + checkCheckboxPublics);
//        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonSave)).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='lead-modal']//button[@class='close']")).click();//đóng popup sau khi thêm mới

    }

    public static void checkResults(String leadName) throws InterruptedException {
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputSearchLead)).sendKeys(leadName);
        Thread.sleep(2000);
        String firsRowColume = driver.findElement(By.xpath(BTLocatorCRMLeads.valueRowColume)).getText();
        System.out.println("First row colume lead name: " + firsRowColume);
    }

    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();
        openLeadsSummary();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedDateTime = now.format(formatter);
        addNewLead("Hapt " + formattedDateTime, "hapt" + formattedDateTime + "@gmail.com");
        checkResults("Hapt " + formattedDateTime);
        closeDriver();
    }
}
