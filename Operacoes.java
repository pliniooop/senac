import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, resultado = 0;
        char opcao;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.print("Escolha a operação (M/S/P/D): ");
        opcao = sc.next().toUpperCase().charAt(0);

        if (opcao == 'M') {
            resultado = (n1 + n2) / 2;
        } else if (opcao == 'S') {
            if (n1 > n2) {
                resultado = n1 - n2;
            } else {
                resultado = n2 - n1;
            }
        } else if (opcao == 'P') {
            resultado = n1 * n2;
        } else if (opcao == 'D') {
            if (n2 != 0) {
                resultado = n1 / n2;
            } else {
                System.out.println("Erro: divisão por zero");
                return;
            }
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}