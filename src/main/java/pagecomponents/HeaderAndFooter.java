package pagecomponents;

import core.driver.Session;
import core.page_object.PageObject;
import pageobjects.*;
import platforms.desktop.HasAttribute;
import platforms.desktop.HasAttributes;
import platforms.desktop.components.Div;
import platforms.shared.component.WebElement;
import platforms.shared.param.data.Attribute;

public abstract class HeaderAndFooter extends PageObject {

    public HeaderAndFooter(Session session) {

        super(session);
    }

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Menu__MenuItem-sc-13b7j7m-1 kxgXkU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Kdo jsme")})
    private Div<AboutUsPage> aboutUs;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Menu__MenuItem-sc-13b7j7m-1 kxgXkU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Co děláme")})
    private Div<WhatWeDoPage> whatWeDo;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Menu__MenuItem-sc-13b7j7m-1 kxgXkU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Case studies")})
    private Div<CaseStudiesPage> caseStudies;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Menu__MenuItem-sc-13b7j7m-1 kxgXkU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Kariéra")})
    private Div<CareerPage> career;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Menu__MenuItem-sc-13b7j7m-1 kxgXkU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Akce")})
    private Div<EventsPage> events;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Menu__MenuItem-sc-13b7j7m-1 kxgXkU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Kontakt")})
    private Div<ContactPage> contact;


    @HasAttribute(attribute = Attribute.ALT, value = "Inventi logo")
    private WebElement<HomePage> homePageLogo;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Footer__FooterCard-sc-13joxi2-3 gxTloU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Kdo jsme")})
    private Div<AboutUsPage> aboutUsFooter;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Footer__FooterCard-sc-13joxi2-3 gxTloU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Co děláme")})
    private Div<WhatWeDoPage> whatWeDoFooter;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Footer__FooterCard-sc-13joxi2-3 gxTloU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Case studies")})
    private Div<CaseStudiesPage> caseStudiesFooter;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Footer__FooterCard-sc-13joxi2-3 gxTloU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Kariéra")})
    private Div<CareerPage> careerFooter;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Footer__FooterCard-sc-13joxi2-3 gxTloU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Akce")})
    private Div<EventsPage> eventsFooter;

    @HasAttributes(attributes = {
            @HasAttribute(attribute = Attribute.CLASS, value = "Footer__FooterCard-sc-13joxi2-3 gxTloU"),
            @HasAttribute(attribute = Attribute.TEXT, value = "Kontakt")})
    private Div<ContactPage> contactFooter;


    public AboutUsPage clickOnAboutUs() {
        return aboutUs.clickOn();
    }

    public WhatWeDoPage clickOnWhatWeDo() {
        return whatWeDo.clickOn();
    }

    public CaseStudiesPage clickOnCaseStudies() {
        return caseStudies.clickOn();
    }

    public CareerPage clickOnCareer() {
        return career.clickOn();
    }

    public ContactPage clickOnContact() {
        return contact.clickOn();
    }

    public EventsPage clickOnEvents() {
        return events.clickOn();
    }

    public HomePage clickOnHomePageLogo() {
        return homePageLogo.clickOn();
    }

    public AboutUsPage clickOnAboutUsFooter() {
        return aboutUsFooter.clickOn();
    }

    public WhatWeDoPage clickOnWhatWeDoFooter() {
        return whatWeDoFooter.clickOn();
    }

    public CaseStudiesPage clickOnCaseStudiesFooter() {
        return caseStudiesFooter.clickOn();
    }

    public CareerPage clickOnCareerFooter() {
        return careerFooter.clickOn();
    }

    public ContactPage clickOnContactFooter() {
        return contactFooter.clickOn();
    }

    public EventsPage clickOnEventsFooter() {

        return eventsFooter.clickOn();
    }
}
