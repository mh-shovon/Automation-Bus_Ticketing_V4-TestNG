import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class CountermanPanel {
    @FindBy(id = "phone")
    WebElement txtPhone;
    @FindBy(id = "password")
    WebElement txtPassword;
    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/form/button")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"topHeader\"]/nav/div/a")
    WebElement btnCountermanDashboardDisplayed;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div[2]/div[3]/div/table/tbody[1]/tr/td[10]/button[3]")
    WebElement btnTripView;

    @FindBy(xpath = "//span[normalize-space()='S20']")
    WebElement selectSeat1;

    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement enterPassengerName;

    @FindBy(xpath = "//*[@id=\"mobile\"]")
    WebElement enterPassengerMobile;

    @FindBy(xpath = "//*[@id=\"passengerGender\"]")
    WebElement selectPassengerGender;

    @FindBy(xpath = "//*[@id=\"nid\"]")
    WebElement enterPassengerNID;

    @FindBy(xpath = "//*[@id=\"address\"]")
    WebElement enterPassengerAddress;

    @FindBy(xpath = "//button[@class='confirm_btn corporate_btn font_detail mx-md-3 px-3 spacing']")
    WebElement btnConfirm;

    @FindBy(xpath = "//button[@class='cancel_button w-100']")
    WebElement backButton1;

    @FindBy(xpath = "//span[normalize-space()='S20']")
    WebElement viewSeat1;

    @FindBy(xpath = "//button[@class='edit_table_data font_detail']")
    WebElement backButton2;

    @FindBy(xpath = "//span[normalize-space()='S21']")
    WebElement selectSeat2;

    @FindBy(xpath = "//span[normalize-space()='S23']")
    WebElement selectSeat3;

    @FindBy(xpath = "//span[normalize-space()='S24']")
    WebElement selectSeat4;

    @FindBy(xpath = "//span[normalize-space()='S23']")
    WebElement viewSeat2;


    @FindBy(xpath = "//button[normalize-space()='Booking']")
    WebElement btnReserve;

    @FindBy(xpath = "//input[@id='partialpayment']")
    WebElement inputPartialPayment;

    @FindBy(xpath = "//button[normalize-space()='confirm']")
    WebElement btnConfirm2;

    @FindBy(xpath = "//span[normalize-space()='S16']")
    WebElement selectSeat5;

//    @FindBy(xpath = "//span[normalize-space()='S19']")
//    WebElement selectSeat6;
//
//    @FindBy(xpath = "//span[normalize-space()='S22']")
//    WebElement selectSeat7;
//
//    @FindBy(xpath = "//span[normalize-space()='S25']")
//    WebElement selectSeat8;



    WebDriver driver;

    public CountermanPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean doCountermanLoginWithValidCredentials(String phone, String password) {
        txtPhone.sendKeys(phone);
        txtPassword.sendKeys(password);
        btnLogin.click();
        return btnCountermanDashboardDisplayed.isDisplayed();
    }

}
