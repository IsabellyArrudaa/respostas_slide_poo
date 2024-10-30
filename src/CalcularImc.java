import java.util.Scanner;

public class CalcularImc {
 
    /**
     * Solicite ao usuário a entrada do nome;
     * Solicite ao usuário a entrada do peso do mesmo em Kg;
     * Solicite ao usuário a entrada da altura do mesmo em metros;
     * Informe a saída exibindo o IMC.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Sua altura em metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);

        System.out.printf(" %s! Seu IMC é: %.2f%n", nome, imc);

        String classificacao;
        if (imc < 19) {
            classificacao = "Abaixo do Peso";
        } else if (imc < 25) {
            classificacao = "Peso Normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 40) {
            classificacao = "Obesidade do tipo I";
        } else {
            classificacao = "Obesidade Mórbida";
        }

        System.out.printf("Classificação: %s%n" + classificacao);

        scanner.close();
    }
}
