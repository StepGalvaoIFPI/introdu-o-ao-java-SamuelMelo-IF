import java.util.Scanner;

public class Q07 {
    public static void main(String[] arsg){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite a distancia a ser percorrida em Km: ");
        double distancia = entrada.nextDouble();

        System.out.print("Digite a velocidade do automovel em Km: ");
        double velocidade = entrada.nextDouble();

        double tempo = (distancia / velocidade);

        System.out.println("Tempo: " + tempo + " hr");
    }
}
