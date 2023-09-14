package ru.safonovill.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.safonovill.config.WebProvider;
import ru.safonovill.helpers.Attach;

public class TestBase {

    @BeforeAll
    static void configure() {
        WebProvider.configuration();
    }

    @BeforeEach
    void allureListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        if(Configuration.remote != null){
        Attach.addVideo();
        }
        Selenide.closeWebDriver();
        Selenide.clearBrowserCookies();
    }
}