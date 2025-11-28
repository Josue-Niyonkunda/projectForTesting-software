package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinUsTest extends BaseTests {
    @Test
    public void testJoinUsButton(){
        var send=homePage.clickJoinUs().clickCreateAccountLink();
        send.enterFirstName("niyou");
        send.enterLastName("jay");
        send.enterPhone("0786700900");
        send.enterEmail("josueniyonkunda55@gmail.com");
        send.clickCreateAccountButton();
        Assert.assertEquals(send.clickCreateAccountButton().getText1(),"You're almost there! We sent an email to josueniyonkunda55@gmail.com with a link to activate your account. Please check your email and click the activation link.");


    }
}
