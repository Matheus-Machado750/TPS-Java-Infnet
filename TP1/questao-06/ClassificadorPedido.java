import java.util.Scanner;

public class ClassificadorPedido {
    Scanner scanner = new Scanner(System.in);

    double peso;
    double limiteSuperior = 100.0; //Para classificar um pedido como urgente
    //Para classificar um pedido padrão é só ele estar entre os 2 limites
    double limiteInferior = 20.0; //Para classificar um pedido como leve

    public ClassificadorPedido(){
        System.out.print("Informe o peso do pedido (Apenas números): ");
        this.peso = scanner.nextDouble();
    }

    void validarCategoria(){
        if(this.peso < 0){
            System.out.println("O peso não pode ser negativo.");
        }

        else if(this.peso > limiteSuperior){
            System.out.println("Pedido de prioridade URGENTE!");
        }

        else if(this.peso < limiteInferior){
            System.out.println("Pedido de prioridade LEVE.");
        }

        else{
            System.out.println("Pedido de prioridade PADRÃO.");
        }
    }
}
