import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        double distancia;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual será a distância percorrida pelo entregador?(em Kilometros)");
        distancia = scanner.nextDouble();

        System.out.print("Escolha o tipo de frete: (1)Economico  (2)Expresso");
        int tipo = scanner.nextInt();
        FormaFrete resultado = null;

        if (tipo == 1){
            resultado = new Economico();
        }

        else if(tipo == 2){
            resultado = new Expresso();
        }
        else{
            System.out.println("Escolha uma opção válida");
            return;
        }

        double valorFinal = resultado.calculaPreco(distancia);
        System.out.println(valorFinal);

    }

}
