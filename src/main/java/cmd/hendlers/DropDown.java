package cmd.hendlers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDown {

    public void selectOntionsByLabel(String label, String value){

        $(By.xpath(".//cmd-select//label[contains(text(), '" + label + "')]//ancestor::cmd-select//div[contains(@class, 'field')]//input")).click();
        SelenideElement popup = $(By.tagName("cmd-select-popup"));
        popup.findElement(By.xpath(".//div[@title='" + value + "']")).click();
        popup.shouldBe(Condition.disappear);

    }

}
