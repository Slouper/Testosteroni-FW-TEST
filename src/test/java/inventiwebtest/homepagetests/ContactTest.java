package inventiwebtest.homepagetests;

import core.factory.POFactory;
import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class ContactTest extends AbstractTest {

    @Test
    public void clickOnMoreAboutUsTest() {
        HomePage homepage = POFactory.initDriver();
        homepage.clickContactUs()
                .clickOnHomePageLogo()
                .clickLetsMeet();
    }
}
