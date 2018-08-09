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

    public void inputCustomerFirstNameValue(){
        customerFirstNameField.sendKeys("First Name");
    }

    public void inputCustomerLastNameValue(){
        customerLastNameField.sendKeys("Last Name");
    }

    public void inputCustomerPasswordValue(){
        customerPasswordField.sendKeys("Password");
    }

    public void inputCustomerAddressValue(){
        customerAddressField.sendKeys("Address Name");
    }

    public void inputCustomerCityValue(){
        customerCityField.sendKeys("City Name");
    }

    public void inputCustomerPostcodeValue(){
        customerPostcodeField.sendKeys("11223");
    }

    public void selectCustomerIdStateValue(){
        Select state = new Select(customerIdStateSelectBox);
        state.selectByVisibleText("Alaska");
    }

    public void inputCustomerPhoneMobileValue(){
        customerPhoneMobileField.sendKeys("111222333");
    }

    public void clickSubmitAnAccountButton(){
        submitAnAccountButton.click();
    }
}