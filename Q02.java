import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
       Scanner entrada =  new Scanner(System.in);

       System.out.print("Digite a altura: ");
       float altura = entrada.nextFloat();

       System.out.print("Digite a base: ");
       float base = entrada.nextFloat();

       float area = (altura * base)/2;
       float perimetro = (altura * 2) + (base * 2);

       System.out.println("Área: "+area);
       System.out.println("Perímetro: "+perimetro);
    }
    
}
