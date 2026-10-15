
package ru.volkov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InputsPage {

    private final WebElement input;

    public InputsPage(WebDriver driver, WebDriverWait wait) {
        driver.get("https://the-internet.herokuapp.com/inputs");

        input = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.tagName("input")
                )
        );
    }

    public void enterValue(String value) {
        input.clear();
        input.sendKeys(value);
    }

    public String getValue() {
        return input.getAttribute("value");
    }

    public void pressUp() {
        input.sendKeys(Keys.ARROW_UP);
    }

    public void pressDown() {
        input.sendKeys(Keys.ARROW_DOWN);
    }
}
