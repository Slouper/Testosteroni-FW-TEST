package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.IntegrationPlatformPage;

public class IntegrationPlatformTest extends AbstractTest {

    private HomePage homePage;
    private IntegrationPlatformPage integrationPlatformPage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        integrationPlatformPage = homePage.clickOnCaseStudies()
                .clickIntegrationPlatform();
    }

    @Test
    public void clickOnDonAppetitMobileAppTest() {
        integrationPlatformPage.clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnDigitalFinancialAdvisoryTest() {
        integrationPlatformPage.clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnCloudMigrationTest() {
        integrationPlatformPage.clickCloudMigration();
    }

    @Test
    public void clickOnFindOutMore() {
        integrationPlatformPage.clickFindOutMore();
    }
}
