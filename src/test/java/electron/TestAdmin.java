package electron;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class TestAdmin extends TestBase {

    @Test
    @DisplayName("Check Admin Login")
    public void testAdminLogin() {

        Selenide.sleep(1000);

        System.out.println("Hello World Raccoon");

        System.out.println(WebDriverRunner.url());

        $("#login").sendKeys("admin@gmail.com");
        $("#password").sendKeys("PAROllll12");
        $("button").click();

        $(By.xpath("//div[@class='Home__container__2-Wx7']//p"))
                .waitUntil(Condition.visible, 15000)
                .shouldHave(Condition.text("Hi"));
    }
}
