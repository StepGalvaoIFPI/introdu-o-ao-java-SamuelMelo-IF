import java.util.Scanner;
public class Q06 {
    public static void main(String[] arsg){
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: ");
        double salario = entrada.nextDouble();

        double imposto = ( 10.0/100.0 * salario);

        double desconto = (salario - imposto);

        System.out.println("Salário: "+salario);
        System.out.println("Valor do imposto: "+imposto);
        System.out.println("Salário final:"+desconto);
    }  
}
