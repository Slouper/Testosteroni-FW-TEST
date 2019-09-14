package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.IntegrationTestingPage;

public class IntegrationTestingTest extends AbstractTest {

    private HomePage homePage;
    private IntegrationTestingPage integrationTestingPage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        integrationTestingPage = homePage.clickOnCaseStudies()
                .clickIntegrationTesting();
    }

    @Test
    public void clickOnDonAppetitMobileAppTest() {
        integrationTestingPage.clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnDigitalFinancialAdvisoryTest() {
        integrationTestingPage.clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnCloudMigrationTest() {
        integrationTestingPage.clickCloudMigration();
    }

    @Test
    public void clickOnFindOutMore() {
        integrationTestingPage.clickFindOutMore();
    }
}
