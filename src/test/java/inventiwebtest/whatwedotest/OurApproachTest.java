package inventiwebtest.whatwedotest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class OurApproachTest extends AbstractTest {

    @Test
    public void ourApproach() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnWhatWeDo()
                .checkTitleWhatWeDo("Vytváříme \n" +
                        " silná partnerství")
                .clickOnAnalysisAndPreliminary()
                .checkTitleAnalysisAndPreliminary("Analýza a příprava")
                .clickOnDevOps()
                .checkTitleDevOps("DevOps")
                .clickOnDesignAndUX()
                .checkTitleDesignAndUX("Design a použitelnost")
                .clickOnBackendDevelopment()
                .checkTitleBackendDevelopment("Backend vývoj")
                .clickOnMobileAppsDevelopment()
                .checkTitleMobileAppsDevelopment("Vývoj mobilních aplikací")
                .clickOnTesting()
                .checkTitleTesting("Testování")
                .clickOnProjectManagement()
                .checkTitleProjectManagement("Projektový management")
                .clickOnWebAppsDevelopment()
                .checkTitleWebAppsDevelopment("Vývoj webových aplikací")
                .clickOnMadeToMeasureProjects()
                .checkTitleMadeToMeasureProjects("Dodání projektu na klíč");
    }



}