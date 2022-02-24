import java.util.Scanner;

public class Control {
    Scanner scanner = new Scanner(System.in);
    Control(){}

    //menu calc
    public int ImplementationType() {
        System.out.println("Bienvenido, por favor ingrese una forma para evaluar su expresion matematica");
        System.out.println("1.Arreglos");
        System.out.println("2.Vectores");
        System.out.println("3.Listas");

        int Op = 0;
        boolean val;

        do{
            String option = scanner.nextLine();
            try{
                Op = Integer.parseInt(option);
                if(Op <= 0 || Op > 3){
                    System.out.println("Ingrese una opcion en el menu");
                    val = false;
                }
                else{
                    val = true;
                }
            }catch (Exception e){
                System.out.println("Ingrese una opcion en el menu");
                val = false;
            }
        }while(val == false);
        return Op;
    }

    public static int choose_list(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoge un tipo de lista que desees emplear");
        System.out.println("1.Simplemente Encadenada");
        System.out.println("2.Doblemente Encadenada");
        String user_entry="";
        int option=0;
        boolean val=false;
        do{
            user_entry = scanner.nextLine();
            try{
                option = Integer.parseInt(user_entry);
                if(option<0 || option>2){
                    System.out.println("Ingrese una opcion del menu");
                    val = false;
                }else{
                    val = true;
                }
            }catch (Exception e){
                System.out.println("Ingrese una opcion del menu");
                val = false;
            }
        }while(val == false);
        return option;
    }
    public void singleton(){
        System.out.println("No se permite mas de una instancia para las calculadoras");
    }

}
