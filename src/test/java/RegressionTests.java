import data.LoanData;
import data.PersonalData;
import org.testng.annotations.Test;
import pageobjects.hackathon.HomePage;
import smartdriver.automation.framework.core.driver.DriverManager;
import smartdriver.automation.framework.core.factory.POFactory;

public class RegressionTests extends AbstractTest {

    @Test
    public void generalFlowTest() {
        PersonalData personalData = new PersonalData()
                .setFirstName("Pepa")
                .setSurname("Vomáčka")
                .setPhone(TestUtil.generatePhone())
                .setBirthNumber(TestUtil.generateBirthNumber())
                .setCity("Praha")
                .setEmail("pepa.vomacka666@seznam.cz");

        LoanData realLoanData = new LoanData();

        HomePage homePage = POFactory.initDriver();
        homePage.doMagic()
                .clickArrangeLoan()
                .clickWantLoan()
                .setLoanAmountPercent(0.75)
                .setLoanTermPercent(0.5)
                .saveLoanDetails(realLoanData)
                .clickNoRobot()
                .clickContinue()
                .fillForm(personalData)
                .clickSubmit()
                .processSubmit()
                .uploadIdCard();
    }
}
