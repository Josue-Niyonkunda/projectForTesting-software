package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class TextPage {
    private WebDriver driver;
    private By text =By.cssSelector("#bs-6 > span > div > div > div > div > div:nth-child(3) > p");
    public TextPage(WebDriver driver){
        this.driver=driver;
    }
    public String getText1()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(text).getText();
    }
}
