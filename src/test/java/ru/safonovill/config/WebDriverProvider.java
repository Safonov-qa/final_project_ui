package ru.safonovill.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configuration() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
        String remoteUrl = config.getRemoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }
}