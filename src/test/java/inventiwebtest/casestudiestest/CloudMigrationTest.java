package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.CloudMigrationPage;

public class CloudMigrationTest extends AbstractTest {

    private HomePage homePage;
    private CloudMigrationPage cloudMigrationPage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        cloudMigrationPage = homePage.clickOnCaseStudies()
                .clickCloudMigration();
    }

    @Test
    public void clickOnDonAppetitMobileAppTest() {
        cloudMigrationPage.clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnDigitalFinancialAdvisoryTest() {
        cloudMigrationPage.clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnIntegrationPlatformTest() {
        cloudMigrationPage.clickIntegrationPlatform();
    }

    @Test
    public void clickOnFindOutMore() {
        cloudMigrationPage.clickFindOutMore();
    }
}
