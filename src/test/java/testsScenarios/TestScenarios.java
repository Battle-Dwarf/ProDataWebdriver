package testsScenarios;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

public class TestScenarios {

    private WebDriver driver;

    @Before
    public void SetUp() {

        System.setProperty("webdriver.gecko.driver", "/Users/Dwarf/Downloads/geckodriver");

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

        MainPage MainPage = new MainPage(driver);
        SignInPage SignInPage = new SignInPage(driver);
        CreateAnAccountPage CreateAnAccountPage = new CreateAnAccountPage(driver);

        MainPage.clickSigInButton();

        SignInPage.inputEmailValue()
                .clickCreateAnAccountButton();

        CreateAnAccountPage.inputCustomerFirstNameValue()
                .inputCustomerLastNameValue()
                .inputCustomerPasswordValue()
                .inputCustomerAddressValue()
                .inputCustomerCityValue()
                .inputCustomerPostcodeValue()
                .selectCustomerIdStateValue()
                .inputCustomerPhoneMobileValue()
                .clickSubmitAnAccountButton();

        Assert.assertEquals("My account - My Store", driver.getTitle());
    }

    @Test
    public void loginAlreadyRegisteredUser(){
        MainPage MainPage = new MainPage(driver);
        SignInPage SignInPage = new SignInPage(driver);

        MainPage.clickSigInButton();

        SignInPage.inputRegisteredEmailValue()
            .inputRegisteredPasswordValue()
            .clickSignInAnAccountButton();

        Assert.assertEquals("My account - My Store", driver.getTitle());
    }

    @Test
    public void buyTshirt(){
        MainPage MainPage = new MainPage(driver);
        SignInPage SignInPage = new SignInPage(driver);
        MyAccountPage MyAccountPage = new MyAccountPage(driver);
        TshirtsPage TshirtsPage = new TshirtsPage(driver);
        OrderPage OrderPage = new OrderPage(driver);

        MainPage.clickSigInButton();

        SignInPage.inputRegisteredEmailValue()
            .inputRegisteredPasswordValue()
            .clickSignInAnAccountButton();

        MyAccountPage.clickTshirtButton();

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", "");

        TshirtsPage.TshirtAddToCartHoverAction();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement proceedToCheckoutButton = wait.until(ExpectedConditions.elementToBeClickable(TshirtsPage.getproceedToCheckoutButton()));
        TshirtsPage.clickProceedToCheckoutButton();

        OrderPage.clickProceedToCheckout1Button()
            .clickProceedToCheckout2Button()
            .clickTermsOfServiceCheckBox()
            .clickProceedToCheckout3Button()
            .clickpayByWireButton()
            .clickIConfirmMyOrderButton();

        Assert.assertEquals("Order confirmation - My Store", driver.getTitle());
    }
}