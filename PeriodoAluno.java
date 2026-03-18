import java.util.Scanner;

public class PeriodoAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char periodo; // variável para guardar a letra

        System.out.print("Digite o período (M/V/N): ");
        periodo = scanner.next().charAt(0); // lê a primeira letra

        switch (periodo) {
            case 'M':
            case 'm':
                System.out.println("Bom dia");
                break;
            case 'V':
            case 'v':
                System.out.println("Boa tarde");
                break;
            case 'N':
            case 'n':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}