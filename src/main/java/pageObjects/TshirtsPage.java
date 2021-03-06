package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtsPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@class=\"ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line\"]")
    private WebElement tshirtHoverElement;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElement tshirtAddToCartButton;

    @FindBy(xpath = "//*[@class=\"btn btn-default button button-medium\"]")
    private WebElement proceedToCheckoutButton;

    public TshirtsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public TshirtsPage TshirtAddToCartHoverAction() {
        Actions hoverAndClick = new Actions(driver);
        hoverAndClick.moveToElement(tshirtHoverElement);
        hoverAndClick.moveToElement(tshirtAddToCartButton);
        hoverAndClick.click().perform();
        return this;
    }

    public OrderPage clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
        return new OrderPage(driver);
    }

    public WebElement getproceedToCheckoutButton(){
        return proceedToCheckoutButton;
    }
}