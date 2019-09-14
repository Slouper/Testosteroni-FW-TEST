package pageobjects.casestudies;

import core.driver.Session;
import pagecomponents.CaseStudiesComponent;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class SwcSummitWebsitePage extends CaseStudiesComponent {
    public SwcSummitWebsitePage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Partnerství se Startup World Cup & Summit")
    private Div waitForTitle;
}
