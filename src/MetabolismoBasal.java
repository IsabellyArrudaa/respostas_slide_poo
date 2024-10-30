import java.util.Scanner;

public class MetabolismoBasal {

    /**
     * Solicite ao usuário a identificação de gênero;
     * Solicite ao usuário a entrada da idade em anos;
     * Informe a saída exibindo o metabolismo em Kcal.
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Informe seu gênero (Masculino ou Feminino): ");
        String genero = scanner.next();

        genero = genero.toLowerCase();

        System.out.print("Informe seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe sua idade em anos: ");
        int idade = scanner.nextInt();

        double metabolismoBasal = 0;

        if (genero.equals("masculino")) {
            if (idade >= 18 && idade <= 30) {
                metabolismoBasal = 15.057 * peso + 679;
            } else if (idade >= 30 && idade <= 60) {
                metabolismoBasal = 11.6 * peso + 879;
            } else if (idade > 60) {
                metabolismoBasal = 13.5 * peso + 487;
            }
        } else if (genero.equals("feminino")) {
            if (idade >= 18 && idade <= 30) {
                metabolismoBasal = 14.7 * peso + 486.6;
            } else if (idade >= 30 && idade <= 60) {
                metabolismoBasal = 8.7 * peso + 829;
            } else if (idade > 60) {
                metabolismoBasal = 10.5 * peso + 596;
            }
        } else {
            System.out.println("Gênero inválido. Por favor, informe 'Masculino' ou 'Feminino'.");
            scanner.close();
            return;
        }
        System.out.printf("Seu metabolismo basal é: %.2f Kcal%n", metabolismoBasal);

        scanner.close();
    }
}