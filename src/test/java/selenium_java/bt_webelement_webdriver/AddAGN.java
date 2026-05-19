package selenium_java.bt_webelement_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_java.bt_locators.BTLocatorCRMLeads;
import selenium_java.bt_locators.XpathAgentNode;
import selenium_java.common.BaseAGN;
import selenium_java.common.BaseTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AddAGN extends BaseAGN {

    public void clickThemMoi() throws InterruptedException {
        driver.findElement(By.xpath(XpathAgentNode.buttonThemMoi)).click();
        Thread.sleep(1000);
    }
    // thêm mới lead
    public void addNewAGN(String tendichvu, String madichvu, String dodaitoida, String urlcauhinh, String clientid, String clientsecret,
                           String xsd) throws InterruptedException {
        driver.findElement(By.xpath(XpathAgentNode.buttonThemMoi)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(XpathAgentNode.nhapTenDichVu)).sendKeys(tendichvu);
        driver.findElement(By.xpath(XpathAgentNode.nhapMaDichVu)).sendKeys(madichvu);
        driver.findElement(By.xpath(XpathAgentNode.nhapDoDaiToiDa)).sendKeys(dodaitoida);
        driver.findElement(By.xpath(XpathAgentNode.nhapURL)).sendKeys(urlcauhinh);
        driver.findElement(By.xpath(XpathAgentNode.nhapClientId)).sendKeys(clientid);
        driver.findElement(By.xpath(XpathAgentNode.nhapClientSecret)).sendKeys(clientsecret);
        driver.findElement(By.xpath(XpathAgentNode.dropdownContentType)).click();
        driver.findElement(By.xpath(XpathAgentNode.dropdownContentType)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(XpathAgentNode.dropdownTrangThai)).click();
        driver.findElement(By.xpath(XpathAgentNode.dropdownTrangThai)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(XpathAgentNode.nhapXSD)).sendKeys(xsd);
        //driver.findElement(By.xpath(XpathAgentNode.buttonXacNhan)).click();
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void testAddNewAGN() throws InterruptedException {
        String dodaitoida = "10,720";
        String urlcauhinh = "http://192.168.10.24:1337/175-dev-test/sandbox/api/xml/process";
        String clientid = "2bd5f193eaa80c73db509fe57d366227";
        String clientsecret = "d679b6447e6dbce14557397fb871522c";
        String xsd = "xsdcuahapt";
        loginAGN();
        //clickThemMoi();
        for (int i = 0; i < 3; i++) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            String formattedDateTime = now.format(formatter);
            String tendichvu = "Hapt"+formattedDateTime;
            String madichvu = "data_hapt" + formattedDateTime;
            addNewAGN(tendichvu, madichvu, dodaitoida, urlcauhinh, clientid, clientsecret, xsd);
        }
    }

}
