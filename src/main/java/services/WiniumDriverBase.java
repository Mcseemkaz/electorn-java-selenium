package services;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WiniumDriverBase {

    public static WiniumDriver warmUPDriver()  {
        WiniumDriver driver = null;

        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Users\\Professional\\AppData\\Local\\Programs\\electron-react-boilerplate\\Raccoon.exe");
        options.setLaunchDelay(30);
        try {
            driver = new WiniumDriver(new URL("http://localhost:9999"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
