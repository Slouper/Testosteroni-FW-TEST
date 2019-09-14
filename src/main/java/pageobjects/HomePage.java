package pageobjects;

import core.driver.Session;
import core.factory.POFactory;
import pagecomponents.CaseStudiesComponent;
import pageobjects.casestudies.*;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Button;
import platforms.desktop.components.Div;
import platforms.shared.annotations.WebApplication;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;


@WebApplication(application = "INVENTI")
public class HomePage extends CaseStudiesComponent {

    public HomePage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Tvoříme budoucnost")
    private Div waitForTitle;

    @HasAttribute(attribute = Attribute.CLASS, value = "StyledButton__Button-sc-1z00jeb-0 igMHJC")
    private Button<CaseStudiesPage> iWantToKnowMore;

    @HasAttribute(attribute = Attribute.CLASS, value = "ItsAboutPeople__AboutUsButton-sc-1ovqgr1-7 bPqxyE StyledButton__Button-sc-1z00jeb-0 iAZrZJ")
    private Button<AboutUsPage> moreAboutUs;

    @HasAttribute(attribute = Attribute.CLASS, value = "pages__EventsButton-yzf4oe-3 gRvFoc StyledButton__Button-sc-1z00jeb-0 igMHJC")
    private Button<EventsPage> moreAboutEvents;

    @HasAttribute(attribute = Attribute.CLASS, value = "GetInTouch__ContactsButton-sc-1y51sxc-4 boTfjt StyledButton__Button-sc-1z00jeb-0 jMOAaJ")
    private Button<ContactPage> contactUs;

    @HasAttribute(attribute = Attribute.CLASS, value = "GetInTouch__EventsButton-sc-1y51sxc-5 iVCthS StyledButton__Button-sc-1z00jeb-0 jMOAaJ")
    private Button<EventsPage> letsMeet;


    public CaseStudiesPage clickIWantToKnowMore() {
        return iWantToKnowMore.clickOn();
    }

    public AboutUsPage clickMoreAboutUs() {
        return moreAboutUs.clickOn();
    }

    public EventsPage clickMoreAboutEvents() {
        return moreAboutEvents.clickOn();
    }

    public EventsPage clickLetsMeet() {
        return letsMeet.clickOn();
    }

    public ContactPage clickContactUs() {
        return contactUs.clickOn();
    }
}
