/*
 * Utilizei IA generativa para esclarecer dúvidas durante a construção do programa.
 * As sugestões foram analisadas e adaptadas conforme meu entendimento.
 * O código foi organizado em classes e métodos para facilitar sua utilização.
 */

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
            System.out.println("4 - Sobre");
            System.out.println("5 - Sair");

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
                    Sobre();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 5);
    }

    public void Sobre() {

        System.out.println("\n===== SOBRE O SISTEMA =====");

        System.out.println("Versão do Java: " + System.getProperty("java.version"));

        System.out.println("Este programa pode funcionar em diferentes sistemas operacionais porque utiliza a JVM, que permite executar o mesmo bytecode em diferentes ambientes, sem precisar alterar o código original.");
    }
}