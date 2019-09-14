package pageobjects.casestudies;

import core.driver.Session;
import pagecomponents.CaseStudiesComponent;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class SummitMediaGoodsComparatorPage extends CaseStudiesComponent {
    public SummitMediaGoodsComparatorPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Top srovnávač zboží v UK a Německu")
    private Div waitForTitle;
}
