package pageobjects;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Anchor;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.WebApplication;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;

@WebApplication(application = "hackathon")
@WaitForVisible
@HasAttribute(element = Element.DIV, attribute = Attribute.ID, value = "__next")
public class HomePage extends Header {

    public HomePage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(element = Element.H2, attribute = Attribute.TEXT, value = "Půjčka pro splnění vašich přání.")
    private Element pageHeader;

    //FIXME duplicate element
    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "cashloan")
    private Anchor<CashLoanPage> arrangeLoan;

    public CashLoanPage clickArrangeLoan() {
        return arrangeLoan.clickOn();
    }

}
