import data.PersonalData;
import org.testng.annotations.Test;
import pageobjects.redmine.RedmineHomePage;
import smartdriver.automation.framework.core.factory.POFactory;

public class RedmineTests extends AbstractTest {

    @Test
    public void registrationDataObject() {
        PersonalData personalData = new PersonalData()
                .setFirstName("Pepa")
                .setSurname("Vomacka")
                .setEmail("pepa.vomacka666@seznam.cz");
        RedmineHomePage homePage = POFactory.initDriver();
        homePage.openRegistrationPage()
                .fillForm(personalData, "VeryStrongPassword")
                .clickSubmit();
    }

    @Test
    public void registration() {
        RedmineHomePage homePage = POFactory.initDriver();
        String pass = "ReallyStrongPassword";
        homePage.openRegistrationPage()
                .fillUserLogin("Something123")
                .fillName("John")
                .fillLastName("Wick")
                .fillPassword(pass)
                .fillConfirmedPassword(pass)
                .fillEmail("john.wick@jahu.cz")
                .clickSubmit();
    }
}
