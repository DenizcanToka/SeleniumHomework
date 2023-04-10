package com.testinium.test;

import com.testinium.constants.Constants;
import com.testinium.constants.ConstantsHandler;
import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;

public class CatalogSelectionTest extends BaseTest {
    ConstantsHandler constantsHandler = new ConstantsHandler();


    @Test
    public void catalogSelectionTest(){
        Methods methods =  new Methods();
        constantsHandler.findElement(Constants.PUAN_KATALOGU).click();
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("point-carousel-tab-title-952"));
        methods.waitBySeconds(5);
        constantsHandler.findElement(Constants.TURK_KLASIKLERI_BUTTON).click();
        methods.waitBySeconds(5);
        constantsHandler.findElement(Constants.PRODUCT_FILTER).click();
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//select[@onchange=\"location = this.value;\"]"),"Yüksek Oylama" );
        methods.waitBySeconds(3);
    }


}

