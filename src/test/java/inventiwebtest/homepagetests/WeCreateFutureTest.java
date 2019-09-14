package inventiwebtest.homepagetests;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class WeCreateFutureTest extends AbstractTest {

    @Test
    public void openCaseStudiesFromHomePageTest() {
        HomePage homepage = POFactory.initDriver();
        homepage.clickCloudMigration()
                .clickOnHomePageLogo()
                .clickIntegrationPlatform()
                .clickOnHomePageLogo()
                .clickDigitalFinancialAdvisory()
                .clickOnHomePageLogo()
                .clickDonAppetitMobileApp()
                .clickOnHomePageLogo()
                .clickSummitMediaComparator()
                .clickOnHomePageLogo()
                .clickTechnologicalPartner()
                .clickOnHomePageLogo()
                .clickIntegrationTesting()
                .clickOnHomePageLogo()
                .clickSwcSummitWebsite()
                .clickOnHomePageLogo()
                .clickIWantToKnowMore()
                .clickOnHomePageLogo();
    }
}
