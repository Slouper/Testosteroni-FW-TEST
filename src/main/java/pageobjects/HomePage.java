package pageobjects;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.core.page_object.PageObject;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Div;
import smartdriver.automation.framework.platforms.shared.annotations.WebApplication;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;

@WebApplication(application = "INVENTI")
public class HomePage extends PageObject {

    public HomePage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Tvoříme budoucnost")
    private Div waitForTitle;

    public void clickMoreAboutUs() {
         waitForTitle.click();
    }

}
