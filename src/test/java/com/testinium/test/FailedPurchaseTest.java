package com.testinium.test;

import com.testinium.constants.Constants;
import com.testinium.constants.ConstantsHandler;
import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FailedPurchaseTest extends BaseTest {
    ConstantsHandler constantsHandler = new ConstantsHandler();

    @Test
    public void failedPurchaseTest() {
        Methods methods = new Methods();
        methods.click(By.id("cart"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(3);
        constantsHandler.findElement(Constants.WISHLIST_BUTTON).click();
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[.='Yeni bir adres kullanmak istiyorum.']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-firstname-companyname"),"Denizcan");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-lastname-title"),"Toka");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("address-zone-id"),"Balıkesir");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("address-county-id"),"AYVALIK");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-address-text"),"Deniz APT");
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath(" //input[@id='address-mobile-telephone']"),"5319746464");
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit-card-owner"),"Denizcan Toka");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_1"),"1234");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_2"),"4321");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_3"),"5678");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit_card_number_4"),"8765");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("credit-card-expire-date-month"),"11");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("credit-card-expire-date-year"),"2035");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("credit-card-security-code"),"345");
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        String gecersizKart = methods.getText(By.xpath("//span[@class='error']"));
        Assert.assertEquals("Kart numarası geçersiz. Kontrol ediniz!", gecersizKart);
        System.out.println("Yazı : " + gecersizKart);
        methods.waitBySeconds(5);
        constantsHandler.findElement(Constants.RETURNING_HOMEPAGE).click();
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//a[.='Merhaba Denizcan Toka']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[.='Çıkış']"));
        methods.waitBySeconds(5);

    }
}
