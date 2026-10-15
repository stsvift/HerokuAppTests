
package ru.volkov.tests;

import org.junit.jupiter.api.Test;
import ru.volkov.TestBase;
import ru.volkov.pages.AddRemovePage;

import static org.junit.jupiter.api.Assertions.*;

public class AddRemoveTest extends TestBase {

    @Test
    void addTwoElementsTest() {
        AddRemovePage page = new AddRemovePage(driver, wait);

        page.addElement();
        page.addElement();

        assertEquals(2, page.getDeleteCount());
    }

    @Test
    void deleteElementTest() {
        AddRemovePage page = new AddRemovePage(driver, wait);

        page.addElement();
        page.addElement();
        page.deleteElement();

        assertEquals(1, page.getDeleteCount());
    }
}
