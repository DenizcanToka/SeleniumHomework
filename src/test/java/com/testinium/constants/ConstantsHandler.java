package com.testinium.constants;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConstantsHandler{

    Methods methods = new Methods();
    private WebDriver driver = methods.driver;

    public WebElement findElement(Constants constant) {
        WebDriverWait wait = new WebDriverWait(driver, 20, 100L);

        if("xpath".equals(constant.getKey())){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constant.getValue())));
            WebElement element = methods.findElement(By.xpath(constant.getValue()));
            Assert.assertNotNull(element);
            return element;
        }else if("css".equals(constant.getKey())){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(constant.getValue())));
            WebElement element = methods.findElement(By.cssSelector(constant.getValue()));
            Assert.assertNotNull(element);
            return element;
        }else{
            try {
                throw new Exception("The key is wrong !");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return null;
        }
    }
}
