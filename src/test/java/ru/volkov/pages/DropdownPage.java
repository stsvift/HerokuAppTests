
package ru.volkov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DropdownPage {

    private final Select dropdown;

    public DropdownPage(WebDriver driver, WebDriverWait wait) {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        dropdown = new Select(
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.id("dropdown")
                ))
        );
    }

    public int getOptionsCount() {
        return dropdown.getOptions().size();
    }

    public void selectOption(String value) {
        dropdown.selectByValue(value);
    }

    public String getSelectedOption() {
        return dropdown.getFirstSelectedOption().getText();
    }

    public boolean hasOption(String text) {
        return dropdown.getOptions().stream()
                .anyMatch(option -> option.getText().equals(text));
    }
}
