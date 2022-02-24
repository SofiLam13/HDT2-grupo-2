/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * calculator that uses linked lists to evaluate the postfix expresion
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CalculadoraSingleLinkedList<E> implements ACalculator{
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculate(String postfix_expresion) {
        String[] operacion = postfix_expresion.split("");
        ArrayList<String> arr_for_list = new ArrayList<String>(Arrays.asList(operacion));
        LinkedList<String> linked_list_calc = new LinkedList<String>(arr_for_list);

        //create linked list to separate numbers from signs
        LinkedList<E> nums = new LinkedList<E>();
        LinkedList<E> signs = new LinkedList<E>();

        for(int i = 0; i<linked_list_calc.size();i++){
            try{
                double number = Double.parseDouble(linked_list_calc.get(i));
                Object C = (Object)number;
                nums.add((E)C);
            }catch (NumberFormatException e){
                Object sgn = (Object)linked_list_calc.get(i);
                signs.add((E)sgn);
            }
        }
        Collections.reverse(nums);
        Collections.reverse(signs);

        //creates SinglyLinkedLists to simulate the stacks
        SingleLinkedList stack_numbers = new SingleLinkedList();
        SingleLinkedList stack_signs = new SingleLinkedList();

        for(int n = 0;n<nums.size();n++){
            stack_numbers.add(nums.get(n));
            try{
                stack_signs.add(signs.get(n));
            }catch (IndexOutOfBoundsException e){}
        }
        while(stack_numbers.size>1){
            String operator = String.valueOf(stack_signs.removeLast());
            String N1 = String.valueOf(stack_numbers.removeLast());
            String N2 = String.valueOf(stack_numbers.removeLast());

            double A = Double.parseDouble(N1);
            double B = Double.parseDouble(N2);
            double result = 0;

            if(operator.equals("+")){
                result = A+B;
                stack_numbers.add(result);
            }else
            if(operator.equals("-")){
                result = A-B;
                stack_numbers.add(result);
            }else
            if(operator.equals("*")){
                result = A*B;
                stack_numbers.add(result);
            }else
            if(operator.equals("/")){
                result = A/B;
                stack_numbers.add(result);
            }
        }
        String value = String.valueOf(stack_numbers.get(stack_numbers.size-1));
        double finalvalue = Double.parseDouble(value);
        return finalvalue;
    }
}
