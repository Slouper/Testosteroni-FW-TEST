package inventiwebtest.aboutustest;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class GetInTouchTest extends AbstractTest {

    @Test
    public void aboutUs() {
        HomePage homePage = POFactory.initDriver();
        homePage.clickOnAboutUs()
                .clickOnGetInTouch();
    }

}
