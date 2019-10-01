package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverProvider {

    public static WebDriver getDriver(){

        WebDriver ret = null;
        if(Configurator.getWebDriverType().equals("chrome")){

            Map<String, Object> opt = new HashMap<>();

            opt.put("binary", "C:\\Users\\Professional\\AppData\\Local\\Programs\\electron-react-boilerplate\\Raccoon.exe");
            opt.put("args", Arrays.asList(" path-to-electron-app"));
//            opt.addArguments("start-maximized"); // open Browser in maximized mode
//            opt.addArguments("disable-infobars"); // disabling infobars
//            opt.addArguments("--disable-extensions"); // disabling extensions
//            opt.addArguments("--disable-gpu"); // applicable to windows os only
//            opt.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//            opt.addArguments("--no-sandbox"); // Bypass OS security model
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("chromeOptions", opt);
            capabilities.setBrowserName("chrome");

            ret = new ChromeDriver(capabilities) {
            };
        }

        return  ret;
    }
}
