package com.testinium.constants;

public enum Constants {
    SEARCH_BUTTON("css",".common-sprite.button-search"),
    PRODUCT_FILTER("xpath","//div[@class='sort']/select[1]"),
    TURK_KLASIKLERI_BUTTON("xpath","//img[@title=\"Puan Kataloğundaki Türk Klasikleri\"]"),
    PUAN_KATALOGU("xpath","//a[@href=\"puan-katalogu\"]"),
    RETURNING_HOMEPAGE("xpath","//a[@href=\"https://www.kitapyurdu.com/\"]"),
    LOGO_1("xpath","//img[@src=\"https://img.kitapyurdu.com/v1/getImage/fn:11682842/wh:dec2d77ad\"]"),
    PRODUCT_1("xpath","//div[@id='product-table']/div[3]//i[@class='fa fa-heart']"),
    PRODUCT_2("xpath","//div[@id='product-table']/div[4]//i[@class='fa fa-heart']"),
    PRODUCT_3("xpath","//div[@id='product-table']/div[5]//i[@class='fa fa-heart']"),
    PRODUCT_4("xpath","//div[@id='product-table']/div[6]//i[@class='fa fa-heart']"),
    QUANTITY_TEXTBOX("css", "input[name='quantity']"),
    WISHLIST_BUTTON("css", "div.cart-info td.to-wishlist>a");



    private String key, value;
    Constants(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
