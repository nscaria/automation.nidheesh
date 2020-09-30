package pagebojects;

import driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends DriverHelper {

    //Xpath for filtering the  product
    @FindBy(xpath = "//div[@class='product-container']//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    private WebElement chooseAProduct;
    //Custom code for selecting a product
    public void selectAProduct() {
        chooseAProduct.click();
    }

    // Xpath for add to button
    @FindBy(xpath = "//div[@class='box-cart-bottom'] //*[contains(text(),'Add to cart')]")
    private WebElement addToBasketButton;
    public void addProductToBasket() {
        implicitlyWait();
        addToBasketButton.click();
    }

    // Xpath for Proceed to checkout
    @FindBy(xpath = "//div[@class='button-container']//*[contains(text(),'Proceed to checkout')] ")
    private WebElement proceedToCheckout;
    public void goToTrolley() {
        sleep(3000);
        proceedToCheckout.click();
    }

    public String productAddedInTheBasket() {
        implicitlyWait();
        return driver.findElement(By.xpath("//td[@class='cart_description']//p[1]/a")).getText();
    }
}
