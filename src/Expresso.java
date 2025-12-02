public class Expresso implements FormaFrete{
    @Override
    public double calculaPreco(double distancia) {
        return distancia * 5;
    }
}