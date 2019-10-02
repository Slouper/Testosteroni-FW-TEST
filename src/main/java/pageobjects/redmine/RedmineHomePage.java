package pageobjects.redmine;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.WebApplication;
import smartdriver.automation.framework.platforms.shared.annotations.WithoutParent;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;

@WebApplication(application = "redmine")
@WaitForVisible
@HasAttribute(element = Element.DIV, attribute = Attribute.ID, value = "content")
@WithoutParent
public class RedmineHomePage extends Header {

    public RedmineHomePage(Session session) {
        super(session);
    }

}
