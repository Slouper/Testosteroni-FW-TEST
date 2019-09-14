package pagecomponents;

import core.driver.Session;
import pageobjects.WhatWeDoPage;
import platforms.desktop.HasAttribute;
import platforms.desktop.components.Div;
import platforms.shared.param.data.Attribute;

@HasAttribute(attribute = Attribute.CLASS, value = "GridCard__CardInfoWrapper-g45q15-11 fmEtxN")
public class OurApproachComponent extends HeaderAndFooter {

    public OurApproachComponent(Session session) {
        super(session);
    }

    @HasAttribute(attribute = Attribute.TEXT, value = "Analýza a příprava")
    private Div<WhatWeDoPage> analysisAndPreliminary;

    @HasAttribute(attribute = Attribute.TEXT, value = "DevOps")
    private Div<WhatWeDoPage> devOps;

    @HasAttribute(attribute = Attribute.TEXT, value = "Design a použitelnost")
    private Div<WhatWeDoPage> designAndUX;

    @HasAttribute(attribute = Attribute.TEXT, value = "Backend vývoj")
    private Div<WhatWeDoPage> backendDevelopment;

    @HasAttribute(attribute = Attribute.TEXT, value = "Vývoj mobilních aplikací")
    private Div<WhatWeDoPage> mobileAppsDevelopment;

    @HasAttribute(attribute = Attribute.TEXT, value = "Testování")
    private Div<WhatWeDoPage> testing;

    @HasAttribute(attribute = Attribute.TEXT, value = "Projektový management")
    private Div<WhatWeDoPage> projectManagement;

    @HasAttribute(attribute = Attribute.TEXT, value = "Vývoj webových aplikací")
    private Div<WhatWeDoPage> webAppsDevelopment;

    @HasAttribute(attribute = Attribute.TEXT, value = "Dodání projektu na klíč")
    private Div<WhatWeDoPage> madeToMeasureProjects;

    public WhatWeDoPage clickOnAnalysisAndPreliminary() {
        return this.analysisAndPreliminary.clickOn();
    }

    public WhatWeDoPage clickOnDevOps() {
        return this.devOps.clickOn();
    }

    public WhatWeDoPage clickOnDesignAndUX() {
        return this.designAndUX.clickOn();
    }

    public WhatWeDoPage clickOnBackendDevelopment() {
        return this.backendDevelopment.clickOn();
    }

    public WhatWeDoPage clickOnMobileAppsDevelopment() {
        return this.mobileAppsDevelopment.clickOn();
    }

    public WhatWeDoPage clickOnTesting() {
        return this.testing.clickOn();
    }

    public WhatWeDoPage clickOnProjectManagement() {
        return this.projectManagement.clickOn();
    }

    public WhatWeDoPage clickOnWebAppsDevelopment() {
        return this.webAppsDevelopment.clickOn();
    }

    public WhatWeDoPage clickOnMadeToMeasureProjects() {
        return this.madeToMeasureProjects.clickOn();
    }

}
