import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Está logado? (true/false): ");
        boolean logado = sc.nextBoolean();

        if (!logado) {
            System.out.println("Faça login para continuar.");
        } else {
            System.out.println("Bem-vindo!");
        }

        sc.close();
    }
}