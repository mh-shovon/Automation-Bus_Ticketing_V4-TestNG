import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanel {
    @FindBy(id = "phone")
    WebElement txtPhone;
    @FindBy(id = "password")
    WebElement txtPassword;
    @FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/form/button")
    WebElement btnLogin;

    @FindBy(xpath = "//a[@id='navbarScrollingDropdown']")
    WebElement btnAdminLogoutDisplayed;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement btnAdminLogout;

    @FindBy(xpath = "//a[@id='navbarScrollingDropdown']")
    WebElement btnCountermanLogoutDisplayed;

    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[2]/li[1]/ul[1]/li[1]/button[1]")
    WebElement btnCountermanLogout;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    WebElement btnAdminDashboard;

    @FindBy(xpath = "//a[contains(text(),'Report')]")
    WebElement btnClickReport;

    @FindBy(xpath = "//a[contains(text(),'Admins')]")
    WebElement btnClickAdmins;

    @FindBy(xpath = "//a[contains(text(),'Company Deploy')]")
    WebElement btnClickCompanyDeploy;

    @FindBy(xpath = "//a[contains(text(),'Digital Ticketing')]")
    WebElement btnClickDigitalTicketing;

    @FindBy(xpath = "//button[@id='admin-report-coach-report-tab']")
    WebElement btnAdminCoachWiseReport;

    @FindBy(xpath = "//button[@id='admin-report-counter-report-tab']")
    WebElement btnAdminCounterWiseReport;

    @FindBy(xpath = "//button[@id='admin-report-agent-report-tab']")
    WebElement btnAdminAgentWiseReport;

    @FindBy(xpath = "//button[@id='admin-report-print-count-report-tab']")
    WebElement btnAdminUserWiseReport;

    @FindBy(xpath = "//button[@id='admin-report-reservation-report-tab']")
    WebElement btnAdminReservationReport;

    @FindBy(xpath = "//select[@id='company']")
    WebElement btnSelectCompany;

    @FindBy(xpath = "//*[@id=\"company\"]/option[43]")
    WebElement btnCompanyNameSelect;

    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
    WebElement btnFilter;

    @FindBy(xpath = "//button[contains(text(),'Seat')]")
    WebElement btnViewSeatTicket;

    //***** Company Deploy *****//
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//button[normalize-space()='>']")
    WebElement btnNext;

//    @FindBy(xpath = "//button[normalize-space()='>']")
//    WebElement btnNext1;

    @FindBy(xpath = "/html/body/div/main/div/div/div[2]/div/table/tbody/tr[20]/td[5]/button[2]")
    WebElement btnManage;
    //***** Company Deploy *****//

    //***** Trips *****//
    @FindBy(xpath = "//button[@id='admin-company-deploy-trips-tab']")
    WebElement btnTrips;

    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    WebElement btnAddNew;
    @FindBy(xpath = "//span[contains(text(),'Go Back')]")
    WebElement btnGoBack;
    @FindBy(xpath = "//select[@id='route']")
    WebElement clickRoutDropDown;
    @FindBy(xpath = "//option[contains(text(),'Dhaka-Patuakhali')]")
    WebElement setRouteName;
    @FindBy(xpath = "//*[@id=\"myTabContent\"]/div[15]/form/div/div[1]/div[1]/div[3]/div/input")
    WebElement clickFromDate;
    @FindBy(xpath = "//*[@id=\"myTabContent\"]/div[15]/form/div/div[1]/div[1]/div[3]/div/div/div/div/div[2]/div[1]/div/div[2]/div[38]/span")
    WebElement setFromDate;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[15]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
    WebElement clickToDate;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[15]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/*[1]")
    WebElement clickNextDate;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[15]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[41]/span[1]")
    WebElement setToDate;

    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[15]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement clickTime;
//    @FindBy(xpath = "")

    //***** Trips *****//
    WebDriver driver;

    public AdminPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean doAdminLoginWithValidCredentials(String phone, String password) {
        txtPhone.sendKeys(phone);
        txtPassword.sendKeys(password);
        btnLogin.click();
        return btnAdminLogoutDisplayed.isDisplayed();
    }

    public boolean clickDashboard() {
        btnAdminDashboard.click();
        return btnAdminDashboard.isDisplayed();
    }

    public boolean clickReport() {
        btnClickReport.click();
        return btnClickReport.isDisplayed();
    }

    public boolean clickAdmins(){
        btnClickAdmins.click();
        return btnClickAdmins.isSelected();

    }

    public boolean clickCompanyDeploy(){
        btnClickCompanyDeploy.click();
        return btnClickCompanyDeploy.isSelected();

    }

    public boolean clickDigitalTicketing() {
        btnClickDigitalTicketing.click();
        return btnClickDigitalTicketing.isSelected();
    }

    public boolean adminCoachWiseReport() {
        btnClickReport.click();
        return btnAdminCoachWiseReport.isDisplayed();
    }

    public boolean adminCounterWiseReport() {
        btnClickReport.click();
        return btnAdminCounterWiseReport.isDisplayed();
    }

    public boolean adminAgentWiseReport() {
        btnClickReport.click();
        return btnAdminAgentWiseReport.isDisplayed();
    }

    public boolean adminUserWIseReport() {
        btnClickReport.click();
        return btnAdminUserWiseReport.isDisplayed();
    }

    public boolean adminReservationReport() {
        btnClickReport.click();
        return btnAdminReservationReport.isDisplayed();
    }

    public boolean selectCompanyDropDown() {
        btnSelectCompany.click();
        return btnSelectCompany.isDisplayed();
    }

    public boolean companyNameSelect(){
        btnCompanyNameSelect.click();
        return btnCompanyNameSelect.isSelected();
    }

    public boolean adminCoachWiseDataFilter(){
        btnFilter.click();
        return btnFilter.isDisplayed();
    }

    public boolean adminCoachWiseSeatTicketDataFilter(){
        btnViewSeatTicket.click();
        return btnViewSeatTicket.isDisplayed();
    }

    public boolean clickNextButton(){
        btnNext.click();
        return btnAdd.isDisplayed();
    }

    public boolean manageCompany(){
        btnManage.click();
        return btnAdd.isDisplayed();
    }

    public boolean viewTrips(){
        btnTrips.click();
        return btnAddNew.isDisplayed();
    }

    public boolean clickAddNew(){
        btnAddNew.click();
        return btnGoBack.isDisplayed();
    }

    public boolean createTrip(){
        clickRoutDropDown.click();
        setRouteName.click();
        clickFromDate.click();
        clickNextDate.click();
        setFromDate.click();
        clickToDate.click();
        setToDate.click();
        return btnGoBack.isDisplayed();
    }


    public boolean doCountermanLoginWithValidCredentials(String phone, String password){
        txtPhone.sendKeys(phone);
        txtPassword.sendKeys(password);
        btnLogin.click();
        return btnCountermanLogoutDisplayed.isDisplayed();
    }

}
