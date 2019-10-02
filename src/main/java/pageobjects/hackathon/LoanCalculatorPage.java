package pageobjects.hackathon;

import data.LoanData;
import org.openqa.selenium.interactions.Actions;
import smartdriver.automation.framework.core.driver.DriverManager;
import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.core.page_object.Component;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.HasAttributes;
import smartdriver.automation.framework.platforms.desktop.components.Button;
import smartdriver.automation.framework.platforms.desktop.components.Span;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.component.WebElement;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;
import smartdriver.automation.framework.platforms.shared.param.data.Axis;
import smartdriver.automation.framework.platforms.shared.param.data.Function;

import static smartdriver.automation.framework.platforms.shared.param.data.Attribute.*;
import static smartdriver.automation.framework.platforms.shared.param.data.Function.CONTAINS;

public class LoanCalculatorPage extends Header {

    public LoanCalculatorPage(Session session) {
        super(session);
    }

    private static final String SLIDER_ARIA_LABEL = "Vyse pujcky";

    @WaitForVisible
    @HasAttribute(element = Element.H1, attribute = Attribute.TEXT, value = "Spočítejte si svou výhodnou půjčku")
    private Element pageHeader;

    @WaitForVisible
    @HasAttributes(attributes = {
            @HasAttribute(element = Element.SPAN, attribute = Attribute.ARIA_LABEL, value = SLIDER_ARIA_LABEL),
            @HasAttribute(element = Element.SPAN, axis = Axis.PARENT)
    })
    private Span<LoanCalculatorPage> loanAmountSlider;

    @WaitForVisible
    @HasAttributes(attributes = {
            @HasAttribute(element = Element.SPAN, attribute = Attribute.ARIA_LABEL, value = SLIDER_ARIA_LABEL),
            @HasAttribute(element = Element.SPAN, attribute = Attribute.CLASS, value = "MuiSlider-root", function = Function.CONTAINS, axis = Axis.PARENT)
    }, index = "2")
    private Span<LoanCalculatorPage> loanTermSlider;

    @HasAttribute(element = Element.SPAN, attribute = Attribute.ARIA_LABEL, value = SLIDER_ARIA_LABEL)
    private Span<LoanCalculatorPage> termAmount;

    @HasAttribute(element = Element.SPAN, attribute = Attribute.ARIA_LABEL, value = SLIDER_ARIA_LABEL, index = "2")
    private Span<LoanCalculatorPage> loanAmount;

    @HasAttribute(element = Element.H3, attribute = TEXT, function = CONTAINS, value = "Měsíční splátka")
    private WebElement<LoanCalculatorPage> installmentHeader;

    @HasAttribute(attribute = CLASS, value = "MuiIconButton-label", function = CONTAINS)
    private Span<LoanCalculatorPage> heartNoRobot;

    @HasAttribute(attribute = ID, value = "pokracovat", function = CONTAINS)
    private Button<PersonalDataPage> continueButton;

    //TODO NICE TO HAVE check if percent is in range
    private LoanCalculatorPage moveSlider(Component element, double loanPercent) {
        Actions actions = new Actions(DriverManager.getDriver(session).getRemoteWebDriver());
        int widthSlider = element.getSize().width;
        actions.moveToElement(element.getWebElement())
                .moveByOffset(-(widthSlider / 2), 0)
                .moveByOffset((int) (widthSlider * loanPercent), 0)
                .click()
                .build()
                .perform();
        return this;
    }

    public LoanCalculatorPage setLoanAmountPercent(double loanPercent) {
        moveSlider(loanAmountSlider, loanPercent);
        return this;
    }

    public LoanCalculatorPage setLoanTermPercent(double loanPercent) {
        moveSlider(loanTermSlider, loanPercent);
        return this;
    }

    public LoanCalculatorPage saveLoanDetails(LoanData loanData) {
        loanData.setLoanAmount(loanAmount.getAttribute("aria-valuenow"));
        loanData.setLoanTerm(termAmount.getAttribute("aria-valuenow"));
        loanData.setInstallmentAmount(installmentHeader.getText());
        return this;
    }

    public LoanCalculatorPage clickNoRobot() {
        heartNoRobot.click();
        continueButton.waitUntilVisible();
        return this;
    }

    public PersonalDataPage clickContinue() {
        return continueButton.clickOn();
    }

}
