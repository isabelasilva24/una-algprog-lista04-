import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = sc.next();

        if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("domingo")) {
            System.out.println("É fim de semana!");
        } else {
            System.out.println("Dia útil.");
        }

        sc.close();
    }
}