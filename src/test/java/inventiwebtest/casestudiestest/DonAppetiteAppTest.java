package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.DonAppetitMobileAppPage;

public class DonAppetiteAppTest extends AbstractTest {

    private HomePage homePage;
    private DonAppetitMobileAppPage donAppetitMobileAppPage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        donAppetitMobileAppPage = homePage.clickOnCaseStudies()
                .clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnCloudMigrationTest() {
        donAppetitMobileAppPage.clickCloudMigration();
    }

    @Test
    public void clickOnDigitalFinancialAdvisoryTest() {
        donAppetitMobileAppPage.clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnIntegrationPlatformTest() {
        donAppetitMobileAppPage.clickIntegrationPlatform();
    }

    @Test
    public void clickOnFindOutMore() {
        donAppetitMobileAppPage.clickFindOutMore();
    }
}
