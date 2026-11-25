public class ConversorUnidades {
    public double celcius;
    public double quilometros;
    public double valorFahrenheit;

    //Metódos para conversão

    public double converterTemp(double celcius){
        return celcius * 1.8 + 32;
    }

    public double converterKm(double quilometros){
        return quilometros * 0.62;
    }

    //Pelo visto é só de temperatura

    public void verificarTemp(double valorTempConvertido, double valorFahrenheit){

        if(valorTempConvertido > valorFahrenheit){
            System.out.println("O resultado calculado foi maior que o valor de referência.");
        }
        else if (valorTempConvertido < valorFahrenheit){
            System.out.println("O resultado calculado foi menor que o valor de referência.");
        }
        else{System.out.println("O resultado calculado foi igual ao valor de referência.");}
    }
}