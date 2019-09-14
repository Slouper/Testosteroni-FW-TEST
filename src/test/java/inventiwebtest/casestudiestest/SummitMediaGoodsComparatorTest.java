package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.casestudies.SummitMediaGoodsComparatorPage;

public class SummitMediaGoodsComparatorTest extends AbstractTest {

    private HomePage homePage;
    private SummitMediaGoodsComparatorPage summitMediaGoodsComparatorPage;

    @BeforeMethod
    public void before() {
        homePage = POFactory.initDriver();
        summitMediaGoodsComparatorPage = homePage.clickOnCaseStudies()
                .clickSummitMediaComparator();
    }

    @Test
    public void clickOnDonAppetitMobileAppTest() {
        summitMediaGoodsComparatorPage.clickDonAppetitMobileApp();
    }

    @Test
    public void clickOnDigitalFinancialAdvisoryTest() {
        summitMediaGoodsComparatorPage.clickDigitalFinancialAdvisory();
    }

    @Test
    public void clickOnCloudMigrationTest() {
        summitMediaGoodsComparatorPage.clickCloudMigration();
    }

    @Test
    public void clickOnFindOutMore() {
        summitMediaGoodsComparatorPage.clickFindOutMore();
    }
}
