package inventiwebtest.eventstest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class AcademyRegistrationTest extends AbstractTest {

    @Test
    public void academyRegistration() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnEvents()
                .clickOnTestAcademy()
                .registrationToAcademy("bla", "bla@bla.bla", "602144254", "bla bla", "200 years", "i dont know", "https://www.linkedin.com", "Váš formulář byl úspěšně odeslán.");
    }
}
