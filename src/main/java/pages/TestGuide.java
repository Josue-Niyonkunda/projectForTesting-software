package pages;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class TestGuide {
    private WebDriver driver;
    public TestGuide(WebDriver driver) {
        this.driver=driver;
    }
       public String newWebsite(){
        driver.get("https://testguild.com/podcast/automation/a472-paul/");
           return driver.getTitle();
       }

}
