package pageobjects.hackathon;

import data.LoanData;
import data.PersonalData;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import smartdriver.automation.framework.core.configuration.timeouts.Timeout;
import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Button;
import smartdriver.automation.framework.platforms.desktop.components.Span;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;
import smartdriver.automation.framework.platforms.shared.param.data.Function;

public class PrescoringPage extends Header {

    public PrescoringPage(Session session) {
        super(session);
    }

    @WaitForVisible(timeout = Timeout.LONG)
    @HasAttribute(element = Element.H2, attribute = Attribute.TEXT, value = "PreScoring", function = Function.CONTAINS)
    private Element pageHeader;

    @HasAttribute(attribute = Attribute.ID, value = "firstname", function = Function.CONTAINS)
    private Span<PrescoringPage> firstName;

    @HasAttribute(attribute = Attribute.ID, value = "surname", function = Function.CONTAINS)
    private Span<PrescoringPage> surname;

    @HasAttribute(attribute = Attribute.ID, value = "tel", function = Function.CONTAINS)
    private Span<PrescoringPage> phone;

    @HasAttribute(attribute = Attribute.ID, value = "email", function = Function.CONTAINS)
    private Span<PrescoringPage> email;

    @HasAttribute(attribute = Attribute.ID, value = "city", function = Function.CONTAINS)
    private Span<PrescoringPage> city;

    @HasAttribute(attribute = Attribute.ID, value = "loanAmount", function = Function.CONTAINS)
    private Span<PrescoringPage> loanAmount;

    @HasAttribute(attribute = Attribute.ID, value = "loanPeriod", function = Function.CONTAINS)
    private Span<PrescoringPage> loanTerm;

    @HasAttribute(attribute = Attribute.ID, value = "payment", function = Function.CONTAINS)
    private Span<PrescoringPage> installment;

    public PrescoringPage checkData(PersonalData personalData, LoanData loanData) {
        Assert.assertEquals(substringByColon(firstName.getText()), personalData.getFirstName());
        Assert.assertEquals(substringByColon(surname.getText()), personalData.getSurname());
        Assert.assertEquals(substringByColon(phone.getText()), personalData.getPhone());
        Assert.assertEquals(substringByColon(email.getText()), personalData.getEmail());
        Assert.assertEquals(substringByColon(city.getText()), personalData.getCity());
        Assert.assertEquals(substringByColon(loanAmount.getText()), loanData.getLoanAmount());
        Assert.assertEquals(substringByColon(loanTerm.getText()), loanData.getLoanTerm());
        Assert.assertEquals(substringByColon(installment.getText()), loanData.getInstallmentAmount());
        return this;
    }

    @HasAttribute(attribute = Attribute.TITLE, value = "Pokračovat", function = Function.CONTAINS)
    private Button<IdCardPage> submit;

    //TODO move to util
    private static String substringByColon(String text) {
        return StringUtils.substringAfterLast(text, ":").trim();
    }

    public IdCardPage processSubmit() {
        return submit.clickOn();
    }
}
