package ru.SafonovIll.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.SafonovIll.pages.ContactsPage;
import ru.SafonovIll.pages.MainPage;
import static io.qameta.allure.Allure.step;

@Story("Проверка работы сайта Аэрофлот")
@Owner("SafonovIll")
@Feature("UI тесты на проверку содержания разделов сайта Аэрофлот")
@DisplayName("Проверка страницы контактов")
@Tag("contacts_page_test")

public class ContactsPageTest extends TestBase {
    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();

    @Test
    @DisplayName("В выбранном городе есть офис")
    void checkOfficeLocationTest() {
        step("Открыть главную страницу", () ->
                mainPage.openMain());
        step("Пролистать страницу до контаков", () ->
                contactsPage.scrollToContacts());
        step("Кликнуть на кнопку 'Контакты'", () ->
                contactsPage.clickToContacts());
        step("Проверка URL страницы контактов", () ->
                contactsPage.checkUrlContacts());
        step("Переход на страницу Офисов", () ->
                contactsPage.clickToIconOffices());
        step("Проверка URL страницы Офисов", () ->
                contactsPage.checkUrlOffices());
        step("Нажать кнопку поиска офисов в Москве", () ->
                contactsPage.clickToButtonCross());
        step("Проверка наличия офисов", () ->
                contactsPage.checkOfficeInSelectTown());
        step("Нажать кнопку назад", () ->
                contactsPage.clickButtonToBack());
        step("Нажать на кнопку выбора города", () ->
                contactsPage.valueAnotherCity());
        step("Выбрать Санкт-Петербург", () ->
                contactsPage.chooseStPetersBurg());
        step("Нажать кнопку поиска офисов в Санкт-Петербурге", () ->
                contactsPage.clickToButtonCross());
        step("Проверка наличия офисов", () ->
                contactsPage.checkOfficeInSelectTown());
        step("Нажать кнопку назад", () ->
                contactsPage.clickButtonToBack());
        step("Нажать на кнопку выбора города", () ->
                contactsPage.valueAnotherCity());
        step("Выбрать Абакан", () ->
                contactsPage.chooseAbakan());
        step("Нажать кнопку поиска офисов в Абакане", () ->
                contactsPage.clickToButtonCross());
        step("Проверка наличия офисов", () ->
                contactsPage.checkOfficeInSelectTown());

    }

}
