package pageobjects;

import core.driver.Session;
import core.factory.POFactory;
import pagecomponents.CaseStudiesComponent;
import platforms.desktop.HasAttribute;
import platforms.desktop.HasAttributes;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class CaseStudiesPage extends CaseStudiesComponent {
    public CaseStudiesPage(Session session) {
        super(session);
    }

    private int x = 5;
    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Inventujeme skvělé myšlenky")
    private Div waitForTitle;


    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Vše")})
    private Div<CaseStudiesPage> all;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Analýza")})
    private Div<CaseStudiesPage> analysis;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Devops")})
    private Div<CaseStudiesPage> devops;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Java")})
    private Div<CaseStudiesPage> java;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Projektový management")})
    private Div<CaseStudiesPage> projectManagement;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "JavaScript")})
    private Div<CaseStudiesPage> javaScript;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Web Design")})
    private Div<CaseStudiesPage> webDesign;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Mobilní vývoj")})
    private Div<CaseStudiesPage> mobileDev;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "SectionFilter__FilterWrapper-sc-31f43p-0 dmMytA"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Testování")})
    private Div<CaseStudiesPage> testing;

    public CaseStudiesPage visibilityControlOfAllProjects() {
        all.clickOn();
        cloudMigration.waitUntilVisible(x);
        donAppetitMobileApp.waitUntilVisible(x);
        digitalFinancialAdvisory.waitUntilVisible(x);
        integrationPlatform.waitUntilVisible(x);
        technologicalPartner.waitUntilVisible(x);
        summitMediaComparator.waitUntilVisible(x);
        integrationTesting.waitUntilVisible(x);
        swcSummitWebsite.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfAnalysisProjects() {
        analysis.clickOn();
        cloudMigration.waitUntilVisible(x);
        donAppetitMobileApp.waitUntilVisible(x);
        digitalFinancialAdvisory.waitUntilVisible(x);
        integrationPlatform.waitUntilVisible(x);
        technologicalPartner.waitUntilVisible(x);
        summitMediaComparator.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfDevopsProjects() {
        devops.clickOn();
        cloudMigration.waitUntilVisible(x);
        digitalFinancialAdvisory.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfTestingProjects() {
        testing.clickOn();
        donAppetitMobileApp.waitUntilVisible(x);
        digitalFinancialAdvisory.waitUntilVisible(x);
        integrationPlatform.waitUntilVisible(x);
        technologicalPartner.waitUntilVisible(x);
        summitMediaComparator.waitUntilVisible(x);
        integrationTesting.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfMobileDevProjects() {
        mobileDev.clickOn();
        donAppetitMobileApp.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfWebDesignProjects() {
        webDesign.clickOn();
        donAppetitMobileApp.waitUntilVisible(x);
        digitalFinancialAdvisory.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfJavaScriptProjects() {
        javaScript.clickOn();
        digitalFinancialAdvisory.waitUntilVisible(x);
        summitMediaComparator.waitUntilVisible(x);
        swcSummitWebsite.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfJavaProjects() {
        java.clickOn();
        integrationPlatform.waitUntilVisible(x);
        technologicalPartner.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

    public CaseStudiesPage visibilityControlOfProjectManagementProjects() {
        projectManagement.clickOn();
        donAppetitMobileApp.waitUntilVisible(x);
        digitalFinancialAdvisory.waitUntilVisible(x);
        integrationPlatform.waitUntilVisible(x);
        technologicalPartner.waitUntilVisible(x);
        summitMediaComparator.waitUntilVisible(x);
        swcSummitWebsite.waitUntilVisible(x);
        return POFactory.createObject(getSession());
    }

}
