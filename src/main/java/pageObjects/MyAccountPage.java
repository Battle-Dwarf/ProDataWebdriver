package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]//li[3]//a[@title=\"T-shirts\"]")
    private static WebElement tshirtButton;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickTshirtButton(){
        tshirtButton.click();
    }
}