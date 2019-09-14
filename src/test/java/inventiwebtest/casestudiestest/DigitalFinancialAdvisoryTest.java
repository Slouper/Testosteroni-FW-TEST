package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.DigitalFinancialAdvisoryPage;

public class DigitalFinancialAdvisoryTest extends AbstractTest {

    private HomePage homePage;
    private DigitalFinancialAdvisoryPage digitalFinancialAdvisoryPage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        digitalFinancialAdvisoryPage = homePage.clickOnCaseStudies()
                .clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnDonAppetitMobileAppTest() {
        digitalFinancialAdvisoryPage.clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnCloudMigrationTest() {
        digitalFinancialAdvisoryPage.clickCloudMigration();
    }

    @Test
    public void clickOnIntegrationPlatformTest() {
        digitalFinancialAdvisoryPage.clickIntegrationPlatform();
    }

    @Test
    public void clickOnFindOutMore() {
        digitalFinancialAdvisoryPage.clickFindOutMore();
    }
}
