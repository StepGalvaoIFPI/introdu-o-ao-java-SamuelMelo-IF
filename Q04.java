import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
       Scanner entrada =  new Scanner(System.in);

       System.out.print("Digite os graus celsius: ");
       double c = entrada.nextDouble();

       double fahrenheit = (c * 1.8 + 32.0);
       double kelvin = (fahrenheit + 459.67)/1.8;

       System.out.println("Em Celsius: "+c);
       System.out.println("Em Fahrenheit: "+fahrenheit);
       System.out.println("Em Kelvin: "+kelvin);
    }
}
