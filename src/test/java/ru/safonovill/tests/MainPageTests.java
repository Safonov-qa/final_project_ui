package ru.safonovill.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import ru.safonovill.pages.MainPage;

import static io.qameta.allure.Allure.step;

@Story("Проверка работы сайта Аэрофлот")
@Owner("SafonovIll")
@Feature("UI тесты на проверку содержания разделов сайта Аэрофлот")
@DisplayName("Проверка главной страницы")
@Tag("main_page_test")

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openMainPage() {
        step("Открыть главную страницу", () ->
                mainPage.openMain());
    }

    @Test
    @DisplayName("Проверка содержания главной страницы")
    void mainPageContentTest() {
        step("Отображение логотипа компании", () ->
                mainPage.checkLogoCompany());
        step("Отображение хедеров", () ->
                mainPage.checkHeaders());
        step("Отобржение основного модуля", () ->
                mainPage.checkMainModule());
        step("Отображение блока дополнительных сервисов", () ->
                mainPage.checkBlockOfService());
        step("Отображение специальные предложения", () ->
                mainPage.checkSpecialOffer());
        step("Отображение Дополнительные услуги", () ->
                mainPage.checkAdditionalServices());
        step("Отображение блока 'Компания Аэрофлот'", () ->
                mainPage.checkBlockCompany());
        step("Новости", () ->
                mainPage.checkNews());
        step("Эксклюзив", () ->
                mainPage.checkExclusive());
        step("Нижнее меню", () ->
                mainPage.checkDownMenu());

    }

    @Test
    @DisplayName("Проверка всплвающих окон в хедере")
    void checkHeader() {
        step("Отображение сервисы и услуги", () ->
                mainPage.checkService());
        step("Отображение спецпредложений", () ->
                mainPage.checkWindowSpecialOffer());
        step("Аэрофлот бонус", () ->
                mainPage.checkAeroFlotBonus());
        step("Информация", () ->
                mainPage.checkInformation());
        step("Для бизнеса", () ->
                mainPage.checkForBusiness());

    }

}

