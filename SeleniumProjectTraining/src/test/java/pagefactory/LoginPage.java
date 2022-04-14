package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //WebElements definition
//    private WebElement registerLink = driver.findElement(By.linkText("Register"));
//    private WebElement userNameField = driver.findElement(By.name("username"));
//    private WebElement passwordField = driver.findElement(By.name("password"));
//    private WebElement signInBtn = driver.findElement(By.id("sign-in-button"));
//    private WebElement rememberMe = driver.findElement(By.cssSelector("input[formcontrolname='rememberMe']"));

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(id = "defaultLoginFormUsername")
    private WebElement userNameField;

    @FindBy(id = "defaultLoginFormPassword")
    private WebElement passwordField;

    @FindBy(id = "sign-in-button")
    private WebElement signInBtn;

    @FindBy(linkText = "Remember Me")
    private WebElement rememberMe;

    @FindBy(xpath = "//div[contains(text(),'Wrong username or password!')]")
    private WebElement unsuccessfulLoginMsg;



    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

    public void fillUserName(String userName){
        wait.until(ExpectedConditions.elementToBeClickable(userNameField));
        userNameField.sendKeys(userName);
    }

    public void fillPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
    }

    public void clickLoginBtn(){
        signInBtn.click();
    }

    public RegistrationPage clickRegister(){
        registerLink.click();
        RegistrationPage regPage = new RegistrationPage(driver);
        return regPage;
    }

    public void rememberMe(){
        rememberMe.click();
    }

    public WebElement getUnseccessfulLoginMsg() {
        wait.until(ExpectedConditions.visibilityOf(unsuccessfulLoginMsg));
        return unsuccessfulLoginMsg;
    }


}

