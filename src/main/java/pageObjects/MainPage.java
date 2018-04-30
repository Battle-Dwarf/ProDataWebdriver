package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private WebDriver driver;

    @FindBy(className = "login")
    private WebElement SigInButton;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSigInButton(){
        SigInButton.click();
    }
}