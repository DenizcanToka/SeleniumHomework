package com.testinium.pages;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;


public class HomePage extends BaseTest {
    Methods methods;
    public HomePage(){methods =new Methods();}
    public  void home(){
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));
    }



}
