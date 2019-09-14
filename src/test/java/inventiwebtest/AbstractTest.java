package inventiwebtest;


import core.test.TestClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class AbstractTest extends TestClass {


    @BeforeClass
    @Parameters({"run", "platform", "environment", "browser"})
    public void init(@Optional("LOCAL") String run,
                     @Optional("WINDOWS") String platform,
                     @Optional("DEV") String environment,
                     @Optional("CHROME") String browser) {
    }
}
