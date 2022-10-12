import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CountermanPanelTestRunner extends Setup {
    CountermanPanel countermanPanel;
    UtilsCounterman utilsCounterman;

    @Test(priority = 1)
    public void doCountermanLoginWithValidCredentials() throws IOException, ParseException, InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        utilsCounterman = new UtilsCounterman();
        utilsCounterman.getUserCredentials(4);
        driver.get("https://intercity.jatriweb.team/");
        Thread.sleep(2000);
        boolean isCountermanLogoutFound = countermanPanel.doCountermanLoginWithValidCredentials(utilsCounterman.getPhone(), utilsCounterman.getPassword());
        Assert.assertEquals(isCountermanLogoutFound, true);
        countermanPanel.btnCountermanDashboardDisplayed.click();
        Thread.sleep(3000);
        countermanPanel.btnCountermanDashboardDisplayed.isDisplayed();
    }

    @Test(priority = 2)
    public void clickBtnTripView() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.btnTripView.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void clickSelectSeat1() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.selectSeat1.click();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void enterPassengerInfo1() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.enterPassengerName.sendKeys("Shovon");
        countermanPanel.enterPassengerMobile.sendKeys("01983285059");
        countermanPanel.selectPassengerGender.sendKeys("Male");
        countermanPanel.enterPassengerNID.sendKeys("5554921030");
        countermanPanel.enterPassengerAddress.sendKeys("Mirpur, Dhaka-1216");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void confirmSeat1() {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.btnConfirm.click();
    }

    @Test(priority = 6)
    public void clickBackButton1() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.backButton1.click();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void clickSeatView1() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.viewSeat1.click();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void clickBackButton2() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.backButton2.click();
        Thread.sleep(1500);
    }

    @Test(priority = 9)
    public void clickSelectSeat2() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.selectSeat2.click();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void enterPassengerInfo2() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.enterPassengerName.sendKeys("Alexa");
        countermanPanel.enterPassengerMobile.sendKeys("01648158739");
        countermanPanel.selectPassengerGender.sendKeys("Female");
        countermanPanel.enterPassengerNID.sendKeys("5554921031");
        countermanPanel.enterPassengerAddress.sendKeys("New York, America");
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void confirmSeat2() {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.btnConfirm.click();
    }

    @Test(priority = 12)
    public void clickBackButton3() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.backButton1.click();
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void clickSeatView2() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.viewSeat1.click();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void clickBackButton4() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.backButton2.click();
        Thread.sleep(1500);
    }

    @Test(priority = 15)
    public void clickSeatSelect3() {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.selectSeat3.click();
        countermanPanel.selectSeat4.click();
    }

    @Test(priority = 16)
    public void enterPassengerInfo3() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.enterPassengerName.sendKeys("Arnold");
        countermanPanel.enterPassengerMobile.sendKeys("01648158739");
        countermanPanel.selectPassengerGender.sendKeys("Male");
        countermanPanel.enterPassengerNID.sendKeys("5554921032");
        countermanPanel.enterPassengerAddress.sendKeys("London, United Kingdom");
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void confirmSeat3and4() {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.btnConfirm.click();
    }

    @Test(priority = 18)
    public void clickBackButton5() throws InterruptedException {
        countermanPanel = new CountermanPanel(driver);
        countermanPanel.backButton1.click();
        Thread.sleep(2000);
    }
//    @Test(priority = 18)
//    public void clickSeatView3() throws InterruptedException {
//        countermanPanel = new CountermanPanel(driver);
//        countermanPanel.viewSeat2.click();
//        Thread.sleep(2000);
//    }
//
//    @Test(priority = 19)
//    public void clickBackButton6() throws InterruptedException {
//        countermanPanel = new CountermanPanel(driver);
//        countermanPanel.backButton2.click();
//        Thread.sleep(1500);
//    }

//    @Test(priority = 17)
//    public void clickSeatSelect4(){
//        countermanPanel = new CountermanPanel(driver);
//        countermanPanel.selectSeat5.click();
//    }
//
//    @Test(priority = 18)
//    public void enterPartialPaymentAndConfirm1() throws InterruptedException {
//        countermanPanel = new CountermanPanel(driver);
//        countermanPanel.inputPartialPayment.sendKeys("200");
//        Thread.sleep(2000);
//        countermanPanel.btnConfirm2.click();
//    }


}