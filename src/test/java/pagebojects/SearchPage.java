package pagebojects;

import driver.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverHelper {
    //creating variable to store the search value before its is passed down for searching
    public static String searchedProduct;

    // Search box web element
    @FindBy(xpath = "//form[@id='searchbox']//input[@id='search_query_top']")
    private WebElement searchBox;

    // Search button web element
    @FindBy(xpath = "//form[@id='searchbox']//button[@name='submit_search']")
    private WebElement searchButton;

    public static String productSearched;

    public void searchAProduct(String searchItem) {
        productSearched = searchItem;//storing the search value for assertion
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }

}
