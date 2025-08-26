/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartagenaaltamirano_250825;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ingresar_datos();
        
    
        
    }
    
    public static void ingresar_datos(){
        
        //INICIALIZACION DE LA CLASE SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //DECLARACION DE VARIABLE A UTILIZAR
        int [] edades = new int[10];
        int suma = 0;
        int total_pares = 0;
        int total_impares = 0;
        
        //MENSAJE AL USUARIO
        System.out.println("Ingrese "+edades.length+" edades");
        
        // SE RECORRE EL ARREGLO PARA ASIGNAR VALOR A CADA ELEMENTO
        for(int i = 0; i < edades.length; i++){
            //SE SOLICITA AL USUARIO EL INGRESO DE UN VALOR
            System.out.println("Edad "+i+": ");
            
            // SE LEE DESDE TECLADO EL VALOR DIGITADO POR EL USUARIO
            // Y SE ASIGNA A LA VARIABLE DE EDAD QUE CORRESPONDE SEGUN
            // LA POSICION EN LA ITERACION
            edades[i] = scanner.nextInt();
            
            // PARA CALCULAR EL PROMEDIO, SE REQUIERE SUMAR TODAS LAS
            // EDADES REGISTRADAS EN CADA ELEMENTO
            suma+= edades[i];
            
            // ESTABLECER SI EL VALOR DIGITADO ES PAR O IMPAR
            // PARA ELLOS SE CALCULA EL MODULO DEL NUMERO DIGITADO
            if((edades[i] %2) == 0) {
                // ES PAR
                // SE INCREMENTA LA VARIABLE ACUMULADORA
                total_pares++;
            }else{
                // ES IMPAR 
                // SE INCREMENTA LA VARIABLE ACUMULADORA
                total_impares++;
            }
            
            
        }
        
        // SE CALCULA EL PROMEDIO DE LAS EDADES
        double promedio = (double)suma/edades.length;
        
        // SE IMPRIME LA SALIDA
        System.out.println("Usted a ingresado: "+edades.length+" edades");
        System.out.println("El promedio de las edades ingresadas es: "+promedio);
        System.out.println("Ingreso: "+total_pares+" edades pares y "+total_impares+" edades impares");
        
        // SE CIERRA EL OBJETO DE TIPO Scanner, PORQUE YA NO HABRA MAS LECTURA
        scanner.close();
    }
    
    
}
