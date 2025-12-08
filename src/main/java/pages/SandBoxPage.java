package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SandBoxPage {
    private WebDriver driver;
    private By drop=By.xpath("//*[@id=\"2\"]");

    public SandBoxPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickSandBox(){
        Select drodoen= new Select(driver.findElement(drop));
        drodoen.selectByVisibleText("PACKT PUBLISHING");
    }


}
