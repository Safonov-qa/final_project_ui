package ru.safonovill.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BuyTicketPage {
    private final String DEPARTURE_CITY = "Москва";
    private final String DATE_FROM = "10.11.2023";
    private final String DATE_TO = "30.11.2023";
    private final SelenideElement
            ticketMenu = $("#adaptive-tabs_0"),
            fromFly = $("#ticket-city-departure-0-booking"),
            toFly = $("#ticket-city-arrival-0-booking"),
            dateFrom = $("#ticket-date-from-booking"),
            dateTo = $("#ticket-date-to-booking"),
            numberOfPassengersButton = $("#ticket-class-service-booking"),//.select_classsearch-form-1
            addPassenger = $("[aria-label='Добавить пассажира']"),
            closeButton = $(".main-module__button.main-module__button--wide.main-module__js-dropdown-close"),
            searchButton = $(".main-module__button.main-module__button--wide.main-module__button--lg.ignore-disabled-click"),
            resultSearch = $(".frame.flight-searchs.js-tariff-helper.h-pb--0");

    public BuyTicketPage checkMenuByToTicket() {
        ticketMenu.shouldBe(visible);

        return this;
    }

    public BuyTicketPage checkSearchTicket(String to) {
        fromFly.doubleClick().setValue(DEPARTURE_CITY);
        toFly.doubleClick().setValue(to);
        dateFrom.doubleClick().setValue(DATE_FROM);
        dateTo.doubleClick().setValue(DATE_TO);
        numberOfPassengersButton.doubleClick();
        addPassenger.click();
        closeButton.click();
        searchButton.click();
        resultSearch.shouldBe(visible);

        return this;
    }

}
