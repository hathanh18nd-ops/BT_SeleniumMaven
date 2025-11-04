package selenium_java.bt_webelement_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import java.time.Duration;

public class BTWebelementLeads {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPassword)).submit();//thay cho click login
//        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonLogin)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(BTLocatorCRMLeads.menuLeads)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonNewLead)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueStatus)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueSource)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueAssigned)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.dropdownTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputTag)).sendKeys("Hapt", Keys.ENTER);
        driver.findElement(By.xpath(BTLocatorCRMLeads.clickValueTag)).click();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputName)).clear();
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputName)).sendKeys("Hapt Test 001");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputAddress)).sendKeys("Đại Linh");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputPosition)).sendKeys("NV");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputEmailAddress)).sendKeys("hapt001@gmail.com");
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
        driver.findElement(By.xpath(BTLocatorCRMLeads.inputDescription)).sendKeys("hapt test thêm mới lead no lick public");
        boolean checkCheckboxPublic = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
        System.out.println("Checkbox Remember Me is selected : " + checkCheckboxPublic);
        driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).click();
        boolean checkCheckboxPublics = driver.findElement(By.xpath(BTLocatorCRMLeads.checkboxPublic)).isSelected();
        System.out.println("Checkbox Remember Me is selected after: " + checkCheckboxPublics);
//        driver.findElement(By.xpath(BTLocatorCRMLeads.buttonSave)).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
