import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void testCheckNameWithValidName() {
        assertTrue(Utils.checkName("Alice"));
        assertTrue(Utils.checkName("Bob"));
    }

    @Test
    void testCheckNameWithEmptyString() {
        assertFalse(Utils.checkName(""));
    }

    @Test
    void testCheckNameWithNull() {
        assertFalse(Utils.checkName(null));
    }

    @Test
    void testCheckNameWithSingleCharacter() {
        assertTrue(Utils.checkName("A"));
    }

    @Test
    void testCheckNameWithWhitespace() {
        assertTrue(Utils.checkName(" "));
    }

    // Tests for isValidAge
    @Test
    void testIsValidAgeWithValidAge() {
        assertTrue(Utils.isValidAge(0));
        assertTrue(Utils.isValidAge(20));
        assertTrue(Utils.isValidAge(150));
    }

    @Test
    void testIsValidAgeWithNegativeAge() {
        assertFalse(Utils.isValidAge(-1));
        assertFalse(Utils.isValidAge(-100));
    }

    @Test
    void testIsValidAgeWithZero() {
        assertTrue(Utils.isValidAge(0));
    }

    @Test
    void testIsValidAgeWithLargeAge() {
        assertTrue(Utils.isValidAge(120));
        assertTrue(Utils.isValidAge(200));
    }
}
