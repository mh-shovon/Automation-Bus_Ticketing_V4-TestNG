import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AdminPanelTestRunner extends Setup {
    AdminPanel adminPanel;
    UtilsAdmin utilsAdmin;
    UtilsCounterman utilsCounterman;
    @Test(priority = 1)
    public void doAdminLoginWithValidCredentials() throws IOException, ParseException, InterruptedException {
        adminPanel =new AdminPanel(driver);
        utilsAdmin =new UtilsAdmin();
        utilsAdmin.getUserCredentials(0);
        driver.get("https://intercity.jatriweb.team/");
        boolean isLogoutFound= adminPanel.doAdminLoginWithValidCredentials(utilsAdmin.getPhone(),utilsAdmin.getPassword());
        Assert.assertEquals(isLogoutFound,true);
        adminPanel.btnAdminLogoutDisplayed.isDisplayed();
        Thread.sleep(3000);
        //loginPage.btnAdminLogout.click();
    }
    @Test(priority = 2)
    public void ClickDashboard() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnAdminDashboard.click();
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void clickReportV1() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnClickReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 4)
    public void clickAdmins() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnClickAdmins.click();
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void clickCompanyDeploy() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnClickCompanyDeploy.click();
        Thread.sleep(1000);
    }

    @Test(priority = 6)
    public void clickDigitalTicketing() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnClickDigitalTicketing.click();
        Thread.sleep(1000);
    }
    @Test(priority = 7)
    public void clickReportV2() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnClickReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 8)
    public void adminCoachWiseReportV1() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnAdminCoachWiseReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 9)
    public void adminCounterWiseReport() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnAdminCounterWiseReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 10)
    public void adminAgentWiseReport() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnAdminAgentWiseReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 11)
    public void adminUserWiseReport() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnAdminUserWiseReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 12)
    public void adminReservationReport() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnAdminReservationReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 13)
    public void adminCoachWiseReportV2() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnAdminCoachWiseReport.click();
        Thread.sleep(1000);
    }

    @Test(priority = 14)
    public void selectCompanyDropDown() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnSelectCompany.click();
        Thread.sleep(1000);
    }

    @Test(priority = 15)
    public void companyNameSelect() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnCompanyNameSelect.click();
        Thread.sleep(1000);
    }

    @Test(priority = 16)
    public void adminCoachWiseDataFilter() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnFilter.click();
        Thread.sleep(1000);
    }

    @Test(priority = 17)
    public void adminCoachWiseSeatTicketDataFilter() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnViewSeatTicket.click();
        Thread.sleep(1000);
    }

    //***** Company Deploy *****//
    @Test(priority = 18)
    public void clickCompanyDeploy2() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnClickCompanyDeploy.click();
        Thread.sleep(1000);
    }

    @Test(priority = 19)
    public void clickNextButton() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(5000);
        adminPanel.btnNext.click();
        Thread.sleep(1000);
    }

    @Test(priority = 20)
    public void manageCompany2() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
//        adminPanel.btnNext1.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)", "");
        adminPanel.btnManage.click();
        Thread.sleep(1000);
    }

    @Test(priority = 21)
    public void viewTrips() throws InterruptedException {
        adminPanel = new AdminPanel(driver);
        adminPanel.btnTrips.click();
        adminPanel.btnAddNew.isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 22)
    public void clickAddNew() throws InterruptedException {
        adminPanel.btnAddNew.click();
        adminPanel.btnGoBack.isDisplayed();
        Thread.sleep(1000);
    }
    @Test(priority = 23)
    public void createTrip() throws InterruptedException {
        adminPanel.clickRoutDropDown.click();
        Thread.sleep(500);
        adminPanel.setRouteName.click();
        Thread.sleep(500);
        adminPanel.clickFromDate.click();
        Thread.sleep(500);
        adminPanel.setFromDate.click();
        Thread.sleep(500);
        adminPanel.clickToDate.click();
        Thread.sleep(500);
        ///adminPanel.setToDate.click();
//        Thread.sleep(500);
//        adminPanel.btnGoBack.isDisplayed();
    }

    @Test(enabled = false)
    public void doCountermanLoginWithValidCredentials() throws IOException, ParseException, InterruptedException {
        adminPanel=new AdminPanel(driver);
        utilsCounterman =new UtilsCounterman();
        utilsCounterman.getUserCredentials(2);
        //driver.get("https://intercity.jatriweb.team/");
        boolean isCountermanLogoutFound= adminPanel.doCountermanLoginWithValidCredentials(utilsCounterman.getPhone(),utilsCounterman.getPassword());
        Assert.assertEquals(isCountermanLogoutFound,true);
        adminPanel.btnCountermanLogoutDisplayed.click();
        Thread.sleep(3000);
        adminPanel.btnCountermanLogout.click();

    }
}
