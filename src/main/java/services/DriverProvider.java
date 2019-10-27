package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverProvider {

    public static WebDriver getDriver(){

        WebDriver ret = null;

        if(Configurator.getWebDriverType().equals("chrome")){

            System.setProperty("webdriver.chrome.driver", "/home/mcseem/Repo/electron/electron-project/chromedriver-repo/chromedriver");

            ChromeOptions opt = new ChromeOptions();
            opt.setBinary(Configurator.getElectronDemoAppPath());
            opt.addArguments("--no-sandbox");// Bypass OS security model
            opt.addArguments("start-maximized"); // open Browser in maximized mode
            opt.addArguments("disable-infobars"); // disabling infobars
            opt.addArguments("--disable-extensions"); // disabling extensions
            opt.addArguments("--disable-gpu"); // applicable to windows os only
            opt.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            opt.addArguments("--remote-debugging-port=9222");// Bypass OS security model
            //opt.addArguments("--headless");

            ret = new ChromeDriver(opt) {
            };
        }

        return  ret;
    }
}
