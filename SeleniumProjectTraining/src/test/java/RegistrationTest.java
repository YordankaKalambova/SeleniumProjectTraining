import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class RegistrationTest extends BaseTest{

    @Test
    public void register() {
        //Finds Login link which you can use to interact with on a later stage
        WebElement loginElement = driver.findElement(By.id("nav-link-login"));
        loginElement.click();
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        WebElement userName = driver.findElement(By.name("username"));
        long timestamp = Instant.now().getEpochSecond();
        userName.sendKeys("Username" + timestamp);
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='email']"));
        email.sendKeys(timestamp + "@test.net");
        WebElement birthDate = driver.findElement(By.cssSelector("input[placeholder='Birth date']"));
        //Вписва дата в полето
//        To be checked date format
        birthDate.sendKeys("02/02/1980");
//Намира полето за Password
        WebElement password = driver.findElement(By.name("password"));
        //Вписва username в полето
        password.sendKeys("Test1234");

        //Намира полето за Confirm Password
        WebElement confirmPassword = driver.findElement(By.name("verify-password"));
        //Вписва username в полето
        confirmPassword.sendKeys("Test1234");

        //Намира полето за Public Info
        WebElement publicInfo = driver.findElement(By.name("pulic-info"));
        //Вписва username в полето
        publicInfo.sendKeys("test");

        WebElement signIn = driver.findElement(By.id("sign-in-button"));
        signIn.click();

    }
}
