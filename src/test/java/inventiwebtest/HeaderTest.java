package inventiwebtest;

import core.factory.POFactory;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import sun.plugin.com.Utils;

public class HeaderTest extends AbstractTest {

    @Test
    public void clickingOnAllCombinationsFromHomePageToOtherPagesAndTheOtherWayInHeader() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnAboutUs()
                .clickOnHomePageLogo()
                .clickOnWhatWeDo()
                .clickOnHomePageLogo()
                .clickOnCaseStudies()
                .clickOnHomePageLogo()
                .clickOnEvents()
                .clickOnHomePageLogo()
                .clickOnContact()
                .clickOnHomePageLogo();
    }

    @Test
    public void clickingOnAllCombinationsFromAboutUsPageToOtherPagesAndTheOtherWayInHeader_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnAboutUs()
                .clickOnWhatWeDo()
                .clickOnAboutUs()
                .clickOnCaseStudies()
                .clickOnAboutUs()
                .clickOnEvents()
                .clickOnAboutUs()
                .clickOnContact()
                .clickOnAboutUs();
    }

    @Test
    public void clickingOnAllCombinationsFromWhatWeDoPageToOtherPagesAndTheOtherWayInHeader_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnWhatWeDo()
                .clickOnCaseStudies()
                .clickOnWhatWeDo()
                .clickOnEvents()
                .clickOnWhatWeDo()
                .clickOnContact()
                .clickOnWhatWeDo();

    }

    @Test
    public void clickingOnAllCombinationsFromCaseStudiesPageToOtherPagesAndTheOtherWayInHeader_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnCaseStudies()
                .clickOnEvents()
                .clickOnCaseStudies()
                .clickOnContact()
                .clickOnCaseStudies();
    }
    @Test
    public void clickingOnAllCombinationsFromEventsPageToContactPageAndTheOtherWayInHeader_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnEvents()
                .clickOnContact()
                .clickOnEvents();
    }

}
