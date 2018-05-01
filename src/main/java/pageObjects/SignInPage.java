package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    private WebDriver driver;

    @FindBy(id = "email_create")
    private WebElement emailInputField;

    @FindBy(id = "email")
    private WebElement registeredEmailInputField;

    @FindBy(id = "passwd")
    private WebElement registeredPasswordInputField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    @FindBy(id = "SubmitLogin")
    private WebElement signInAnAccountButton;

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputEmailValue(){
        emailInputField.sendKeys("example123e@example.com");
    }

    public void inputRegisteredEmailValue(){
        registeredEmailInputField.sendKeys("example123e@example.com");
    }

    public void inputRegisteredPasswordValue(){
        registeredPasswordInputField.sendKeys("Password");
    }

    public void clickCreateAnAccountButton(){
        createAnAccountButton.click();
    }

    public void clickSignInAnAccountButton(){
        signInAnAccountButton.click();
    }
}