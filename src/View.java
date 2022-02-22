import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, esta es una calculadora infix-postfix...");
        System.out.println("Por favor, escoja una opcion para resolver la expresion matematica");
        System.out.println("L / A / V");
        String option = scanner.nextLine();
        //por defecto, i = 1;
        FactoryType factory = new FactoryType();
        //usuario escoge como operar la expresion
        int i = 1;
        if(option.equals("A")){
            i = 1;
        }
        if(option.equals("V")){
            i = 2;
        }
        //si es algo diferente, se asume que quiere utilizar listas
        if(option.equals("L")){
            i = 0;
        }
        //se crea el stack dependiendo de lo que haya escogido
        if(i == 1 || i == 2){
            factory.getStack(i);
        }else{
            //si no desea stacks, pero listas
            System.out.println("Ingrese que tipo de Estructura dinamica desea implementar");
            System.out.println("S / D");
            String optionList = scanner.nextLine();
            int n = 1;
            //por defecto se usa la singlylinkedlist, si escoge D se instancia una doublylinkedlist
            if(optionList.equals("D")){
                n = 2;
            }
            factory.getList(n);
        }
        //ahora es momento de crear la calculadora utilizando el patron de diseño

    }
}
