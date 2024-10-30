import java.util.Scanner;

public class Menu {

    /**
     * Crie uma estrutura de menu para os dois algoritmos criados,
     * em que o usuário deve escolher uma opção para calcular o IMC
     * e outra para calcular o metabolismo. Também deve haver uma
     * opção para o escape do programa.

     * Crie um algoritmo para identificar se o número é PAR ou
     * ÍMPAR e acrescente na estrutura do programa anterior
     * atribuindo a opção de MENU ‘NUMERO’.
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Escolha a opção que você deseja:");
            System.out.println("[1] Calcular IMC");
            System.out.println("[2] Calcular Metabolismo Basal");
            System.out.println("[3] Verificar se um número é PAR ou ÍMPAR");
            System.out.println("[4] Sair");

            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Opção para calcular o IMC escolhida.");
                    calcularIMC(scanner);
                    break;
                case "2":
                    System.out.println("Opção para calcular o metabolismo basal escolhida.");
                    calcularMetabolismo(scanner);
                    break;
                case "3":
                    System.out.println("Opção para verificar se um número é PAR ou ÍMPAR escolhida.");
                    verificarParOuImpar(scanner);
                    break;
                case "4":
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (!opcao.equals("4"));
    }

        public static void calcularIMC(Scanner scanner) {
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
    }

    public static void calcularMetabolismo(Scanner scanner) {
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
     }

     public static void verificarParOuImpar(Scanner scanner) {
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }
    }
}



