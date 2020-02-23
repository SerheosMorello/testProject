package cmd.hendlers;

import cmd.utils.PageWaiter;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.*;
import java.nio.charset.Charset;

public class Scroll {

    public void scrollOnNode(final int deltaY) {
        final String jsFunc = JavaScriptHelper.getJavaScriptCode(JavaScript.SCROLL);
        ((JavascriptExecutor) WebDriverRunner.getWebDriver())
                .executeScript(jsFunc + "scroll(arguments[0], arguments[1], arguments[2], arguments[3]);", WebDriverRunner.getWebDriver().findElement(By.xpath("//*[@id='mainTree' or @id='viewTree']")), deltaY,
                        0, 0);
        new PageWaiter().waitForAngularRequestsToFinish();
    }

    public void scrollOnDropDown(final int deltaY) {
        final String jsFunc = JavaScriptHelper.getJavaScriptCode(JavaScript.SCROLL);
        ((JavascriptExecutor) WebDriverRunner.getWebDriver())
                .executeScript(jsFunc + "scroll(arguments[0], arguments[1], arguments[2], arguments[3]);", WebDriverRunner.getWebDriver().findElement(By.tagName("cmd-select-popup")), deltaY,
                        0, 0);
        new PageWaiter().waitForAngularRequestsToFinish();
    }

    public void scrollOnMenuContent(final int deltaY) {
        final String jsFunc = JavaScriptHelper.getJavaScriptCode(JavaScript.SCROLL);
        ((JavascriptExecutor) WebDriverRunner.getWebDriver())
                .executeScript(jsFunc + "scroll(arguments[0], arguments[1], arguments[2], arguments[3]);", WebDriverRunner.getWebDriver().findElement(By.xpath("//div[contains(@class, 'cmd-menu-content')]")), deltaY,
                        0, 0);
        new PageWaiter().waitForAngularRequestsToFinish();

    }


    public static class JavaScriptHelper {

        public static String getJavaScriptCode(final JavaScript javaScript) {
            Charset cs = Charset.forName("UTF-8");
            try (InputStream stream = JavaScriptHelper.class.getResourceAsStream(javaScript.getFilePath())) {
                Reader reader = new BufferedReader(new InputStreamReader(stream, cs));
                StringBuilder builder = new StringBuilder();
                char[] buffer = new char[8192];
                int read;
                while ((read = reader.read(buffer, 0, buffer.length)) > 0) {
                    builder.append(buffer, 0, read);
                }
                return builder.toString();
            } catch (IOException ioe) {
                throw new RuntimeException("Unable to load javaScript file by path: " + javaScript.getFilePath());
            }
        }

        public static JavascriptExecutor getJavaScriptExecutor() {
            return (JavascriptExecutor) WebDriverRunner.getWebDriver();
        }

        public static <T> T executeJs(final JavaScript javaScript, String additionalJs, Object... args) {
            return (T) getJavaScriptExecutor().executeScript(getJavaScriptCode(javaScript) + additionalJs, args);
        }

        public static <T> T executeJs(final JavaScript javaScript, Object... args) {
            return (T) getJavaScriptExecutor().executeScript(getJavaScriptCode(javaScript), args);
        }


    }

    public enum JavaScript implements FilePath {
        SCROLL("scroll.js"),
        ELEMENT_INDEX("getElementIndex.js");

        private final String fileName;

        JavaScript(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public String getFilePath() {
            return "/js/" + fileName;
        }
    }

    public interface FilePath {
        String getFilePath();
    }

}
