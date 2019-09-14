package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.SwcSummitWebsitePage;

public class SwcSummitWebsiteTest extends AbstractTest {

    private HomePage homePage;
    private SwcSummitWebsitePage swcSummitWebsitePage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        swcSummitWebsitePage = homePage.clickOnCaseStudies()
                .clickSwcSummitWebsite();
    }

    @Test
    public void clickOnDonAppetitMobileAppTest() {
        swcSummitWebsitePage.clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnDigitalFinancialAdvisoryTest() {
        swcSummitWebsitePage.clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnCloudMigrationTest() {
        swcSummitWebsitePage.clickCloudMigration();
    }

    @Test
    public void clickOnFindOutMore() {
        swcSummitWebsitePage.clickFindOutMore();
    }
}

