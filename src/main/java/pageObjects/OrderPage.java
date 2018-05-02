package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    }

    public void clickProceedToCheckout1Button(){
        proceedToCheckout1Button.click();
    }

    public void clickProceedToCheckout2Button(){
        proceedToCheckout2Button.click();
    }

    public void clickProceedToCheckout3Button(){
        proceedToCheckout3Button.click();
    }

    public void clickTermsOfServiceCheckBox(){
        termsOfServiceCheckBox.click();
    }

    public void clickpayByWireButton(){
        payByBankWireButton.click();
    }

    public void clickIConfirmMyOrderButton(){
        iConfirmMyOrderButton.click();
    }
}