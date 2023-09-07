package ru.safonovill.pages;

import ru.safonovill.tests.TestBase;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement

            logoCompany = $(".main-module__header__logo-wrapper"),
            headers = $("#site-navigation"),
            mainModule = $(".main-module__wrapper"),
            blockOfService = $("[role='main']"),
            specialOffer = $(".main-module__special-offer.main-module__order-1--below-tablet"),
            additionalService = $("[data-slick='[object Object]']"),
            blockCompany = $(".main-module__frame__container"),
            news = $(".main-module__row.main-module__order-1--below-tablet"),
            exclusive = $("[href='https://open.zvuk.com/cLQ0/1o084ott']"),
            downMenu = $(".main-module__row.main-module__footer__top"),
            services = $("[content='Сервисы и услуги']"),
            contentByToTicket = $("[content='Купить билет']"),
            hoverSpecialOffer = $("[content='Спецпредложения']"),
            bestSale = $("[content='Лучшие тарифы и акции']"),
            aeroFlotBonus = $("[content='Аэрофлот Бонус']"),
            joinInProgram = $("[content='Вступить в программу']"),
            information = $("[content='Информация']"),
            readyToTravel = $("[content='Подготовка к путешествию']"),
            forBusiness = $("[content='Для Бизнеса']"),
            corporateClients = $("[content='Корпоративным клиентам']");


    public MainPage openMain() {
        open(baseUrl);

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
        specialOffer.scrollTo();
        specialOffer.shouldBe(visible);

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
        news.scrollTo();
        news.shouldBe(visible);

        return this;
    }

    public MainPage checkExclusive() {
        exclusive.scrollTo();
        exclusive.shouldBe(visible);
        return this;
    }

    public MainPage checkDownMenu() {
        downMenu.scrollTo();
        downMenu.shouldBe(visible);

        return this;
    }

    public MainPage checkService() {
        services.hover();
        contentByToTicket.shouldBe(visible);

        return this;
    }

    public MainPage checkWindowSpecialOffer() {
        hoverSpecialOffer.hover();
        bestSale.shouldBe(visible);

        return this;
    }

    public MainPage checkAeroFlotBonus() {
        aeroFlotBonus.hover();
        joinInProgram.shouldBe(visible);

        return this;
    }

    public MainPage checkInformation() {
        information.hover();
        readyToTravel.shouldBe(visible);

        return this;
    }

    public MainPage checkForBusiness() {
        forBusiness.hover();
        corporateClients.shouldBe(visible);

        return this;
    }

}
