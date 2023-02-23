/**
 * Diego Vásquez - 211628
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
     public static void main(String[] args) throws IOException{
        
        Lector lc = new Lector();
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la ruta de acceso del archivo Infix:");
        String direction = scan.nextLine();
        ArrayList<String> operations = new ArrayList<>();        
        
        try { //verificar la existencia del archivo
            BufferedReader bf = new BufferedReader(new FileReader (direction));
            String line;
            while((line = bf.readLine()) != null){
                operations.add(line);
            }
         
           for(String expresion: operations){
            Lector dec = new Lector();
            System.out.println("Expresión: " + expresion);
            System.out.println("Resultado: " + dec.DecodeExpresion(expresion));
            }
        }
        catch(FileNotFoundException f){
            System.out.println("No se encontró el archivo");
            System.exit(0);
        }

        for (int i = 0; i < operations.size(); i++) {
            switch (operations.get(i)) {
                case "(":
                    
                    break;
            
                default:
                    break;
            }
        }

    }

}