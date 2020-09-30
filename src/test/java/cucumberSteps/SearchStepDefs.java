package cucumberSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import pagebojects.HomePage;
import pagebojects.ResultPage;
import pagebojects.SearchPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class SearchStepDefs {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();
    SearchPage searchPage = new SearchPage();

    @When("Customer search some {string} on search box")
    public void customerSearchSomeOnSearchBox(String products) {
        searchPage.searchAProduct(products);
    }

    @Then("Customer should see the searched {string}")
    public void customerShouldSeeTheSearched(String products) {
        String productTittle = resultPage.getProductTittle();
        String actualProductTittle = productTittle.replaceAll("\"DRESSES\"", "DRESSES");
        assertThat(actualProductTittle, is(equalToIgnoringCase(products)));
    }

    @Then("Customer could see  {string}number of product displayed")
    public void customerCouldSeeNumberOfProductDisplayed(String productNumber) {
        String totalProductDisplayed = resultPage.productNumber();
        System.out.println(totalProductDisplayed);
    }
}
