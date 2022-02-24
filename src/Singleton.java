public class Singleton {
    private static FactoryCalculator calculator;
    private Singleton(){
        System.out.println("Primera instancia de un ACalculator");
    }
    public static FactoryCalculator getInstance(){
        if(calculator == null){
            FactoryCalculator calc = new FactoryCalculator();
            calculator = calc;
        }
        return calculator;
    }
}
