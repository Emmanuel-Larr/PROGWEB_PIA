/*Alumno: Emmanuel Enrique Larraga Bueno Matricula: 1945008 Carrera: ITS*/
package tarea_16;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea_16 {

    public static void main(String[] args) {
        
        double num = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero:"));
        String [] arreglo = {"C° --> F°", "F° --> C°"};
        int opcion=JOptionPane.showOptionDialog(null,"Eliga:\n1.- Centigrados a Farenheit\n2.- Farenheit a Centigrados", 
                "Conversiones",0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "");
        System.out.println(opcion);
        
        if (opcion == 1)
        {
            JOptionPane.showMessageDialog(null, "F° --> C° - Respuesta:_" +(num-32)*5/9);
        }
        else    
        {
            JOptionPane.showMessageDialog(null, "C° --> F° - Respuesta:_" +((num*1.8000+32.00)));
        }
    }
    
}
   
