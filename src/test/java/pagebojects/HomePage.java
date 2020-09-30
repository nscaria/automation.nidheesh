package pagebojects;

import driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverHelper {

    public HomePage() {
    }

    // Retrieving the homepage url for verification
    public String homePageUrl() {
        return driver.getCurrentUrl();
    }

    // Click sign in button web element
    @FindBy(xpath = "//div[@class='header_user_info']//a[contains(text(),'Sign in' )]")
    private WebElement signIn;
    public void navigateToSignIn() {
        signIn.click();
        implicitlyWait();
    }

    // set a value in Sign in box web element
    @FindBy(xpath ="//form[@id='login_form']//input[@id='email']")
    private WebElement signInBox;
    public void enterEmailID(String emailID) {
        waitUntilWebElementIsPresent(signInBox);
        implicitlyWait();
        signInBox.click();
        signInBox.sendKeys(emailID);
    }

    // set a value in passWord box web element
    @FindBy(css = "#passwd")
    private WebElement passWordBox;
    public void enterPassWord(String passWord) {
        passWordBox.sendKeys(passWord);
    }

    // click Sign in button web element
    @FindBy(css = "#SubmitLogin")
    private WebElement signInButton;
    public void clickSignInButton() {
        signInButton.click();
    }


    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement myAccountPageName;

    public String myAccountPage(){
        return myAccountPageName.getText();
    }
}
