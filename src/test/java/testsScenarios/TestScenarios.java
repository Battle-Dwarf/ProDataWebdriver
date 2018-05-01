package testsScenarios;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

public class TestScenarios {

    private WebDriver driver;

    @Before
    public void SetUp() {

        System.setProperty("webdriver.gecko.driver", "F:\\Dwarf\\Projects\\geckodriver-v0.20.1-win64\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com");
    }

    @After
    public void CleanUp(){
        driver.quit();
    }

    @Test
    public void registerNewUser() {

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
    }

    @Test
    public void loginAlreadyRegisteredUser(){
        MainPage MainPage = PageFactory.initElements(driver, MainPage.class);
        SignInPage SignInPage = PageFactory.initElements(driver, SignInPage.class);

        MainPage.clickSigInButton();

        SignInPage.inputRegisteredEmailValue();
        SignInPage.inputRegisteredPasswordValue();
        SignInPage.clickSignInAnAccountButton();

        Assert.assertEquals("My account - My Store", driver.getTitle());
    }

    @Test
    public void buyTshirt(){
        MainPage MainPage = PageFactory.initElements(driver, MainPage.class);
        SignInPage SignInPage = PageFactory.initElements(driver, SignInPage.class);
        MyAccountPage MyAccountPage = PageFactory.initElements(driver, pageObjects.MyAccountPage.class);
        TshirtsPage TshirtsPage = PageFactory.initElements(driver, pageObjects.TshirtsPage.class);

        MainPage.clickSigInButton();

        SignInPage.inputRegisteredEmailValue();
        SignInPage.inputRegisteredPasswordValue();
        SignInPage.clickSignInAnAccountButton();

        MyAccountPage.clickTshirtButton();

        TshirtsPage.TshirtAddToCartHoverAction();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}