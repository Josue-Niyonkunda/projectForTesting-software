package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JoinUs {
    private WebDriver driver;
    private By createAccountLink=By.linkText("Create account.");
    public JoinUs(WebDriver driver){
        this.driver=driver;
    }
   public CreateAccountPage clickCreateAccountLink(){
     driver.findElement(createAccountLink).click();
      return new CreateAccountPage(driver);
   }
}
