package pageobjects;

import core.driver.Session;
import pagecomponents.HeaderAndFooter;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class ContactPage extends HeaderAndFooter {

    public ContactPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Pojďme se \n" +
            " seznámit")
    private Div title;

}
