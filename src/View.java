/**
 * @author pablo Herrera
 * @author Sofia Lam
 * @author Dariel Villatoro
 *
 * compiler class of the project
 */
public class View {
    public static void main(String[] args) {
        //program reads file to get the infix expresion
        ReadFile readFile = new ReadFile();
        String infix_operation = readFile.ReadDatostxt();

        //program turns infix expresion to a postfix expresion so it is easier to operate
        InToPostfix postfix_op = new InToPostfix(infix_operation);
        String postfix = postfix_op.doTrans();

        //program ask user how it wants to solve the expresion, using lists, vector o arraylist
        Control control = new Control();
        int ImplementationType = control.ImplementationType();//variable saves if user wants to use Arrays, Lists or Vectors

        //calculator is created
        FactoryCalculator calculator = Singleton.getInstance();
        ACalculator calc = calculator.getCalculator(ImplementationType);
        double postfix_expression_value = calc.calculate(postfix);

        System.out.println("La expresion en notacion Infix es: "+infix_operation);
        System.out.println("La expresion en notacion Postfix es: "+postfix);
        System.out.println("El resultado de la expresion es: "+postfix_expression_value);

    }
}
