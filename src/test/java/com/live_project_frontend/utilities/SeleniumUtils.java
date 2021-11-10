package com.live_project_frontend.utilities;

public class SeleniumUtils {

    public static void switchWindow() {

        for(String windowID : DriverUtils.getDriver().getWindowHandles()) {
            if(!windowID.equals(DriverUtils.getDriver().getWindowHandle())) {
                DriverUtils.getDriver().switchTo().window(windowID);
            }
        }
    }

    public static void switchWindowWithTitle(String expectedTitle) {
        for(String windowID : DriverUtils.getDriver().getWindowHandles()) {
            DriverUtils.getDriver().switchTo().window(windowID);

            if(DriverUtils.getDriver().getTitle().equals(expectedTitle)) {
                break;
            }
        }
    }

}
