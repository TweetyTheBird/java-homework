package tests.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsqaDemo {


    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\software\\selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "https://www.toolsqa.com/automation-practice-form/";
        driver.get(baseUrl);

        WebElement acceptCookie = driver.findElement(By.id("cookie_action_close_header"));
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until((ExpectedConditions.elementToBeClickable(acceptCookie)));
        try {
            acceptCookie.click();
        } catch(org.openqa.selenium.ElementNotInteractableException e) {
            //that's fine
        }

        Select country = new Select(driver.findElement(By.id("continents")));
        //select africa by index
        country.selectByIndex(2);
        //Europe by visible text
        country.selectByVisibleText("Europe");

//        driver.close();

    }


}
