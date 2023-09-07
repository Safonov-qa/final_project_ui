package ru.safonovill.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.safonovill.tests.TestBase;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class ContactsPage extends TestBase {
    private final String
            CONTACTS_URL = "/about/contact",
            OFFICES_URL = "/offices";
    private final SelenideElement
            contacts = $(".main-module__footer__link.main-module__footer__submenu-item-link"),
            iconContacts = $("[href='https://www.aeroflot.ru/ru-ru/about/contact']"),
            iconOffices = $("[src='/media/page_icons/offices_OYSZY73.svg']"),
            buttonCross = $(".main-module__button.main-module__button--wide.main-module__button--lg"),
            selectTown = $("[itemprop='streetAddress']"),
            buttonToBack = $(".main-module__text.main-module__h-mb--24.main-module__h-display--inline-block"),
            anotherCity = $(".main-module__input__text", 1),
            stPetersBurg = $(byXpath("//*[text()='Санкт-Петербург']")),
            abakan = $(byXpath("//*[text()='Абакан']"));


    public ContactsPage scrollToContacts() {
        contacts.scrollTo();

        return this;
    }

    public ContactsPage clickToContacts() {
        iconContacts.click();

        return this;
    }

    public ContactsPage checkUrlContacts() {
        webdriver().shouldHave(currentFrameUrl(baseUrl + CONTACTS_URL));

        return this;
    }

    public ContactsPage clickToIconOffices() {
        iconOffices.click();

        return this;
    }

    public ContactsPage checkUrlOffices() {
        webdriver().shouldHave(currentFrameUrl(baseUrl + OFFICES_URL));

        return this;
    }

    public ContactsPage clickToButtonCross() {
        buttonCross.click();

        return this;
    }

    public ContactsPage checkOfficeInSelectTown() {
        selectTown.shouldBe(Condition.visible);

        return this;
    }

    public ContactsPage clickButtonToBack() {
        buttonToBack.click();

        return this;
    }

    public ContactsPage valueAnotherCity() {
        anotherCity.click();

        return this;
    }

    public ContactsPage chooseStPetersBurg() {
        stPetersBurg.click();

        return this;
    }


    public ContactsPage chooseAbakan() {
        abakan.click();

        return this;
    }
}
