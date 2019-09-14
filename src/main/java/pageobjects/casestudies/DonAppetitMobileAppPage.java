package pageobjects.casestudies;

import core.driver.Session;
import pagecomponents.CaseStudiesComponent;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class DonAppetitMobileAppPage extends CaseStudiesComponent {
    public DonAppetitMobileAppPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Mobilní aplikace pro gurmány")
    private Div waitForTitle;


}
