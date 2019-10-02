import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Config;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import services.DriverProvider;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BaseTest {

    @BeforeEach
    public void setUP(){
        WebDriverRunner.setWebDriver(DriverProvider.getDriver());
    }

    @AfterEach
    public void TearDown(){
        WebDriverRunner.getWebDriver().close();
    }

    @Test
    @DisplayName("First test")
    public void testLaunchApplication(){
        System.out.println("Hello World Raccoon");

        System.out.println(
                $(byText("SIGN IN"))
                .waitUntil(Condition.visible, 10000)
        );






    }
}
