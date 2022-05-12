/*Alumno: Emmanuel Enrique Larraga Bueno Matricula: 1945008 Carrera: ITS*/

package tarea_19;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Tarea_19 {

    public static void main(String[] args) {
 
        int i,num,contador = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de elementos para el vector:"));
        int cont[] = new int[num];
        
        for(i=0;i< num;i++)
        {
            cont[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca los numeros para el vector:"));
        }
        
        String vector = "Vector = (";
        
        for(i=0;i< num-1;i++)
        {
            vector += cont[i] + ",";
        }
        
        vector += cont[num-1] + ")";
        
        int buscador = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero a buscar en el vector:\n"+vector));
        
        for(i=0;i< num;i++)
        {
            if(cont[i] == buscador)
            {
                contador++;
            }
        }
        
        if(contador == 1)
        {
            JOptionPane.showMessageDialog(null,"El numero " + buscador + " aparece una vez en el vector");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El numero " + buscador + " aparece " + contador + " veces en el vector");
        }
        
        vector = "Vector = (";
        for(i=0;i< num-1;i++)
        {
            vector += cont[i] + ",";
        }
        
        vector += cont[num-1] + ")";
        JOptionPane.showMessageDialog(null,vector);
    }
}
