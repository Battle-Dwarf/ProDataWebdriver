package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {

    private WebDriver driver;

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstNameField;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastNameField;

    @FindBy(id = "passwd")
    private WebElement customerPasswordField;

    @FindBy(id = "address1")
    private WebElement customerAddressField;

    @FindBy(id = "city")
    private WebElement customerCityField;

    @FindBy(id = "postcode")
    private WebElement customerPostcodeField;

    @FindBy(id = "id_state")
    private WebElement customerIdStateSelectBox;

    @FindBy(id = "phone_mobile")
    private WebElement customerPhoneMobileField;

    @FindBy(name = "submitAccount")
    private WebElement submitAnAccountButton;

    public CreateAnAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CreateAnAccountPage inputCustomerFirstNameValue(){
        customerFirstNameField.sendKeys("First Name");
        return this;
    }

    public CreateAnAccountPage inputCustomerLastNameValue(){
        customerLastNameField.sendKeys("Last Name");
        return this;
    }

    public CreateAnAccountPage inputCustomerPasswordValue(){
        customerPasswordField.sendKeys("Password");
        return this;
    }

    public CreateAnAccountPage inputCustomerAddressValue(){
        customerAddressField.sendKeys("Address Name");
        return this;
    }

    public CreateAnAccountPage inputCustomerCityValue(){
        customerCityField.sendKeys("City Name");
        return this;
    }

    public CreateAnAccountPage inputCustomerPostcodeValue(){
        customerPostcodeField.sendKeys("11223");
        return this;
    }

    public CreateAnAccountPage selectCustomerIdStateValue(){
        Select state = new Select(customerIdStateSelectBox);
        state.selectByVisibleText("Alaska");
        return this;
    }

    public CreateAnAccountPage inputCustomerPhoneMobileValue(){
        customerPhoneMobileField.sendKeys("111222333");
        return this;
    }

    public CreateAnAccountPage clickSubmitAnAccountButton(){
        submitAnAccountButton.click();
        return this;
    }
}