package pageobjects;

import core.driver.Session;
import pagecomponents.HeaderAndFooter;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.desktop.data.Element;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class CareerPage extends HeaderAndFooter {
    public CareerPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(element = Element.H1,attribute = Attribute.TEXT, value = "Inventi")
    private Div<CareerPage> title;

//TODO:
    public CareerPage checkTitleCareer(String expected){
        this.title.assertText(expected);
        return this;
    }
}
