package inventiwebtest;

import core.factory.POFactory;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class FooterTest extends AbstractTest{


    @Test
    public void clickingOnAllCombinationsFromAboutUsPageToOtherPagesAndTheOtherWayInFooter_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnAboutUsFooter()
                .clickOnWhatWeDoFooter()
                .clickOnAboutUsFooter()
                .clickOnCaseStudiesFooter()
                .clickOnAboutUsFooter()
                .clickOnEventsFooter()
                .clickOnAboutUsFooter()
                .clickOnContactFooter()
                .clickOnAboutUsFooter();
    }

    @Test
    public void clickingOnAllCombinationsFromWhatWeDoPageToOtherPagesAndTheOtherWayInFooter_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnWhatWeDoFooter()
                .clickOnCaseStudiesFooter()
                .clickOnWhatWeDoFooter()
                .clickOnEventsFooter()
                .clickOnWhatWeDoFooter()
                .clickOnContactFooter()
                .clickOnWhatWeDoFooter();
    }

    @Test
    public void clickingOnAllCombinationsFromCaseStudiesPageToOtherPagesAndTheOtherWayInFooter_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnCaseStudiesFooter()
                .clickOnEventsFooter()
                .clickOnCaseStudiesFooter()
                .clickOnContactFooter()
                .clickOnCaseStudiesFooter();
    }
    @Test
    public void clickingOnAllCombinationsFromEventsPageToContactPageAndTheOtherWayInFooter_exceptTheOnesDoneBefore() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnEventsFooter()
                .clickOnContactFooter()
                .clickOnEventsFooter();
    }
}
