import java.util.Scanner;

public class MenuLogistica {

    Scanner scanner = new Scanner(System.in);

    ConversorUnidades conversor = new ConversorUnidades();
    ClassificadorPedidoWhile classificador = new ClassificadorPedidoWhile();

    public void executar() {

        int opcao;

        do {

            System.out.println("\n===== MENU LOGÍSTICA =====");
            System.out.println("1 - Converter temperatura");
            System.out.println("2 - Converter distância");
            System.out.println("3 - Classificar pedidos");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();

                    double fahrenheit = conversor.converterTemp(celsius);

                    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

                    System.out.print("Digite o valor de referência: ");
                    double referencia = scanner.nextDouble();

                    conversor.verificarTemp(fahrenheit, referencia);
                    break;

                case 2:
                    System.out.print("Digite a distância em quilômetros: ");
                    double km = scanner.nextDouble();

                    double milhas = conversor.converterKm(km);

                    System.out.println("Distância em milhas: " + milhas);
                    break;

                case 3:
                    classificador.classificarPedidos(scanner);
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 4);
    }
}