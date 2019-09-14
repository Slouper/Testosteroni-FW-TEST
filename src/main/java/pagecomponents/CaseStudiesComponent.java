package pagecomponents;

import core.driver.Session;
import pageobjects.CaseStudiesPage;
import pageobjects.casestudies.*;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Anchor;
import platforms.desktop.components.Div;
import platforms.shared.param.data.Attribute;

public abstract class CaseStudiesComponent extends HeaderAndFooter {
    public CaseStudiesComponent(Session session) {
        super(session);
    }

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/2")
    protected Anchor<CloudMigrationPage> cloudMigration;

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/9")
    protected Anchor<IntegrationPlatformPage> integrationPlatform;

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/3")
    protected Anchor<DigitalFinancialAdvisoryPage> digitalFinancialAdvisory;

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/1")
    protected Anchor<DonAppetitMobileAppPage> donAppetitMobileApp;

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/5")
    protected Anchor<SummitMediaGoodsComparatorPage> summitMediaComparator;

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/4")
    protected Anchor<TechnologicalPartnerPage> technologicalPartner;

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/8")
    protected Anchor<IntegrationTestingPage> integrationTesting;

    @HasAttribute(attribute = Attribute.HREF, value = "/case-study-detail/7")
    protected Anchor<SwcSummitWebsitePage> swcSummitWebsite;

    @HasAttribute(attribute = Attribute.CLASS, value = "StyledText__HeadingFive-sc-1d0houl-4 gJGaaT")
    private Div<CaseStudiesPage> findOutMore;

    public CaseStudiesPage clickFindOutMore() {
        return findOutMore.clickOn();
    }

    public DonAppetitMobileAppPage clickDonAppetitMobileApp() {
        return donAppetitMobileApp.clickOn();
    }

    public CloudMigrationPage clickCloudMigration() {
        return cloudMigration.clickOn();
    }

    public DigitalFinancialAdvisoryPage clickDigitalFinancialAdvisory() {
        return digitalFinancialAdvisory.clickOn();
    }

    public IntegrationPlatformPage clickIntegrationPlatform() {
        return integrationPlatform.clickOn();
    }

    public TechnologicalPartnerPage clickTechnologicalPartner() {
        return technologicalPartner.clickOn();
    }

    public SummitMediaGoodsComparatorPage clickSummitMediaComparator() {
        return summitMediaComparator.clickOn();
    }

    public IntegrationTestingPage clickIntegrationTesting() {
        return integrationTesting.clickOn();
    }

    public SwcSummitWebsitePage clickSwcSummitWebsite() {
        return swcSummitWebsite.clickOn();
    }

}
