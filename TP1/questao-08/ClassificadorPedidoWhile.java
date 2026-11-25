import java.util.Scanner;

public class ClassificadorPedidoWhile {

    double limiteSuperior = 100.0;
    double limiteInferior = 20.0;

    public void classificarPedidos(Scanner scanner) {

        int quantUrgente = 0;
        int quantPadrao = 0;
        int quantLeve = 0;

        while (true) {

            System.out.print("Digite o peso do pedido (-1 para sair): ");
            double peso = scanner.nextDouble();

            if (peso == -1) {
                break;
            }

            if (peso < 0) {
                System.out.println("Peso inválido.");
                continue;
            }

            if (peso > limiteSuperior) {
                System.out.println("Pedido URGENTE!");
                quantUrgente++;
            }

            else if (peso < limiteInferior) {
                System.out.println("Pedido LEVE.");
                quantLeve++;
            }

            else {
                System.out.println("Pedido PADRÃO.");
                quantPadrao++;
            }
        }

        System.out.println("\n===== ESTATÍSTICAS =====");
        System.out.println("Pedidos urgentes: " + quantUrgente);
        System.out.println("Pedidos padrão: " + quantPadrao);
        System.out.println("Pedidos leves: " + quantLeve);
    }
}