package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage {

    private WebDriver driver;

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstNameField;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastNameField;

    @FindBy(id = "passwd")
    private WebElement customerPasswordField;








    public CreateAnAccountPage(WebDriver driver){
        this.driver = driver;
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
}