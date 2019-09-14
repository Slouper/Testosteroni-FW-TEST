package pageobjects;

import core.driver.Session;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class AboutUsPage extends HomePage {

    public AboutUsPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Rosteme spolu \n" +
            " k novým výzvám")
    private Div title;

    @HasAttribute(attribute = Attribute.TEXT, value = "Ozvěte se nám!")
    private Div<ContactPage> getInTouch;


    public ContactPage clickOnGetInTouch(){
        return getInTouch.clickOn();
    }
}
