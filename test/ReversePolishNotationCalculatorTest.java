import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReversePolishNotationCalculatorTest {

    @Test
    void checkingOperationsWithAPlus() {
        final ReversePolishNotationCalculator polishNotationCalculator = new ReversePolishNotationCalculator();
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("1 1 +"), 2);
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("11 7 +"), 18);
    }

    @Test
    void checkingOperationsWithAMinus() {
        final ReversePolishNotationCalculator polishNotationCalculator = new ReversePolishNotationCalculator();
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("1 1 -"), 0);
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("11 7 -"), 4);
    }

    @Test
    void checkingOperationsWithAMultiplication() {
        final ReversePolishNotationCalculator polishNotationCalculator = new ReversePolishNotationCalculator();
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("1 1 *"), 1);
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("11 7 *"), 77);
    }

    @Test
    void checkingOperationsWithNegativeNumbers() {
        final ReversePolishNotationCalculator polishNotationCalculator = new ReversePolishNotationCalculator();
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("-5 5 +"), 0);
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("-5 5 -"), -10);
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation("-5 5 *"), -25);
    }

    @Test
    void checkingForAStringWithExtraSpaces() {
        final ReversePolishNotationCalculator polishNotationCalculator = new ReversePolishNotationCalculator();
        Assertions.assertEquals(polishNotationCalculator.calculatePolishNotation(" 1   1 +  "), 2);
    }
}