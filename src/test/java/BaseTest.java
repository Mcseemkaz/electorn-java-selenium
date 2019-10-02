import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Config;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;
import services.DriverProvider;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    //WebDriver driver;

    @BeforeEach
    public void setUP(){
        //this.driver = DriverProvider.getDriver();
        WebDriverRunner.setWebDriver(DriverProvider.getDriver());
        Config
    }

    @AfterEach
    public void TearDown(){
        //driver.close();
    }

    @Test
    @DisplayName("First test")
    public void testLaunchApplication(){
        System.out.println("Hello World Raccoon");
        open();
        $("#using-window-events-demo-toggle").click();
        $(By.xpath("(//div[@class='demo'])[3]//span")).waitUntil(Condition.visible, 10000).getText();
        System.out.println(
                $(By.xpath("(//div[@class='demo'])[3]//span"))
                .waitUntil(Condition.visible, 10000).getText()
        );



        System.out.println("click");


    }
}
