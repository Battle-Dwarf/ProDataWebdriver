package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    @FindBy(className = "login")
    private WebElement sigInButton;

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public MainPage clickSigInButton(){
        sigInButton.click();
        return this;
    }
}

//test change

// second change

// mac change

// another change