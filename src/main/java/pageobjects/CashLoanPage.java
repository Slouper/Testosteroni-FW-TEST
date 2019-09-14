package pageobjects;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Button;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;

@WaitForVisible
@HasAttribute(element = Element.DIV, attribute = Attribute.ID, value = "__next")
public class CashLoanPage extends Header {

    public CashLoanPage(Session session) {
        super(session);
    }

    @HasAttribute(element = Element.H1, attribute = Attribute.TEXT, value = "Půjčka je prostě fajn")
    @WaitForVisible
    private Element pageHeader;

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TITLE, value = "Chci půjčku - pokračovat na kalkulátor")
    private Button<LoanCalculatorPage> wantLoan;

    public LoanCalculatorPage clickWantLoan() {
        return wantLoan.clickOn();
    }
}
