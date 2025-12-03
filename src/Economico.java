public class Economico implements FormaFrete{
    @Override
    public double calculaPreco(double distancia, double peso) {
        return (distancia * 2) + 0.2 * peso;
    }
}
