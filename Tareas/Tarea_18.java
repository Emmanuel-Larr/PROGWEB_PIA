/*Alumno: Emmanuel Enrique Larraga Bueno Matricula: 1945008 Carrera: ITS*/

package tarea_18;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Tarea_18 {


    public static void main(String[] args) {
        
        int i, num; 
        
        String cantidad, can_total="";
        
        cantidad = JOptionPane.showInputDialog(null,"Cantidad de numeros a generar de la serie: ");
        num = Integer.parseInt(cantidad);
        System.out.println(cantidad);
        
        for(i=1;i<=num;i++)
        {
            can_total += (int)Math.pow(i,((2*i)-1)) + ", ";
            System.out.println(can_total);
        }
        
        JOptionPane.showMessageDialog(null,can_total);
    }
}
  