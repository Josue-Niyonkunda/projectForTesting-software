package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    String sandBoxText = "Sandbox Tools";
    private By drop = By.linkText(sandBoxText.toUpperCase());
    private By cancelButton=By.id("popup-widget183-close-icon");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickLink(String clickText){
        driver.findElement(By.linkText(clickText)).click();
    }
    public JoinUs clickJoinUs(){
        clickLink("JOIN US");
        return new JoinUs(driver);
    }
    public void closeAds(){
        driver.findElement(cancelButton).click();
    }
    public  TestGuide clickTestGuide(){
        clickLink("Test Guild Halloween Podcast Episodes");
        return new TestGuide(driver);
    }
    public void dropdown(){
        driver.findElement(By.cssSelector("#\\32")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(drop).click();
    }
}
