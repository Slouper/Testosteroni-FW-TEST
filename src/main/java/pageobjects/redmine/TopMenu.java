package pageobjects.redmine;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.core.page_object.PageObject;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Anchor;
import smartdriver.automation.framework.platforms.desktop.components.Input;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.WithoutParent;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;

@WaitForVisible
@HasAttribute(element = Element.DIV, attribute = Attribute.ID, value = "top-menu")
public class TopMenu extends PageObject {

    public TopMenu(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.CLASS, value = "register")
    private Anchor<RegistrationPage> registration;

    private Input<RegistrationPage> input;

    public RegistrationPage openRegistrationPage() {
        return registration.clickOn();
    }
}
