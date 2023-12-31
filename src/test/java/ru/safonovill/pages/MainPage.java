package ru.safonovill.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement
            logoCompany = $(".main-module__img.main-module__header__logo"),
            headers = $("#site-navigation"),
            mainModule = $(".main-module__wrapper"),
            blockOfService = $("[role='main']"),
            specialOfferButton = $(".main-module__special-offer.main-module__order-1--below-tablet"),
            additionalService = $("[data-slick='[object Object]']"),
            blockCompany = $(".main-module__frame__container"),
            newsButton = $(".main-module__row.main-module__order-1--below-tablet"),
            exclusiveButton = $("[href='https://open.zvuk.com/cLQ0/1o084ott']"),
            downMenu = $(".main-module__row.main-module__footer__top"),
            servicesButton = $("[content='Сервисы и услуги']"),
            contentByToTicket = $("[content='Купить билет']"),
            hoverSpecialOffer = $("[content='Спецпредложения']"),
            bestSaleButton = $("[content='Лучшие тарифы и акции']"),
            aeroFlotBonus = $("[content='Аэрофлот Бонус']"),
            joinInProgram = $("[content='Вступить в программу']"),
            informationButton = $("[content='Информация']"),
            readyToTravel = $("[content='Подготовка к путешествию']"),
            forBusinessButton = $("[content='Для Бизнеса']"),
            corporateClients = $("[content='Корпоративным клиентам']"),
            windowClose = $(".button.button--wide.js-notification-close");

    public MainPage openMain() {
        open(baseUrl);

        return this;
    }

    public MainPage closeWindow() {
        windowClose.click();

        return this;
    }

    public MainPage checkLogoCompany() {
        logoCompany.shouldBe(visible);

        return this;
    }

    public MainPage checkHeaders() {
        headers.shouldBe(visible);

        return this;
    }

    public MainPage checkMainModule() {
        mainModule.shouldBe(visible);

        return this;
    }

    public MainPage checkBlockOfService() {
        blockOfService.scrollTo();
        blockOfService.shouldBe(visible);

        return this;
    }

    public MainPage checkSpecialOffer() {
        specialOfferButton.scrollTo();
        specialOfferButton.shouldBe(visible);

        return this;
    }

    public MainPage checkAdditionalServices() {
        additionalService.scrollTo();
        additionalService.shouldBe(visible);

        return this;
    }

    public MainPage checkBlockCompany() {
        blockCompany.scrollTo();
        blockCompany.shouldBe(visible);

        return this;
    }

    public MainPage checkNews() {
        newsButton.scrollTo();
        newsButton.shouldBe(visible);

        return this;
    }

    public MainPage checkExclusive() {
        exclusiveButton.scrollTo();
        exclusiveButton.shouldBe(visible);
        return this;
    }

    public MainPage checkDownMenu() {
        downMenu.scrollTo();
        downMenu.shouldBe(visible);

        return this;
    }

    public MainPage checkService() {
        servicesButton.hover();
        contentByToTicket.shouldBe(visible);

        return this;
    }

    public MainPage checkWindowSpecialOffer() {
        hoverSpecialOffer.hover();
        bestSaleButton.shouldBe(visible);

        return this;
    }

    public MainPage checkAeroFlotBonus() {
        aeroFlotBonus.hover();
        joinInProgram.shouldBe(visible);

        return this;
    }

    public MainPage checkInformation() {
        informationButton.hover();
        readyToTravel.shouldBe(visible);

        return this;
    }

    public MainPage checkForBusiness() {
        forBusinessButton.hover();
        corporateClients.shouldBe(visible);

        return this;
    }
}
