import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CalculadoraDoublyLinkedList<E> implements ACalculator{

    @Override
    public double calculate(String postfix_expresion) {
        String[] operacion = postfix_expresion.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(operacion));

        //creates separate linked lists to store numbers apart from signs
        DoublyLinkedList<E> nums = new DoublyLinkedList<E>();
        DoublyLinkedList<E> signs = new DoublyLinkedList<E>();

        for(int i = 0;i<list.size();i++){
            try{
                double num = Double.parseDouble(list.get(i));
                Object C = (Object) num;
                nums.add((E)C);
            }catch (NumberFormatException e){
                Object sgn = (Object) list.get(i);
                signs.add((E)sgn);
            }
        }
        //elements were added to their respective double linked lists

        while(nums.size()>1){
            String operator = String.valueOf(signs.removeLast());
            String N1 = String.valueOf(nums.removeLast());
            String N2 = String.valueOf(nums.removeLast());

            Double A = Double.parseDouble(N1);
            Double B = Double.parseDouble(N2);
            double result = 0;

            if(operator.equals("+")){
                result = A+B;
                Object R = (Object) result;
                nums.add((E)R);
            }else
            if(operator.equals("-")){
                result = A-B;
                Object R = (Object) result;
                nums.add((E)R);
            }else
            if(operator.equals("*")){
                result = A*B;
                Object R = (Object) result;
                nums.add((E)R);
            }else
            if(operator.equals("/")){
                result = A/B;
                Object R = (Object) result;
                nums.add((E)R);
            }
        }
        String value = String.valueOf(nums.removeLast());
        double finalvalue = Double.parseDouble(value);
        return finalvalue;
    }
}
