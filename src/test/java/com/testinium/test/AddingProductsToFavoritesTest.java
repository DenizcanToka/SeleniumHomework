package com.testinium.test;

import com.testinium.constants.Constants;
import com.testinium.constants.ConstantsHandler;
import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static javafx.print.Paper.C;


public class AddingProductsToFavoritesTest extends BaseTest {
    ConstantsHandler constantsHandler = new ConstantsHandler();

    @Test
    public void addingProductsToFavoritesTest() {
        Methods methods = new Methods();
        methods.sendKeys(By.id("search-input"), "oyuncak");
        constantsHandler.findElement(Constants.SEARCH_BUTTON).click();
        methods.scrollWithAction(By.xpath("//img[@src=\"https://img.kitapyurdu.com/v1/getImage/fn:4856384/wi:100/wh:true\"]"));
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.PRODUCT_1).click();
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.PRODUCT_2).click();
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.PRODUCT_3).click();
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.PRODUCT_4).click();
        methods.waitBySeconds(3);
        String favoriKontrol = methods.getText(By.xpath("//h2[@class='swal2-title ky-swal-title-single']"));
        Assert.assertEquals("Ürün başarılı bir şekilde favorilerinize eklendi!", favoriKontrol);
        System.out.println("Yazı : " + favoriKontrol);
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.LOGO_1).click();
        methods.waitBySeconds(3);
    }

}

