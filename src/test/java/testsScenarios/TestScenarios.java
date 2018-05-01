package testsScenarios;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CreateAnAccountPage;
import pageObjects.MainPage;
import pageObjects.SignInPage;
import java.util.concurrent.TimeUnit;

public class TestScenarios {

    @Test
    public void registerNewUser(){

        System.setProperty("webdriver.gecko.driver", "F:\\Dwarf\\Projects\\geckodriver-v0.20.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com");

        MainPage MainPage = PageFactory.initElements(driver, MainPage.class);
        SignInPage SignInPage = PageFactory.initElements(driver, SignInPage.class);
        CreateAnAccountPage CreateAnAccountPage = PageFactory.initElements(driver, CreateAnAccountPage.class);

        MainPage.clickSigInButton();

        SignInPage.inputEmailValue();
        SignInPage.clickCreateAnAccountButton();

        CreateAnAccountPage.inputCustomerFirstNameValue();
        CreateAnAccountPage.inputCustomerLastNameValue();
        CreateAnAccountPage.inputCustomerPasswordValue();
        CreateAnAccountPage.inputCustomerAddressValue();
        CreateAnAccountPage.inputCustomerCityValue();
        CreateAnAccountPage.inputCustomerPostcodeValue();
        CreateAnAccountPage.selectCustomerIdStateValue();
        CreateAnAccountPage.inputCustomerPhoneMobileValue();
        CreateAnAccountPage.clickSubmitAnAccountButton();

        Assert.assertEquals("My account - My Store", driver.getTitle());

        driver.quit();
    }

    @Test
    public void loginAlreadyRegisteredUser(){

        System.setProperty("webdriver.gecko.driver", "F:\\Dwarf\\Projects\\geckodriver-v0.20.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com");

        MainPage MainPage = PageFactory.initElements(driver, MainPage.class);
        SignInPage SignInPage = PageFactory.initElements(driver, SignInPage.class);

        MainPage.clickSigInButton();

        SignInPage.inputRegisteredEmailValue();
        SignInPage.inputRegisteredPasswordValue();
        SignInPage.clickSignInAnAccountButton();

        Assert.assertEquals("My account - My Store", driver.getTitle());

        driver.quit();
    }
}