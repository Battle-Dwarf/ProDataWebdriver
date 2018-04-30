package testsScenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.MainPage;
import pageObjects.SignInPage;

public class RegisterNewUser {

    @Test
    public void testScenario(){

        System.setProperty("webdriver.gecko.driver", "F:\\Dwarf\\Projects\\geckodriver-v0.20.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://automationpractice.com");

        MainPage MainPage = PageFactory.initElements(driver, MainPage.class);
        SignInPage SignInPage = PageFactory.initElements(driver, SignInPage.class);

        MainPage.clickSigInButton();
        SignInPage.inputEmailValue();
        SignInPage.clickCreateAnAccountButton();

        driver.quit();
    }
}