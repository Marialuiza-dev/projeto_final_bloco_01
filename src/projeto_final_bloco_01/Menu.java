package projeto_final_bloco_01;

import java.util.Scanner;
import projeto_final_bloco_01.util.Cores;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println(Cores.ANSI_PURPLE_BACKGROUND_BRIGHT + Cores.TEXT_WHITE + "*******************************************" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_CYAN + "                                           ");
            System.out.println("        🕯️ E-COMMERCE DE VELAS 🕯️         ");
            System.out.println("                                           ");
            System.out.println(Cores.ANSI_PURPLE_BACKGROUND_BRIGHT + Cores.TEXT_WHITE + "*******************************************" + Cores.TEXT_RESET);
            System.out.println("                                           ");
            System.out.println(Cores.TEXT_WHITE + "1 - Cadastrar vela");
            System.out.println("2 - Listar todas as velas");
            System.out.println("3 - Buscar vela por ID");
            System.out.println("4 - Atualizar vela");
            System.out.println("5 - Deletar vela");
            System.out.println("0 - Sair");
            System.out.println("                                           ");
            System.out.println(Cores.ANSI_PURPLE_BACKGROUND_BRIGHT + Cores.TEXT_WHITE + "*******************************************" + Cores.TEXT_RESET);
            System.out.print(Cores.TEXT_YELLOW_BRIGHT + "Escolha uma opção: " + Cores.TEXT_RESET);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_GREEN + "Cadastrar vela..." + Cores.TEXT_RESET);
                    break;
                case 2:
                    System.out.println(Cores.TEXT_GREEN + "Listar velas..." + Cores.TEXT_RESET);
                    break;
                case 3:
                    System.out.println(Cores.TEXT_GREEN + "Buscar por ID..." + Cores.TEXT_RESET);
                    break;
                case 4:
                    System.out.println(Cores.TEXT_GREEN + "Atualizar vela..." + Cores.TEXT_RESET);
                    break;
                case 5:
                    System.out.println(Cores.TEXT_GREEN + "Deletar vela..." + Cores.TEXT_RESET);
                    break;
                case 0:
                    System.out.println(Cores.TEXT_WHITE + "Programa finalizado!" + Cores.TEXT_RESET);
                    break;
                default:
                    System.out.println(Cores.TEXT_YELLOW_BRIGHT + "Opção inválida!" + Cores.TEXT_RESET);
                    break;
            }

        } while (opcao != 0);

        System.out.println("\nDesenvolvido por Maria Luiza Torres");
        System.out.println("GitHub: github.com/MariaLuiza-dev");

        scanner.close();
    }
}