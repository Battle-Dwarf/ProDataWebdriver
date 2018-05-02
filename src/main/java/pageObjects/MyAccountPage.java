package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]//li[3]//a[@title=\"T-shirts\"]")
    private static WebElement tshirtButton;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTshirtButton(){
        tshirtButton.click();
    }
}