/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * interface calculator
 */
public interface ACalculator {
    /**
     * evaluates postfix expresion
     * @param postfix_expresion string postfix expresion
     * @return value of the postfix expresion
     */
    public double calculate(String postfix_expresion);
}
