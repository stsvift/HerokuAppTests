
package ru.volkov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CheckboxesPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By checkboxes = By.cssSelector("[type=checkbox]");

    public CheckboxesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        wait.until(ExpectedConditions.numberOfElementsToBe(checkboxes, 2));
    }

    private WebElement getCheckbox(int index) {
        List<WebElement> elements = driver.findElements(checkboxes);
        return elements.get(index);
    }

    public boolean isChecked(int index) {
        return getCheckbox(index).isSelected();
    }

    public void clickCheckbox(int index) {
        getCheckbox(index).click();
    }
}
