package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.TechnologicalPartnerPage;

public class TechnologicalPartnerTest extends AbstractTest {

    private HomePage homePage;
    private TechnologicalPartnerPage technologicalPartnerPage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        technologicalPartnerPage = homePage.clickOnCaseStudies()
                .clickTechnologicalPartner();
    }

    @Test
    public void clickOnDonAppetitMobileAppTest() {
        technologicalPartnerPage.clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnDigitalFinancialAdvisoryTest() {
        technologicalPartnerPage.clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnCloudMigrationTest() {
        technologicalPartnerPage.clickCloudMigration();
    }

    @Test
    public void clickOnFindOutMore() {
        technologicalPartnerPage.clickFindOutMore();
    }
}
