package com.testinium.test;

import com.testinium.driver.BaseTest;
import org.junit.Test;

public class Main_KitapKurdu extends BaseTest {

    @Test
    public void runTests1() {
        AddingProductsToFavoritesTest test1 = new AddingProductsToFavoritesTest();
        test1.addingProductsToFavoritesTest();
    }
    @Test
    public void runTests2() {
        CatalogSelectionTest test2 = new CatalogSelectionTest();
        test2.catalogSelectionTest();
    }

    @Test
    public void runTests3(){
        AddingRandomProductToCartTest test3 = new AddingRandomProductToCartTest();
        test3.addingRandomProductToCartTest();
    }

    @Test
    public void runTests4() {

        RemovingProductFromFavoritesTest test4 = new RemovingProductFromFavoritesTest();
        test4.removingProductFromFavoritesTest();
    }
    @Test
    public void runTests5() {
        IncreasingTheProductQuantityTest test5 = new IncreasingTheProductQuantityTest();
        test5.increasingTheProductQuantityTest();
    }
    @Test
    public void runTests6() {

        FailedPurchaseTest test6 = new FailedPurchaseTest();
        test6.failedPurchaseTest();
    }

    /*

    @Test
    public void runTestsAll() {
        AddingProductsToFavoritesTest test1 = new AddingProductsToFavoritesTest();
        test1.addingProductsToFavoritesTest();

        CatalogSelectionTest test2 = new CatalogSelectionTest();
        test2.catalogSelectionTest();

        AddingRandomProductToCartTest test3 = new AddingRandomProductToCartTest();
        test3.addingRandomProductToCartTest();

        RemovingProductFromFavoritesTest test4 = new RemovingProductFromFavoritesTest();
        test4.removingProductFromFavoritesTest();

        IncreasingTheProductQuantityTest test5 = new IncreasingTheProductQuantityTest();
        test5.increasingTheProductQuantityTest();

        FailedPurchaseTest test6 = new FailedPurchaseTest();
        test6.failedPurchaseTest();
    }

     */

}

