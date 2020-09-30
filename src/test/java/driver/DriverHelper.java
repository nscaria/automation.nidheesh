package driver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DriverHelper {
    //initialized WebDriver as Global variable
    public static WebDriver driver;

    // Creating a constructor, initialise page factory  at driver-level for using locators
    public DriverHelper() {
        PageFactory.initElements(driver, this);
    }

    //Cross browser flexibility through switch case//
    public void browserChoice(String browser) {
        switch (browser) {
            // Initialising the chrome/IE driver etc
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "IE":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "Safari":
                driver = new SafariDriver();
                break;
            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }
    }

    /**
     * Browser level interactions
     */

    // Navigating to the test website
    public void navigateToURL(String url) {
        driver.get(url);
    }

    // Maximising the browser
    public void maximiseBrowser() {
        driver.manage().window().maximize();
    }

    // Clearing the cookies pop ups
//    public void privacyFooter() {
//        driver.findElement(By.className("privacy-prompt-footer")).click();
//    }

    // Delete the cookies
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    // Close the browser
    public void closeBrowser() {
        driver.quit();
    }

    /**
     * web driver waits
     */

    //Custom sleep method
    public void sleep(int minutes) {
        try {
            Thread.sleep(minutes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Apply the implicit wait
    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //Web driver Wait
  public void waitUntilWebElementIsPresent(WebElement element) {
       new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
  }

    /**
     * Perform an action
     */
    // custom action class method to perform an action on the webElements
    public WebElement clickOnHiddenProduct(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        return element;
    }

    // Custom random generator method  to collect product randomly
    public int randomNumberGenerator(int size) {
        Random random = new Random();
        return random.nextInt(size - 1);
    }

    //Custom method to capture screenshot if any failure
    public void takeScreenShot(Scenario scenario) {
        byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
    }
}
