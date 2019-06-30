package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        PageFactory.initElements(driver, this);
    }

    public SignInPage inputEmailValue(){
        String generatedRandomString = RandomStringUtils.randomAlphanumeric(10);
        emailInputField.sendKeys(generatedRandomString + "@example.com");
        return this;
    }

    public SignInPage inputRegisteredEmailValue(){
        registeredEmailInputField.sendKeys("example123e@example.com");
        return this;
    }

    public SignInPage inputRegisteredPasswordValue(){
        registeredPasswordInputField.sendKeys("Password");
        return this;
    }

    public CreateAnAccountPage clickCreateAnAccountButton(){
        createAnAccountButton.click();
        return new CreateAnAccountPage(driver);
    }

    public MyAccountPage clickSignInAnAccountButton(){
        signInAnAccountButton.click();
        return new MyAccountPage(driver);
    }
}