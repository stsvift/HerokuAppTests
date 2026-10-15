
package ru.volkov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddRemovePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By addButton =
            By.xpath("//button[text()='Add Element']");

    private final By deleteButtons =
            By.xpath("//button[text()='Delete']");

    public AddRemovePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    public void addElement() {
        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
    }

    public void deleteElement() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteButtons)).click();
    }

    public int getDeleteCount() {
        return driver.findElements(deleteButtons).size();
    }
}
