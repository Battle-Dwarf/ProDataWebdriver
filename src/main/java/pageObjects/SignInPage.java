package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    private WebDriver driver;

    @FindBy(id = "email_create")
    private WebElement emailInputField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputEmailValue(){
        emailInputField.sendKeys("example123a@example.com");
    }

    public void clickCreateAnAccountButton(){
        createAnAccountButton.click();
    }
}