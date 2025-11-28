package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By cancelButton=By.id("popup-widget183-close-icon");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickLink(String clickText){
        driver.findElement(By.linkText(clickText)).click();
    }
    public void clickHomeLink(){
        clickLink("Home");
    }
    public void closeAds(){
        driver.findElement(cancelButton).click();
    }

    public  TestGuide clickTestGuide(){
        clickLink("Test Guild Halloween Podcast Episodes");
        return new TestGuide(driver);
    }
}
