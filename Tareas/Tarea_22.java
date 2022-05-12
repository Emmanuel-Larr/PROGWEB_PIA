/*Alumno: Emmanuel Enrique Larraga Bueno Matricula: 1945008 Carrera: ITS*/


package tarea_22;
import java.util.Scanner;

public class Tarea_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in);
        System.out.println("Ingrese la cantidad de filas Matriz 1:");
        int fila_1 = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas Matriz 1:");
        int columna_1 = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de filas Matriz 2:");
        int fila_2 = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas Matriz 2:");
        int columna_2 = sc.nextInt();
        
    
        int [][] matriz_1 = new int[columna_1][fila_1];
        int [][] matriz_2 = new int[columna_2][fila_2];                 
        int [][] matriz_final= new int[fila_1][columna_2];
        
        System.out.println("------------ Matriz No.1 ------------");
        
        for (int i=0;i<fila_1;i++)
        {
            for (int j=0;j<fila_1;j++)
            {
                System.out.print("["+(i+1)+"]["+(j+1)+"] = ");
                matriz_1[i][j] = sc.nextInt();
                
            }
        }
        
        System.out.println("------------ Matriz No.2 ------------");
        
        for (int i=0;i<fila_2;i++)
        {
            for (int j=0;j<columna_2;j++)
            {
                System.out.print("["+(i+1)+"]["+(j+1)+"] = ");
                matriz_2[i][j] = sc.nextInt(); 
            }
        }
        
        System.out.println("------------ Matriz No.1 ------------");
        
        for (int i=0;i<fila_1;i++)
        {
            for (int j=0;j<columna_1;j++)
            {
                System.out.print("["+matriz_1[i][j]+"]");  
            }
            System.out.println(" ");
            
        }
        
        System.out.println("------------ Matriz No.2 ------------");
        
        for (int i=0;i<fila_2;i++)
        {
            for (int j=0;j<columna_2;j++)
            {
                System.out.print("["+matriz_2[i][j]+"]");
            }
            System.out.println("");
        }
        
        
        System.out.println("------------ Matriz Final ------------");
        
        for (int i=0;i<fila_1;i++)
        {
            for (int j=0;j<columna_2;j++)
            {
                for (int h=0;h<columna_1;h++)
                {
                    matriz_final[i][j] += matriz_1[i][h] * matriz_2[h][j];
                }
                System.out.print("["+matriz_final[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
   