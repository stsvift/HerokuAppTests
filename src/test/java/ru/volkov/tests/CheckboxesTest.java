
package ru.volkov.tests;

import org.junit.jupiter.api.Test;
import ru.volkov.TestBase;
import ru.volkov.pages.CheckboxesPage;

import static org.junit.jupiter.api.Assertions.*;

public class CheckboxesTest extends TestBase {

    @Test
    void firstCheckboxTest() {
        CheckboxesPage page = new CheckboxesPage(driver, wait);

        assertFalse(page.isChecked(0));

        page.clickCheckbox(0);

        assertTrue(page.isChecked(0));
    }

    @Test
    void secondCheckboxTest() {
        CheckboxesPage page = new CheckboxesPage(driver, wait);

        assertTrue(page.isChecked(1));

        page.clickCheckbox(1);

        assertFalse(page.isChecked(1));
    }
}
