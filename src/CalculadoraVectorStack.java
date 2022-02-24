/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * calculator that uses vectors to evaluate the postfix expresion
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class CalculadoraVectorStack<E> implements ACalculator{
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculate(String postfix_expresion) {
        String[] operacion = postfix_expresion.split("");
        ArrayList<String> VectorToBe = new ArrayList<String>(Arrays.asList(operacion));

        Vector<String> vector_for_stack = new Vector<String>(VectorToBe);

        //create to separate vectors to store numbers apart form signs
        Vector<E> numbers = new Vector<E>();
        Vector<E> signs = new Vector<E>();

        //add elements where they belong
        for(int i = 0;i<vector_for_stack.size();i++){
            try{
                double num = Double.parseDouble(vector_for_stack.elementAt(i));
                Object c = (Object) num;
                numbers.add((E)c);
            }catch (NumberFormatException e){
                Object sgn = (Object)vector_for_stack.elementAt(i);
                signs.add((E)sgn);
            }
        }
        //elements were added to their respective vectors
        Collections.reverse(numbers);
        Collections.reverse(signs);

        StackVector stack_for_numbers = new StackVector();
        StackVector stack_for_signs = new StackVector();

        for(int n = 0;n<numbers.size();n++){
               stack_for_numbers.add(numbers.elementAt(n));
               try{
                   stack_for_signs.add(signs.elementAt(n));
               }catch (IndexOutOfBoundsException e){

               }
        }
        while(stack_for_numbers.size()>1){
            String operator = String.valueOf(stack_for_signs.pop());
            String N1 = String.valueOf(stack_for_numbers.pop());
            String N2 = String.valueOf(stack_for_numbers.pop());

            Double A = Double.parseDouble(N1);
            Double B = Double.parseDouble(N2);
            double result = 0;

            if(operator.equals("+")){
                result = A+B;
                Object R = (Object) result;
                stack_for_numbers.add(R);
            }
            else
            if(operator.equals("-")){
                result = A-B;
                Object R = (Object) result;
                stack_for_numbers.add(R);
            }
            else
            if(operator.equals("*")){
                result = A*B;
                Object R = (Object) result;
                stack_for_numbers.add(R);
            }
            else
            if(operator.equals("/")){
                result = A/B;
                Object R = (Object) result;
                stack_for_numbers.add(R);
            }
        }

        String finalvalue = String.valueOf(stack_for_numbers.pop());
        Double result_now = Double.parseDouble(finalvalue);

        return result_now;
    }
}