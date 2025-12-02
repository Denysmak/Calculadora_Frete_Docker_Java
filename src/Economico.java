public class Economico implements FormaFrete{
    @Override
    public double calculaPreco(double distancia) {
        return distancia * 2;
    }
}
