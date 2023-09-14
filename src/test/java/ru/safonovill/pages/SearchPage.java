package ru.safonovill.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class SearchPage {
    private final String
            SEARCH_URL = "ru-ru/search";
    private final SelenideElement
            searchButton = $("[title='Поиск по сайту']"),
            inputButton = $("#search"),
            result = $("#ya-site-results");

    public SearchPage buttonSearch() {
        searchButton.click();

        return this;
    }

    public SearchPage checkUrlSearchPage() {
        webdriver().shouldHave(currentFrameUrl(baseUrl + SEARCH_URL));

        return this;
    }

    public SearchPage sectionInput(String value) {
        inputButton.setValue(value).pressEnter();

        return this;
    }

    public SearchPage resultPage() {
        result.shouldBe(Condition.visible);

        return this;
    }
}
