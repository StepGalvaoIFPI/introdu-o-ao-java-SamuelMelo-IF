import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       Scanner entrada =  new Scanner(System.in);

       System.out.print("Digite o raio do circulo: ");
       float raio = entrada.nextFloat();

       float pi = 3.14f;
       float area = (float) (pi * Math.pow(raio, 2));

       System.out.println("Área: "+area);
    }
    
}
