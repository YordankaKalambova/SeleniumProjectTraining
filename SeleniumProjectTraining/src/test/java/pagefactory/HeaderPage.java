package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //WebElements definition
//    private WebElement loginLink = driver.findElement(By.id("nav-link-login"));
//    private WebElement homeLink = driver.findElement(By.id("nav-link-home"));
//    private WebElement profileLink = driver.findElement(By.id("nav-link-profile"));
//    private WebElement newPostLink = driver.findElement(By.id("nav-link-new-post"));

    @FindBy(id = "nav-link-login")
    private WebElement loginLink;

    @FindBy(id = "nav-link-home")
    private WebElement homeLink;

    @FindBy(id = "nav-link-profile")
    private WebElement profileLink;

    @FindBy(id = "nav-link-new-post")
    private WebElement newPostLink;


    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickLogin() {
        loginLink.click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    public NewPostPage clickNewPost() {
        newPostLink.click();
        return new NewPostPage(driver);
    }
}

