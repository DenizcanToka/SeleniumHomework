package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;

public class RemovingProductFromFavoritesTest extends BaseTest {

    @Test
    public void removingProductFromFavoritesTest (){
        Methods methods = new Methods();
        methods.click(By.xpath("//a[.='Listelerim']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[.='Favorilerim']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[.='Son Oyuncak Mağarası']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[.='Favorilerden Çıkar']"));
        methods.waitBySeconds(3);
    }
}
