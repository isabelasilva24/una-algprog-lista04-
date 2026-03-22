import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Possui carteira? (true/false): ");
        boolean carteira = sc.nextBoolean();

        if (idade >= 18 && carteira) {
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir.");
        }

        sc.close();
    }
}