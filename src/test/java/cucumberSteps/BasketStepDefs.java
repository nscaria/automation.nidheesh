package cucumberSteps;

import driver.DriverHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.hamcrest.Matchers;
import pagebojects.BasketPage;
import pagebojects.HomePage;
import pagebojects.ResultPage;
import pagebojects.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class BasketStepDefs extends DriverHelper {

    BasketPage basketPage = new BasketPage();
    SearchPage searchPage = new SearchPage();

    @And("User chooses Faded Short Sleeve T-shirts from resultPage")
    public void userChoosesFadedShortSleeveTShirtsFromResultPage() {
        implicitlyWait();
        basketPage.selectAProduct();
    }

    @And("User add product to the basket")
    public void userAddProductToTheBasket() {
        implicitlyWait();
        basketPage.addProductToBasket();
        implicitlyWait();
        basketPage.goToTrolley();
    }

    @Then("User should see product been added to the basket")
    public void userShouldSeeProductBeenAddedToTheBasket() {
        String productSelected = basketPage.productAddedInTheBasket();
        assertThat(productSelected,Matchers.is(Matchers.equalToIgnoringCase("Faded Short Sleeve T-shirts")));
    //   assertThat(productSelected, Matchers.equalToIgnoringCase("Faded Short Sleeve T-shirts"));
//        String actualProductInTheBasket = basketPage.productAddedInTheBasket();
//        //System.out.println("actualProductInTheBasket ="+actualProductInTheBasket);
//        assertThat(actualProductInTheBasket, Matchers.equalToIgnoringCase(searchPage.productSearched));
    }
}
