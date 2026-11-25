public class Main {
    public static void main(String[] args) {

    ConversorUnidades Temperatura = new ConversorUnidades();

    Temperatura.celcius = 50.0;
    Temperatura.valorFahrenheit = 122.0;

    double valorConvertido = Temperatura.converterTemp(Temperatura.celcius);

    Temperatura.verificarTemp(valorConvertido, Temperatura.valorFahrenheit);

    }
}