
package ru.volkov.tests;

import org.junit.jupiter.api.Test;
import ru.volkov.TestBase;
import ru.volkov.pages.DropdownPage;

import static org.junit.jupiter.api.Assertions.*;

public class DropdownTest extends TestBase {

    @Test
    void optionsExistTest() {
        DropdownPage page = new DropdownPage(driver, wait);

        assertEquals(3, page.getOptionsCount());
        assertTrue(page.hasOption("Option 1"));
        assertTrue(page.hasOption("Option 2"));
    }

    @Test
    void selectOptionsTest() {
        DropdownPage page = new DropdownPage(driver, wait);

        page.selectOption("1");
        assertEquals("Option 1", page.getSelectedOption());

        page.selectOption("2");
        assertEquals("Option 2", page.getSelectedOption());
    }
}
