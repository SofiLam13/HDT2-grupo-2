/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * factory desing pattern for calculator, it makes sure to implement a calculator type ACalculator, depending on what the user's entry
 */
public class FactoryCalculator<E> {
    FactoryCalculator(){}

    /**
     * gets ACalculator to be implemented
     * @param i user's entry, it chooses the type of implementation it wants
     * @return calculator type ACalculator, can be an ArrayList, vector, linked list or doubly linked list
     */
    public ACalculator getCalculator(int i){
        ACalculator calculator = null;
        switch (i){
            case 1:
                CalculadoraArrayStack calc1 = new CalculadoraArrayStack();
                calculator = calc1;
                break;
            case 2:
                CalculadoraVectorStack calc2 = new CalculadoraVectorStack();
                calculator = calc2;
                break;
            case 3:
                int option = Control.choose_list();
                if(option == 1){
                    CalculadoraSingleLinkedList calc3 = new CalculadoraSingleLinkedList();
                    calculator = calc3;
                }else
                    if(option == 2){
                        CalculadoraDoublyLinkedList calc4 = new CalculadoraDoublyLinkedList();
                        calculator = calc4;
                    }
                    break;
        }
        return calculator;
    }
}
