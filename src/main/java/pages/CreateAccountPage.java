package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;
    private By firstNameField=By.name("nameFirst");
    private By lastNameField=By.name("nameLast");
    private By emailField=By.name("email");
    private By phoneField=By.name("phone");
    private By createAccountButton=By.tagName("button");
    public CreateAccountPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPhone(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }
    public TextPage clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
        return new TextPage(driver);
    }


}
