package pageobjects.casestudies;

import core.driver.Session;
import pagecomponents.CaseStudiesComponent;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class DigitalFinancialAdvisoryPage extends CaseStudiesComponent {
    public DigitalFinancialAdvisoryPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Digitální investiční poradenství")
    private Div waitForTitle;
}
