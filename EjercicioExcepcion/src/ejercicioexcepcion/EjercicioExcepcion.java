
package ejercicioexcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioExcepcion {

  
     private double divisor;
    private double numero;
    
    public  EjercicioExcepcion(double divisor, double numero) throws Exception {
        if (numero < 10 || divisor < 10)
            throw new Exception("Tiene que dijitar un numero mayor a 10");
        this.numero = numero;
        this.divisor = divisor;
    }
 

    public static void main(String[] args) {
        
    System.out.println("(Prueba crear un exception) Ingrese un numero mayor a 10");
      int numero,divisor;
      double resultado;
      Scanner sc = new Scanner(System.in);
    try{
    
    System.out.println("Digite un numero");
    numero = (int) sc.nextDouble();
    System.out.println("Digite el divisor");
    divisor = (int) sc.nextDouble();
    EjercicioExcepcion persona1 = new EjercicioExcepcion(divisor, numero);
    resultado= numero/divisor;
    System.out.println("El resultado es= "  + resultado);
}
     catch(Exception ex){
     System.out.println("Digito algo que no es "+ex.getMessage());
     
    }
    aritmetico();
    }
    
    
    
    public static void aritmetico(){
        
    System.out.println(" Segundo ejercicio->  Digite un numero y su divisor");
        
      double numero,divisor;
      double resultado;
      Scanner sc = new Scanner(System.in);
        
        
     try{
    System.out.println("Digite un numero");
    numero = sc.nextDouble();
    System.out.println("Digite el divisor");
    divisor = sc.nextDouble();
    resultado= numero/divisor;
    System.out.println("El resultado es= "  + resultado);
}
catch(InputMismatchException ex){
System.out.println("No puedes dijitar letras  "+ex.getMessage());}
catch(ArithmeticException ex){
System.out.println("No puedes dividir por cero   "+ex.getMessage());}
    }
    
}
    
