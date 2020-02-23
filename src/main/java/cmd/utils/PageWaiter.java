package cmd.utils;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWaiter {

    WebDriver driver = WebDriverRunner.getWebDriver();

    public void waitForAngularRequestsToFinish() {
        try {
            (new WebDriverWait(driver,60)).until(driver -> {
                try {
                    return Boolean.valueOf(((JavascriptExecutor) driver).executeScript(
                            "return (function(){return window.getAllAngularTestabilities()[0].isStable().toString()})()")
                            .toString());
                } catch (final WebDriverException e) {
                    return null;
                }
            });
        } catch (final TimeoutException e) {
        } catch (final WebDriverException e) {
        }
    }

}
