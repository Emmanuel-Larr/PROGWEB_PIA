/*Alumno: Emmanuel Enrique Larraga Bueno Matricula: 1945008 Carrera: ITS*/

package tarea_20;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Tarea_20 {

    public static void main(String[] args) {
        
        int i,j,buscador = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de filas:"));
        System.out.println(num);
        int col = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de columnas:"));
        System.out.println(col);
        
        int[][] matriz = new int[num][col];
        System.out.println(matriz);
        
        for(i=0;i< num;i++)
        {
            for(j=0;j< col;j++)
            {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero para posición:\n["+(i+1)+"]["+(j+1)+"]"));
            }
        }
        
        String matriz_final = "Matriz: \n";
        for(i = 0; i< num; i++){
            for(j = 0; j< col; j++){
                matriz_final += "(" + matriz[i][j] + ") ";
            }
            matriz_final += "\n";
        }
   
        int num_buscado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a buscar en la matriz:\n\n"+matriz_final));

        for(i = 0; i< num; i++){
            for(j = 0; j< col; j++){
                if(num_buscado == matriz[i][j]){
                    buscador++;
                }
            }
        }

        if(buscador == 1)
        {
            JOptionPane.showMessageDialog(null,"Elemento a buscar:"+ num_buscado + "\n El " + num_buscado + " aparece solo 1 vez");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Elemento a buscar:"+ num_buscado + "\nSe repite: " + buscador + " veces en la matriz");
        }
        
        matriz_final="Matriz Final:\n";
        for(i = 0; i< num; i++)
        {
            for(j = 0; j< col; j++)
            {
                matriz_final += "(" + matriz[i][j] + ")";
            }
            matriz_final += "\n";
        }
        JOptionPane.showMessageDialog(null,matriz_final);
    }
}
   
