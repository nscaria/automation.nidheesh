import driver.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    // Object creation of the driver class
    DriverHelper driverHelper = new DriverHelper();

    //Annotating to control the flow
    @Before
    public void setUp() {
        //Choose here which Browser you would perform your test
        driverHelper.browserChoice("Chrome");
        //passing the test url
        driverHelper.navigateToURL("http://automationpractice.com/index.php");
        // Maximising the browse
        driverHelper.maximiseBrowser();
        //waiting to load the page
        driverHelper.implicitlyWait();
    }

    @After
    //checking the failed Scenario and capturing the screenshot
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            driverHelper.takeScreenShot(scenario);
        }
        // after execution quiting the browser
        driverHelper.closeBrowser();
    }
}
