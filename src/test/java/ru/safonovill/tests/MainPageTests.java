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
@DisplayName("Главная страница")
@Tag("main_page_test")
public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openMainPage() {
        step("Открыть главную страницу", () ->
                mainPage.openMain());
        step("Закрыть всплывающее окно", () ->
        mainPage.closeWindow());
    }

    @Test
    @DisplayName("Содержание главной страницы")
    void mainPageContentTest() {
        step("Проверка отображения логотипа компании", () ->
                mainPage.checkLogoCompany());
        step("Проверка отображения хедеров", () ->
                mainPage.checkHeaders());
        step("Проверка отображения основного модуля", () ->
                mainPage.checkMainModule());
        step("Проверка отображения блока дополнительных сервисов", () ->
                mainPage.checkBlockOfService());
        step("Проверка отображения специальные предложения", () ->
                mainPage.checkSpecialOffer());
        step("Проверка отображения Дополнительные услуги", () ->
                mainPage.checkAdditionalServices());
        step("Проверка отображения блока 'Компания Аэрофлот'", () ->
                mainPage.checkBlockCompany());
        step("Проверка отображения Новости", () ->
                mainPage.checkNews());
        step("Проверка отображения Эксклюзив", () ->
                mainPage.checkExclusive());
        step("Проверка отображения Нижнее меню", () ->
                mainPage.checkDownMenu());
    }

    @Test
    @DisplayName("Всплвающие окна в хедере")
    void checkHeader() {
        step("Проверка отображения сервисы и услуги", () ->
                mainPage.checkService());
        step("Проверка отображения спецпредложений", () ->
                mainPage.checkWindowSpecialOffer());
        step("Проверка отображения Аэрофлот бонус", () ->
                mainPage.checkAeroFlotBonus());
        step("Проверка отображения Информация", () ->
                mainPage.checkInformation());
        step("Проверка отображения Для бизнеса", () ->
                mainPage.checkForBusiness());
    }
}

