package org.example.steps;

import com.thoughtworks.gauge.Step;
import org.example.pages.MainPage;

public class MainPageSteps {

    private MainPage anasayfa;

    // Constructor (Yapıcı method)
    public MainPageSteps() {
        anasayfa = new MainPage();
    }

    // Gauge BDD adımları
    @Step("Ana sayfada <searchText> aramasını yap")
    public void searchOnHomePage(String searchText) {
        anasayfa.search(searchText);
    }
}
