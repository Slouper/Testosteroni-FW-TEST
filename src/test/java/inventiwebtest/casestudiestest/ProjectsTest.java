package inventiwebtest.casestudiestest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class ProjectsTest extends AbstractTest {

    @Test
    public void visibilityControlOfAllTypesOfProjects() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnCaseStudies()
                .visibilityControlOfAllProjects()
                .visibilityControlOfAnalysisProjects()
                .visibilityControlOfDevopsProjects()
                .visibilityControlOfProjectManagementProjects()
                .visibilityControlOfJavaProjects()
                .visibilityControlOfJavaScriptProjects()
                .visibilityControlOfWebDesignProjects()
                .visibilityControlOfMobileDevProjects()
                .visibilityControlOfTestingProjects();
    }
}
