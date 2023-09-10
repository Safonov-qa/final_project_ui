package ru.safonovill.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.safonovill.pages.BuyTicketPage;
import ru.safonovill.pages.MainPage;
import static io.qameta.allure.Allure.step;

@Story("Проверка работы сайта Аэрофлот")
@Owner("SafonovIll")
@Feature("UI тесты на проверку содержания разделов сайта Аэрофлот")
@DisplayName("Cтраница покупки билета")
@Tag("buy_ticket_test")

public class BuyTicketTest extends TestBase {
    MainPage mainPage = new MainPage();
    BuyTicketPage buyTicketPage = new BuyTicketPage();

    @DisplayName("Содержание страницы покупки билета")
    @ValueSource(strings = {"Пхукет", "Ларнака", "Мале"})
    @ParameterizedTest(name = "Наличие билетов из Москвы в {0}")
    void checkPageBuyTicketTest(String to) {
        step("Открыть главную страницу", () ->
                mainPage.openMain());
        step("Закрыть всплывающее окно", () ->
                mainPage.closeWindow());
        step("Отображение меню покупки билета", () ->
                buyTicketPage.checkMenuByToTicket());
        step("Наличие билетов", () ->
                buyTicketPage.checkSearchTicket(to));

    }

}
