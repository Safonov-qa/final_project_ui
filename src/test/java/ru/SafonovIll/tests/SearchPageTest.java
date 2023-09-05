package ru.SafonovIll.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.SafonovIll.pages.MainPage;
import ru.SafonovIll.pages.SearchPage;
import static io.qameta.allure.Allure.step;

@Story("Проверка работы сайта Аэрофлот")
@Owner("SafonovIll")
@Feature("UI тесты на проверку содержания разделов сайта Аэрофлот")
@DisplayName("Проверка страницы поиска")
@Tag("search_page_test")

public class SearchPageTest {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();


    @DisplayName("Результат поиска содержит текст поискового запроса")
    @ValueSource(strings = {"Багаж", "Аэропорт", "Цены"})
    @ParameterizedTest(name = "По запросу {0} в поисковой строке есть результат")
    void checkSearchResultsTest(String value) {
        step("Открыть главную страницу", () ->
                mainPage.openMain());
        step("Нажать на кнопку поиска", () ->
                searchPage.buttonSearch());
        step("Проверить отображение страницы поиска", () ->
                searchPage.checkUrlSearchPage());
        step("Ввести данные", () ->
                searchPage.sectionInput(value));
        step("Проверить результат поиска", () ->
                searchPage.resultPage());

    }

}
