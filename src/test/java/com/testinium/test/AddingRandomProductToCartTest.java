package com.testinium.test;

import com.testinium.constants.Constants;
import com.testinium.constants.ConstantsHandler;
import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;

public class AddingRandomProductToCartTest extends BaseTest {
    ConstantsHandler constantsHandler = new ConstantsHandler();

    public void addingRandomProductToCartTest (){
        Methods methods = new Methods();
        methods.click(By.xpath("//span[.='Tüm Kitaplar']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySeconds(3);
        methods.selectRandomProduct();
        methods.waitBySeconds(3);
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(3);
    }
}
