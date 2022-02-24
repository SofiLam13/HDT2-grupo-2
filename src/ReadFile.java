import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFile {
    ReadFile(){}

    public String ReadDatostxt(){
        ArrayList<Object> Array = new ArrayList<>();
        String Infix_operation="";
        File file = new File("datos.txt");
        try{
            FileReader data = new FileReader(file);
            int i = 0;
            while(i!=-1){
                i = data.read();
                char caracter = (char)i;
                String command = String.valueOf(caracter);
                Array.add(command);
            }
            data.close();

            if(Array.isEmpty()){
                JOptionPane.showMessageDialog(null,"El archivo que se iba a leer, no contiene en realidad algun elemento");
            }else{
                for(int n = 0; n <Array.size()-1;n++){
                    String element = (String)Array.get(n);
                    Infix_operation = Infix_operation+element;
                }
            }
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"No existe el archivo, creele e intente de nuevo");
        }
        return Infix_operation;
    }
}
