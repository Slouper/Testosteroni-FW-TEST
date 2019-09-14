package pageobjects;

import smartdriver.automation.framework.core.driver.Session;
import smartdriver.automation.framework.core.page_object.PageObject;
import smartdriver.automation.framework.platforms.desktop.HasAttribute;
import smartdriver.automation.framework.platforms.desktop.components.Anchor;
import smartdriver.automation.framework.platforms.desktop.data.Element;
import smartdriver.automation.framework.platforms.shared.annotations.synchro.WaitForVisible;
import smartdriver.automation.framework.platforms.shared.param.data.Attribute;

@WaitForVisible
@HasAttribute(element = Element.DIV, attribute = Attribute.ID, value = "__next")
public class Header extends PageObject {

    public Header(Session session) {
        super(session);
    }

    //FIXME duplicate element
    @WaitForVisible
    @HasAttribute(attribute = Attribute.ID, value = "cashloan")
    private Anchor arrangeLoan;

}
