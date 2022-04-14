import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        //Finds Login link which you can use to interact with on a later stage
        WebElement loginElement = driver.findElement(By.xpath("//a[text()='Login']"));
        loginElement.click();
        WebElement userName = driver.findElement(By.id("defaultLoginFormUsername"));
        userName.sendKeys("Username1645732167");
        WebElement pass = driver.findElement(By.id("defaultLoginFormPassword"));
        pass.sendKeys("Test1234");
        WebElement signIn = driver.findElement(By.id("sign-in-button"));
        signIn.click();

//Finds Home link which you can use to interact with on a later stage
        WebElement homeElement = driver.findElement(By.xpath("//a[text()='Home']"));
        List<WebElement> posts = driver.findElements(By.xpath("//*[@class='post-feed-img']"));
        System.out.println(posts.size());
        Assert.assertEquals(posts.size(), 3);
    }
}
