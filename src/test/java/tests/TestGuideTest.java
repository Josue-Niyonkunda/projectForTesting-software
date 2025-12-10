package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGuideTest extends BaseTests {
    @Test
    public void testGuidTest(){
        String check=homePage.clickTestGuide().newWebsite();
        Assert.assertEquals(check,"Halloween Special 2023 with Paul Grossman and Larry Goddard");
    }
}
