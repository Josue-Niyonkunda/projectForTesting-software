package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JoinUsTest extends BaseTests {
    @Test
    public void testJoinUsButton(){
        var send=homePage.clickJoinUs().clickCreateAccountLink();
       send.enterUserDetails("John", "Doe", "john@example.com", "1234567890");
        send.clickCreateAccountButton();
        Assert.assertEquals(send.clickCreateAccountButton().getText1(),"You're almost there! We sent an email to john@example.com with a link to activate your account. Please check your email and click the activation link.");


    }
}
