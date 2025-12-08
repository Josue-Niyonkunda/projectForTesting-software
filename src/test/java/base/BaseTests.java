package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    protected HomePage homePage;
    private  WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver.get("https://candymapper.com/");
        System.out.println(driver.getTitle());
        homePage=new HomePage(driver);
        homePage.closeAds();
    }
    @AfterMethod
    public void closeTest(){
        driver.quit();
    }

}
