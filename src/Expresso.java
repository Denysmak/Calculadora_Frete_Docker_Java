public class Expresso implements FormaFrete{
    @Override
    public double calculaPreco(double distancia, double peso) {
        return (distancia * 5) + 0.5 * peso;
    }
}