import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor, desconto, resultado;

        System.out.println("Entre com o valor do produto: ");
        valor = scanner.nextDouble();

        System.out.println("Entre com a porcentagem de desconto: \n(não precisa inlcuir o simbolo de porcentagem -> %)");
        desconto = scanner.nextDouble();

        resultado = (desconto / 100) * valor;

        System.out.println(
                "O desconto de " + desconto + "%" + " do valor de R$" + valor + "\n" + " foi de: R$" + resultado
        );

        scanner.close();
    }
}