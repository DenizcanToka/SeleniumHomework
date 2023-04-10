package com.testinium.test;

import com.testinium.constants.Constants;
import com.testinium.constants.ConstantsHandler;
import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;

public class IncreasingTheProductQuantityTest extends BaseTest {
    ConstantsHandler constantsHandler = new ConstantsHandler();
    @Test
    public void increasingTheProductQuantityTest(){
        Methods methods = new Methods();
        methods.click(By.id("cart"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.QUANTITY_TEXTBOX).clear();
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.QUANTITY_TEXTBOX).sendKeys("2");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//i[@onclick=\"cartProductUpdate($(this).parent())\"]"));
        methods.waitBySeconds(3);
    }
}
