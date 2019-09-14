package inventiwebtest.aboutustest;

import inventiwebtest.AbstractTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import smartdriver.automation.framework.core.factory.POFactory;

public class GetInTouchTest extends AbstractTest {

    @Test
    public void aboutUs() {
        HomePage homePage = POFactory.initDriver();
    }

}
