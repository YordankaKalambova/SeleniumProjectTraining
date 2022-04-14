import configurations.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected String username;
    protected String password;
    protected String url;
    protected WebDriver driver;
    @BeforeClass
    void setup(){

       // WebDriverManager.getInstance(BrowserType.CHROME).setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.get("http://training.skillo-bg.com:4300/posts/all");
     // driver.set(new Driver(BrowserType.CHROME));

    }
}
