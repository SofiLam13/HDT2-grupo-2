/**
 * @author Pablo Herrera
 * @author Sofia Lam
 * @Dariel Villatoro
 *
 * calculator that uses arraylists to evaluate the postfix expresion
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CalculadoraArrayStack<E> implements ACalculator {
    /**
     *{@inheritDoc}
     */
    @Override
    public double calculate(String postfix_expresion) {
        String[] operacion = postfix_expresion.split("");
        ArrayList<String> Arr_for_stack = new ArrayList<String>(Arrays.asList(operacion));

        ArrayList<E> Arr_num = new ArrayList<E>();
        ArrayList<E> Arr_sgn = new ArrayList<E>();

        for(String S : Arr_for_stack){
            try{
                double constant = Double.parseDouble(S);
                Object C = (Object)constant;
                Arr_num.add((E)C);
            }catch (NumberFormatException e){
                Arr_sgn.add((E)S);
            }
        }
        //elements already in their respective arrays
        Collections.reverse(Arr_num);
        Collections.reverse(Arr_num);

        StackArrayList stack1 = new StackArrayList();
        StackArrayList stack2 = new StackArrayList();

        for(int i = 0; i<Arr_num.size();i++){
            try{
                stack1.add(Arr_num.get(i));
                stack2.add(Arr_sgn.get(i));
            }catch (IndexOutOfBoundsException e){
                //do nothing
            }
        }
        while(stack1.size()>1){
            String operator = String.valueOf(stack2.pop());
            String N1 = String.valueOf(stack1.pop());
            String N2 = String.valueOf(stack1.pop());

            double A = Double.parseDouble(N1);
            double B = Double.parseDouble(N2);
            double result=0;

            if(operator.equals("+")){
                result = A+B;
                stack1.add(result);
            }else
            if(operator.equals("-")){
                result = A-B;
                stack1.add(result);
            }else
            if(operator.equals("*")){
                result = A*B;
                stack1.add(result);
            }else
            if(operator.equals("/")){
                result = A/B;
                stack1.add(result);
            }
        }
        String value = String.valueOf(stack1.peek());
        Double finalvalue = Double.parseDouble(value);
        return finalvalue;
    }
}
