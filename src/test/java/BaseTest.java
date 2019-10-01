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
import services.WiniumDriverBase;

public class BaseTest {

    WebDriver driver;

    @BeforeEach
    public void setUP(){
        this.driver = DriverProvider.getDriver();
    }

    @AfterEach
    public void TearDown(){
        driver.close();
    }

    @Test
    @DisplayName("Fisrt test ONE")
    public void testLaunchApplication(){
        System.out.println("Helloworld Raccoon");

//        Actions action = new Actions(getDriver);
//        action.moveByOffset(1500, 870)
//                .click()
//                .build()
//                .perform();

        //WebElement raccoon = getDriver.findElementById("206039376");

        System.out.println("click");
//        getDriver.findElementByName("Пожалуйста, введите пароль")
//                .sendKeys("s4LRoWv8qC");
        driver.findElement(By.name("SIGN IN")).click();


    }
}
