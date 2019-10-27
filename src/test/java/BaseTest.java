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
    public void testLaunchApplication() throws InterruptedException {

        Thread.sleep(5000);
        System.out.println("Hello World Raccoon");

        $("#login").sendKeys("admin@gmail.com");
        $("#password").sendKeys("PAROllll12");
        $("button").click();


        $(By.xpath("//div[@class='Home__container__2-Wx7']//p"))
                .waitUntil(Condition.visible, 15000)
                .shouldHave(Condition.text("Hi"));


        Thread.sleep(5000);

    }
}
