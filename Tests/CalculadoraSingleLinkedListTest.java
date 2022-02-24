import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSingleLinkedListTest {

    @Test
    void calculate() {
        String postfix = "12+4*3+";

        String[] op = postfix.split("");
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(op));

        LinkedList<String> signs = new LinkedList<>();
        LinkedList<Double> nums = new LinkedList<>();

        for(int i = 0;i<arr.size();i++){
            try{
                double n = Double.parseDouble(arr.get(i));
                nums.add(n);
            }catch (NumberFormatException e){
                signs.add(arr.get(i));
            }
        }
        Collections.reverse(nums);
        Collections.reverse(signs);

        while(nums.size()>1){
            String operator = signs.remove(signs.size()-1);
            double A = nums.remove(nums.size()-1);
            double B = nums.remove(nums.size()-1);
            double result = 0;

            if(operator.equals("+")){
                result = A+B;
                nums.add(result);
            }else
            if(operator.equals("-")){
                result = A-B;
                nums.add(result);
            }
            else
            if(operator.equals("/")){
                result = A/B;
                nums.add(result);
            }
            else
            if(operator.equals("*")){
                result = A*B;
                nums.add(result);
            }
        }
        double result1 = nums.get(0);
        double result_comp = 15.0;
    }
}