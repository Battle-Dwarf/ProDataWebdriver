import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProDataWebriver {

    @Test
    public void testScenario(){

        System.setProperty("webdriver.gecko.driver", "F:\\Dwarf\\Projects\\geckodriver-v0.20.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.pl");

        driver.quit();



    }



}