package ru.safonovill.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.safonovill.pages.MainPage;
import ru.safonovill.pages.SearchPage;
import static io.qameta.allure.Allure.step;

@Story("Проверка работы сайта Аэрофлот")
@Owner("SafonovIll")
@Feature("UI тесты на проверку содержания разделов сайта Аэрофлот")
@DisplayName("Страница поиска")
@Tag("search_page_test")
public class SearchPageTest extends TestBase{
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @DisplayName("Результат поиска содержит текст поискового запроса")
    @ValueSource(strings = {"Багаж", "Аэропорт", "Цены"})
    @ParameterizedTest(name = "По запросу {0} в поисковой строке есть результат")
    void checkSearchResultsTest(String value) {
        step("Открыть главную страницу", () ->
                mainPage.openMain());
        step("Закрыть всплывающее окно", () ->
                mainPage.closeWindow());
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
