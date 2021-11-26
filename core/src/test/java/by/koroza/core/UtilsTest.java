package by.koroza.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {
    @Test
    void isAllPositiveNumbersTest() {
        boolean actual = Utils.isAllPositiveNumbers("15", "25", "1");
        Assertions.assertTrue(actual);
    }
}
