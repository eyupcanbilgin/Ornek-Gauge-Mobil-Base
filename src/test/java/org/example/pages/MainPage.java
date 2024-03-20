package org.example.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.utils.WebDriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    // Appium'un @FindBy annotasyonuyla elementleri bulun
    @FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
    private MobileElement searchBox;

    @FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_auto_complete_text")
    private MobileElement searchAutoComplete;

    @FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
    private MobileElement searchButton;

    // Constructor (Yapıcı method)
    public MainPage() {
        // AppiumFieldDecorator'u kullanarak elementleri initialize et
        PageFactory.initElements(new AppiumFieldDecorator(WebDriverFactory.getDriver()), this);
    }

    // Ana sayfa üzerindeki işlevler için metodlar
    public void search(String searchText) {
        searchBox.click();
        searchAutoComplete.sendKeys(searchText);
        searchButton.click();
    }
}
