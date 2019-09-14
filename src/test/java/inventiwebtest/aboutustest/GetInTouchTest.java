package inventiwebtest.aboutustest;

import data.LoanData;
import data.PersonalData;
import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import smartdriver.automation.framework.core.factory.POFactory;

public class GetInTouchTest extends AbstractTest {

    @Test
    public void aboutUs() {
        PersonalData personalData = new PersonalData();
        personalData.setFirstName("Pepa")
                .setSurname("Vomáčka")
                //TODO phone generator
                .setPhone("777111222")
                //TODO email generator
                .setBirthNumber("9011074853")
                .setCity("Praha")
                .setEmail("pepa.vomacka666@seznam.cz");

        LoanData realLoanData = new LoanData();

        HomePage homePage = POFactory.initDriver();
        homePage.clickArrangeLoan()
                .clickWantLoan()
                .setLoanAmountPercent(0.75)
                .setLoanTerm(0.5)
                .saveLoanDetails(realLoanData)
                .clickNoRobot()
                .clickContinue()
                .fillForm(personalData)
                .clickSubmit()
                .processSubmit()
                .uploadIdCard();

    }

}
