package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@class=\"button btn btn-default standard-checkout button-medium\"]")
    private WebElement proceedToCheckout1Button;

    @FindBy(name = "processAddress")
    private WebElement proceedToCheckout2Button;

    @FindBy(name = "processCarrier")
    private WebElement proceedToCheckout3Button;

    @FindBy(className = "checker")
    private WebElement termsOfServiceCheckBox;

    @FindBy(className = "bankwire")
    private WebElement payByBankWireButton;

    @FindBy(xpath = "//*[@class=\"button btn btn-default button-medium\"]")
    private WebElement iConfirmMyOrderButton;

    public OrderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public OrderPage clickProceedToCheckout1Button(){
        proceedToCheckout1Button.click();
        return this;
    }

    public OrderPage clickProceedToCheckout2Button(){
        proceedToCheckout2Button.click();
        return this;
    }

    public OrderPage clickProceedToCheckout3Button(){
        proceedToCheckout3Button.click();
        return this;
    }

    public OrderPage clickTermsOfServiceCheckBox(){
        termsOfServiceCheckBox.click();
        return this;
    }

    public OrderPage clickpayByWireButton(){
        payByBankWireButton.click();
        return this;
    }

    public OrderPage clickIConfirmMyOrderButton(){
        iConfirmMyOrderButton.click();
        return this;
    }
}