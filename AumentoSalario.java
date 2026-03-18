import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char plano;
        double salario, novoSalario = 0;

        System.out.print("Digite o plano (A, B ou C): ");
        plano = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário atual: ");
        salario = sc.nextDouble();

        if (plano == 'A') {
            novoSalario = salario * 1.10;
        } else if (plano == 'B') {
            novoSalario = salario * 1.15;
        } else if (plano == 'C') {
            novoSalario = salario * 1.20;
        } else {
            System.out.println("Plano inválido!");
            return;
        }

        System.out.println("Novo salário: " + novoSalario);

        sc.close();
    }
}