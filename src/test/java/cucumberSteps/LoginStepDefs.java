package cucumberSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagebojects.HomePage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class LoginStepDefs {
    HomePage homePage = new HomePage();

    @Given("Customer is on a homepage")
    public void customerIsOnAHomepage() {
        String actualHomepageUrl = homePage.homePageUrl();
        // verifying that the customer is on exact homepage
        assertThat(actualHomepageUrl,endsWith(".com/index.php"));
    }

    @When("user navigates to sign in page")
    public void userNavigatesToSignInPage() {
        homePage.navigateToSignIn();

    }

    @And("User enter valid {string} and valid {string}")
    public void userEnterValidAndValid(String email, String passWord) {
        homePage.enterEmailID(email);
        homePage.enterPassWord(passWord);
    }

    @And("user sign")
    public void userSign() {
        homePage.clickSignInButton();
    }

    @Then("User navigates to my account page")
    public void userNavigatesToMyAccountPage() {
       String loginPageName = homePage.myAccountPage();
        assertThat(loginPageName, is(equalToIgnoringCase("MY ACCOUNT")));
    }
}

