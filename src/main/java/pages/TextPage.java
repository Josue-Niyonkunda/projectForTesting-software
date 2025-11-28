package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextPage {
    private WebDriver driver;
    private By text =By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/div/div[2]/p");
    public TextPage(WebDriver driver){
        this.driver=driver;
    }
    public String getText1(){
        return driver.findElement(text).getText();
    }
}
