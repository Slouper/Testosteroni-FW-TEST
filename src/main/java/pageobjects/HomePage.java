package pageobjects;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Anchor;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.WebApplication;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;
import smartdriver.automation.framework.platforms.shared.param.data.Function;

@WebApplication(application = "hackathon")
@WaitForVisible
@HasAttribute(element = Element.DIV, attribute = Attribute.ID, value = "__next")
public class HomePage extends Header {

    public HomePage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(element = Element.H2, attribute = Attribute.TEXT, value = "Jsme fintech banka", function = Function.CONTAINS)
    private Element pageHeader;


    public CashLoanPage clickArrangeLoan() {
        return arrangeLoan.clickOn();
    }

}
