package pageobjects;

import core.driver.Session;
import pagecomponents.HeaderAndFooter;
import platforms.desktop.HasAttribute;
import platforms.desktop.HasAttributes;
import platforms.desktop.components.Div;
import platforms.desktop.data.Element;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class EventsPage extends HeaderAndFooter {

    public EventsPage(Session session) {

        super(session);
    }

    @WaitForVisible
    @HasAttributes(attributes = {
            @HasAttribute(element = Element.ANCHOR, attribute = Attribute.HREF, value = "/academy-detail/3"),
            @HasAttribute(element = Element.DIV, attribute = Attribute.CLASS, value = "AcademyCard__Wrapper-sc-12bc1or-1 cSzNMg"),
    })
    private Div<AcademyDetailPage> testAcademy;

    public AcademyDetailPage clickOnTestAcademy() {
        return testAcademy.clickOn();
    }
}
