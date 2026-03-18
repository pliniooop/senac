Pedro Henrique de Carvalho Servulo
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o código do produto: ");
        int codigo = entrada.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        double precoUnitario = 0;
        String nomeProduto = "";
        boolean codigoValido = true;

        // Processamento dos dados baseado na tabela
        switch (codigo) {
            case 100:
                nomeProduto = "Cachorro Quente";
                precoUnitario = 1.20;
                break;
            case 101:
                nomeProduto = "Bauru Simples";
                precoUnitario = 1.30;
                break;
            case 102:
                nomeProduto = "Bauru com ovo";
                precoUnitario = 1.50;
                break;
            case 103:
                nomeProduto = "Hambúrguer";
                precoUnitario = 1.20;
                break;
            case 104:
                nomeProduto = "Cheeseburguer";
                precoUnitario = 1.30;
                break;
            case 105:
                nomeProduto = "Refrigerante";
                precoUnitario = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
                codigoValido = false;
                break;
        }

        // Cálculo e Saída
        if (codigoValido) {
            double valorTotal = precoUnitario * quantidade;
            System.out.println("\n--- Resumo do Pedido ---");
            System.out.println("Produto: " + nomeProduto);
            System.out.printf("Valor total a pagar: R$ %.2f\n", valorTotal);
        }

        entrada.close();
    }
}
