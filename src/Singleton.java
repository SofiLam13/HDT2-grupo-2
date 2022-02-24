/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @author Dariel Villatoro
 *
 * Singleton design pattern, takes care to only instantiate one calculator
 */
public class Singleton {
    private static FactoryCalculator calculator;
    private Singleton(){
        System.out.println("Primera instancia de un ACalculator");
    }

    /**
     * if calculator is null, returns a calculator type ACalculator
     * @return Acalculator
     */
    public static FactoryCalculator getInstance(){
        if(calculator == null){
            FactoryCalculator calc = new FactoryCalculator();
            calculator = calc;
        }
        return calculator;
    }
}
