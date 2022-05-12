/*Alumno: Emmanuel Enrique Larraga Bueno Matricula: 1945008 Carrera: ITS*/


package tarea_21;
import java.util.Scanner;

public class Tarea_21 {

    public static void main(String[] args) {
        
        Scanner matrizx=new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de filas:");   int Filas =matrizx.nextInt();
		System.out.println("Ingrese la cantidad de Columnas: ");  int Columnas=matrizx.nextInt();
		
		int Matriz_1[][]=new int[Filas][Columnas];   
		int Matriz_2[][]=new int[Filas][Columnas];


		System.out.println("    Matriz No.1: ");

		for(int i=0;i<Filas;i++)
                {
			for(int j=0;j<Columnas;j++)
                        {
				System.out.print("["+(i+1)+"]["+(j+1)+"] = ");
				Matriz_1[i][j]=matrizx.nextInt();   			
			}
			System.out.println();
		}
                
		System.out.println("    Matriz No.2: ");
                
		for(int i=0;i<Filas;i++)
                {
			for(int j=0;j<Columnas;j++)
                        {
				System.out.print("["+(i+1)+"]["+(j+1)+"] = ");
				Matriz_2[i][j]=matrizx.nextInt();  				
			}
			System.out.println();
		}
                
                
		int Suma_matriz[][]=new int[Filas][Columnas];
                
		for(int i=0;i<Filas;i++)
                {
			for(int j=0;j<Columnas;j++)
                        {
				Suma_matriz[i][j]=Matriz_1[i][j]+Matriz_2[i][j];
			}
		}

                
	        System.out.println("      Matriz Final:");
		
		for(int i=0;i<Filas;i++)
                {
			for(int j=0;j<Columnas;j++)
                        {
				System.out.print("["+Matriz_1[i][j]+"]");
			}

                        System.out.print("   +   ");
                        
                        
			for(int j=0;j<Columnas;j++)
                        {
				System.out.print("["+Matriz_2[i][j]+"]");
			}
                        
                        System.out.print("   =   ");
                        
                        
			for(int j=0;j<Columnas;j++)
                        {
				System.out.print("["+Suma_matriz[i][j]+"]");
			}
			System.out.println("");

       
		}
                
	}
}

