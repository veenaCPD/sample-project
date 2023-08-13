package July;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gMail {
    static WebDriver driver;
    public static void main(String[] args) {
        // initializing driver variable using FirefoxDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Java_Practice\\Java_Practice\\Windows\\chromedriver.exe");
                driver=new ChromeDriver();
        // launching gmail.com on the browser
                driver.get("https://gmail.com");
        // maximized the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // saving the GUI element reference into a "element" variable of WebElement type
        WebElement element = driver.findElement(By.id("identifierId"));
// entering username
        element.sendKeys("veena.katiyar@gmail.com");
        element.sendKeys(Keys.RETURN);
// entering password
        driver.findElement(By.id("Passwd")).sendKeys("Ravindra@128");
// clicking signin button
        driver.findElement(By.id("signIn")).click();
// explicit wait - to wait for the compose button to be click-able
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
// click on the compose button as soon as the "compose" button is visible
        driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
    }
}
