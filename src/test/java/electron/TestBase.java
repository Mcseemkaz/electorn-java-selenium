package electron;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import services.Configurator;
import services.DriverProvider;

public class TestBase {

    @BeforeEach
    public void setUP(){
        WebDriverRunner.setWebDriver(DriverProvider.getDriver());
        Configuration.baseUrl = Configurator.getAppBaseUrl();
    }

    @AfterEach
    public void TearDown(){
        WebDriverRunner.getWebDriver().close();
    }

}
