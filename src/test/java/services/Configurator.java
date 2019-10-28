package services;

public class Configurator {

    private static final String WEB_DRIVER_TYPE = "chrome";
    private static final String ELECTRON_DEMO_APP_PATH = "/home/mcseem/Repo/electron/electron-project/raccoon-desktop-electron-react/release/linux-unpacked/raccoon";

    public static String getAppBaseUrl() {
        return APP_BASE_URL;
    }

    private static final String APP_BASE_URL = "file:///home/mcseem/Repo/electron/electron-project/raccoon-desktop-electron-react/release/linux-unpacked/resources/";

    //C:\Users\Professional\AppData\Local\Programs\electron-react-boilerplate\Raccoon.exe
    //c:\Repo\electron\electron-demo-app\Electron API Demos.exe

    public static String getWebDriverType() {
        return WEB_DRIVER_TYPE;
    }

    public static String getElectronDemoAppPath() {
        return ELECTRON_DEMO_APP_PATH;
    }


}
