package pagebojects;

        import driver.DriverHelper;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class ResultPage extends DriverHelper {

    // Custom code for what is searched and obtaining the searched product
    @FindBy(xpath = "//span[@class='lighter']")
    private WebElement labelResult;
    public String getProductTittle() {
        return labelResult.getText();
    }

    // Search product total number web element
    @FindBy(xpath = "//div[contains(@class,'top-pagination-content')]//div[@class='product-count']")
    private WebElement searchedProductNumber;
    public String productNumber() {
        return searchedProductNumber.getText();
    }
}
