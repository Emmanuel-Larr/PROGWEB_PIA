/*Alumno: Emmanuel Enrique Larraga Bueno Matricula: 1945008 Carrera: ITS*/
package tarea_17;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea_17 {

    public static void main(String[] args) {
        
        double num = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a convertir:"));
        String [] arreglo = {"Dolar", "Euro","Yen(Japones)","Dólar de Hong Kong"};
        int opcion=JOptionPane.showOptionDialog(null,"Eliga el tipo de dinero a convertir a pesos:"
                + "\n1.- Dolar = 20.32 pesos\n2.- Euro = 23.57 pesos" + "\n3.- Yen(Japones)= 0.18 pesos"
                + "\n4.-Dolar de Hong Kong = 2.61 pesos", "Conversiones"
                ,0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "");
        
        System.out.println(opcion);
        
        if (opcion == 0)
        {
            JOptionPane.showMessageDialog(null, "Total de Dolar a Pesos:"+(num*20.32));
        }
        else if (opcion == 1)
        {
            JOptionPane.showMessageDialog(null, "Total de Euro a Pesos:"+(num*23.57));
        }
        else if (opcion == 2)
        {
            JOptionPane.showMessageDialog(null, "Total de Yen a Pesos:"+(num*0.18));
        }
        else if (opcion == 3)
        {
            JOptionPane.showMessageDialog(null, "Total de Hong Kong a Pesos:"+(num*2.61));
        }
    }   
        
}
    

   
