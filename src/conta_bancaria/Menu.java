package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
        
        int opcao;

        while (true) {
            System.out.println(Cores.TEXT_YELLOW_BRIGHT + Cores.BG_BLACK + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                  BANCO DO BRASIL COM Z              ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("             1 - Criar Conta                         ");
            System.out.println("             2 - Listar todas as Contas              ");
            System.out.println("             3 - Buscar Conta por Numero             ");
            System.out.println("             4 - Atualizar Dados da Conta            ");
            System.out.println("             5 - Apagar Conta                        ");
            System.out.println("             6 - Sacar                               ");
            System.out.println("             7 - Depositar                           ");
            System.out.println("             8 - Transferir valores entre Contas     ");
            System.out.println("             9 - Sair                                ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.print(Cores.TEXT_RESET + "Entre com a opção desejada: ");
            
            opcao = leia.nextInt();

            if (opcao == 9) {
                System.out.println(Cores.TEXT_GREEN_BRIGHT + "\nBanco do Brasil com Z - O seu futuro começa aqui!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Buscar Conta por Número\n\n");
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar Dados da Conta\n\n");
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar Conta\n\n");
                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE + "Sacar\n\n");
                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE + "Transferir valores entre Contas\n\n");
                    break;
                default:
                    System.out.println(Cores.TEXT_RED + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    break;
            }
        }
    }
}