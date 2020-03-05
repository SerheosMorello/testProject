package cmd.hendlers;

import cmd.utils.PageWaiter;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.ExecutionException;

import static com.codeborne.selenide.Selenide.$;

public class Tree {

    public void selectTreeByName(String nodeName, String number) throws NoSuchElementException{

        if (number == "") {
            number = "last()";
        }

        new Scroll().scrollOnNode(-500);
        boolean scroll = true;
        int tryNumber = 0;
        int maxTry = 5;
        while (scroll && tryNumber <= maxTry) {
            try {
                Configuration.timeout = 100;
                $(By.xpath("(.//cmd-tree//cmd-tree-row//span[text()='"+ nodeName +"'])["+number+"]")).click();
                new PageWaiter().waitForAngularRequestsToFinish();
                scroll = false;
                Configuration.timeout = 4000;
            } catch (ElementNotFound e) {
                tryNumber += 1;
                new Scroll().scrollOnNode(300);
                if (tryNumber == maxTry) throw e;
            }
        }


    }

    public void expandTreeNode(String[] nodes , String number) throws NoSuchElementException{
        if (number == "") {
            number = "last()";
        }

        boolean scroll = true;
        int tryNumber = 0;
        int maxTry = 5;
        //new Scroll().scrollOnNode(-500);
        while (scroll && tryNumber <= maxTry) {
            try {
                for (int i = 0; i < nodes.length; i++) {
                    if ($(By.xpath(".//*[@id='main']")).find(By.xpath("(//span[text()='" + nodes[i] + "']/parent::div)[" + number + "]")).getAttribute("class").contains("closed")) {
                        $(By.xpath(".//*[@id='main']")).find(By.xpath("(//span[text()='" + nodes[i] + "']/parent::div)[" + number + "]/span[contains(@class, 'open-subtree-button-holder')]")).click();
                    }
                }
                scroll = false;
            } catch (NoSuchElementException e){
                tryNumber += 1;
                new Scroll().scrollOnNode(250);
                if (tryNumber == maxTry) throw e;
            }
        }
    }

    public void selectNodeByGroup(String node, String[] group) {
        expandTreeNode(group,"");
        selectTreeByName(node, "");

    }

    public void selectNodeByGroupNumber(String node, String[] group, String nodeNumber) {
        expandTreeNode(group, nodeNumber);
        selectTreeByName(node, "");
    }

    public void selectNodeNumberByGroup(String node, String[] group, String NodeNumber) {
        expandTreeNode(group, "");
        selectTreeByName(node, NodeNumber);
    }

    public void selectNodeNumberByGroupNumber(String node, String[] group, String nodeNumber, String groupNumber) {
        expandTreeNode(group, groupNumber);
        selectTreeByName(node, nodeNumber);
    }

}
