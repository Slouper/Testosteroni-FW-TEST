package pageobjects;

import core.driver.Session;
import pagecomponents.OurApproachComponent;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.annotations.synchro.WaitForVisible;
import platforms.shared.param.data.Attribute;

public class WhatWeDoPage extends OurApproachComponent {

    public WhatWeDoPage(Session session) {
        super(session);
    }

    @WaitForVisible
    @HasAttribute(attribute = Attribute.TEXT, value = "Vytváříme \n" +
            " silná partnerství")
    private Div title;

    @HasAttribute(attribute = Attribute.TEXT, value = "Analýza a příprava")
    private Div titleAnalysisAndPreliminary;

    @HasAttribute(attribute = Attribute.TEXT, value = "DevOps")
    private Div titleDevOps;

    @HasAttribute(attribute = Attribute.TEXT, value = "Design a použitelnost")
    private Div titleDesignAndUX;

    @HasAttribute(attribute = Attribute.TEXT, value = "Backend vývoj")
    private Div titleBackendDevelopment;

    @HasAttribute(attribute = Attribute.TEXT, value = "Vývoj mobilních aplikací")
    private Div titleMobileAppsDevelopment;

    @HasAttribute(attribute = Attribute.TEXT, value = "Testování")
    private Div titleTesting;

    @HasAttribute(attribute = Attribute.TEXT, value = "Projektový management")
    private Div titleProjectManagement;

    @HasAttribute(attribute = Attribute.TEXT, value = "Vývoj webových aplikací")
    private Div titleWebAppsDevelopment;

    @HasAttribute(attribute = Attribute.TEXT, value = "Dodání projektu na klíč")
    private Div titleMadeToMeasureProjects;


    public WhatWeDoPage checkTitleWhatWeDo(String expected) {
        this.title.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleAnalysisAndPreliminary(String expected) {
        this.titleAnalysisAndPreliminary.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleDevOps(String expected) {
        this.titleDevOps.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleDesignAndUX(String expected) {
        this.titleDesignAndUX.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleBackendDevelopment(String expected) {
        this.titleBackendDevelopment.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleMobileAppsDevelopment(String expected) {
        this.titleMobileAppsDevelopment.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleTesting(String expected) {
        this.titleTesting.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleProjectManagement(String expected) {
        this.titleProjectManagement.assertText(expected);
        return this;
    }

    public WhatWeDoPage checkTitleWebAppsDevelopment(String expected) {
        this.titleWebAppsDevelopment.assertText(expected);
        return this;
    }

    public void checkTitleMadeToMeasureProjects(String expected) {
        this.titleMadeToMeasureProjects.assertText(expected);
    }
}
