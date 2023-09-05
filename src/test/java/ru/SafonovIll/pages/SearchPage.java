package ru.SafonovIll.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.SafonovIll.tests.TestBase;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class SearchPage extends TestBase {

    private final String
            SEARCH_URL = "/search";
    private final SelenideElement
            searchButton = $(".main-module__header__search"),
            input = $("#search"),
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
        input.setValue(value).pressEnter();

        return this;
    }

    public SearchPage resultPage() {
        result.shouldBe(Condition.visible);

        return this;
    }

}
