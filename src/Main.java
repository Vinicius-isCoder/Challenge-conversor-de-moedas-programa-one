import java.util.Scanner;

public class Main {
    static void main() {
        String menu;
        menu = """
               
               
               Seja bem-vindo ao Conversor de Moeda 
               
               Escolha as opções abaixo para conversão
               
               1) Real -> Dolar
               2) Dolar -> Real
               3) Real -> Euro
               4) Euro -> Real
               5) Dolar -> Euro
               6) Euro -> Real
               7) Sair
                
               """;

        Scanner leitura = new Scanner(System.in);
        Requisicao req = new Requisicao();

        int opcaoDesejada = 0;

        while (opcaoDesejada != 7) {

            System.out.println(menu);

            if (!leitura.hasNextInt()) {
                System.out.println("Opção inválida!");
                leitura.next();
                continue;
            }

            opcaoDesejada = leitura.nextInt();

            try {
                switch (opcaoDesejada) {
                    case 1:
                        System.out.println("Digite o valor que deseja converter:");
                        double valor = leitura.nextDouble();
                        double taxaConversao = req.conversao("BRL", "USD");
                        double resultado = valor * taxaConversao;
                        System.out.println("O valor de " + valor + " [BRL] corresponde ao valor final de " + resultado + " [USD]");
                        break;
                    case 2:
                        System.out.println("Digite o valor que deseja converter:");
                        double valor2 = leitura.nextDouble();
                        double taxaConversao2 = req.conversao("USD", "BRL");
                        double resultado2 = valor2 * taxaConversao2;
                        System.out.println("O valor de " + valor2 + " [USD] corresponde ao valor final de " + resultado2 + " [BRL]");
                        break;
                    case 3:
                        System.out.println("Digite o valor que deseja converter:");
                        double valor3 = leitura.nextDouble();
                        double taxaConversao3 = req.conversao("BRL", "EUR");
                        double resultado3 = valor3 * taxaConversao3;
                        System.out.println("O valor de " + valor3 + " [BRL] corresponde ao valor final de " + resultado3 + " [EUR]");
                        break;
                    case 4:
                        System.out.println("Digite o valor que deseja converter:");
                        double valor4 = leitura.nextDouble();
                        double taxaConversao4 = req.conversao("EUR", "BRL");
                        double resultado4 = valor4 * taxaConversao4;
                        System.out.println("O valor de " + valor4 + " [EUR] corresponde ao valor final de " + resultado4 + " [BRL]");
                        break;
                    case 5:
                        System.out.println("Digite o valor que deseja converter:");
                        double valor5 = leitura.nextDouble();
                        double taxaConversao5 = req.conversao("USD", "EUR");
                        double resultado5 = valor5 * taxaConversao5;
                        System.out.println("O valor de " + valor5 + " [USD] corresponde ao valor final de " + resultado5 + " [EUR]");
                        break;
                    case 6:
                        System.out.println("Digite o valor que deseja converter:");
                        double valor6 = leitura.nextDouble();
                        double taxaConversao6 = req.conversao("EUR", "USD");
                        double resultado6 = valor6 * taxaConversao6;
                        System.out.println("O valor de " + valor6 + " [EUR] corresponde ao valor final de " + resultado6 + " [USD]");
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro ao fazer requisição: " + e.getMessage());
            }
        }
    }
}

