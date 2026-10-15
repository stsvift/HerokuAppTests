
package ru.volkov.tests;

import org.junit.jupiter.api.Test;
import ru.volkov.TestBase;
import ru.volkov.pages.InputsPage;

import static org.junit.jupiter.api.Assertions.*;

public class InputsTest extends TestBase {

    @Test
    void numberInputTest() {
        InputsPage page = new InputsPage(driver, wait);

        page.enterValue("5");
        assertEquals("5", page.getValue());

        page.pressUp();
        assertEquals("6", page.getValue());

        page.pressDown();
        assertEquals("5", page.getValue());
    }

    @Test
    void invalidInputTest() {
        InputsPage page = new InputsPage(driver, wait);

        page.enterValue("abc");

        assertNotEquals("abc", page.getValue());
    }
}
