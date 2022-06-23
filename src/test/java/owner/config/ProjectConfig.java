package owner.config;

import org.aeonbits.owner.Config;

//@Config.LoadPolicy(Config.LoadType.MERGE)

@Config.Sources({
        "classpath:${device}.properties"
})

public interface ProjectConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    // зачитываем данные из командной строки
    @Key("remoteUrl")
    // обрабатывает дефолтное значение
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    // конвертируем в возращаемый тип
    String getRemoteUrl();

    @Key("browserSize")
    @DefaultValue("100")
    String getBrowserSize();

    @Key ("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();
}
