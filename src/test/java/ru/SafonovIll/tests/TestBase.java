package ru.SafonovIll.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.SafonovIll.helpers.Attach;

import static ru.SafonovIll.config.WebDriverProvider.config;

public class TestBase {
    @BeforeAll
    static void setUp() {
        config();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        if (config.isRemote()) {
            Attach.addVideo();
        }
        Selenide.closeWebDriver();
    }
}