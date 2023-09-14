package ru.safonovill.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BuyTicketPage {
    private final String DEPARTURE_CITY = "Москва";
    private final String DATE_FROM = "10.11.2023";
    private final String DATE_TO = "10.12.2023";
    private final SelenideElement
            ticketMenuButton = $("#adaptive-tabs_0"),
            fromFlyWindow = $("#ticket-city-departure-0-booking"),
            toFlyWindow = $("#ticket-city-arrival-0-booking"),
            dateFromWindow = $("#ticket-date-from-booking"),
            dateToWindow = $("#ticket-date-to-booking"),
            numberOfPassengersButton = $("#ticket-class-service-booking"),
            addPassengerButton = $("[aria-label='Добавить пассажира']"),
            closeButton = $(".main-module__button.main-module__button--wide.main-module__js-dropdown-close"),
            searchButton = $(".main-module__button.main-module__button--wide.main-module__button--lg.ignore-disabled-click"),
            resultSearchWindow = $(".frame.flight-searchs.js-tariff-helper.h-pb--0");

    public BuyTicketPage checkMenuByToTicket() {
        ticketMenuButton.shouldBe(visible);

        return this;
    }

    public BuyTicketPage checkSearchTicket(String to) {
        fromFlyWindow.doubleClick().setValue(DEPARTURE_CITY);
        toFlyWindow.doubleClick().setValue(to);
        dateFromWindow.doubleClick().setValue(DATE_FROM);
        dateToWindow.doubleClick().setValue(DATE_TO).pressEnter();
        numberOfPassengersButton.click();
        addPassengerButton.click();
        closeButton.click();
        searchButton.click();
        resultSearchWindow.shouldBe(visible);

        return this;
    }
}
