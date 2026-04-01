import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        SistemaReservas sistema = new SistemaReservas();
        int opcao = 0;


        while (opcao != 5) {
            System.out.println("\n--- SISTEMA DE GESTÃO: HOTEL EBAC ---");
            System.out.println("1. Nova Reserva");
            System.out.println("2. Listar Todos os Hóspedes");
            System.out.println("3. Buscar Hóspede por Nome");
            System.out.println("4. Ordenar Lista (Mais Dias -> Menos Dias)");
            System.out.println("5. Sair do Sistema");
            System.out.print("Escolha uma opção: ");


            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("\n-- Cadastro de Reserva --");
                System.out.print("Nome do Hóspede: ");
                String nome = leitor.nextLine();

                System.out.print("Tipo do Quarto: ");
                String tipo = leitor.nextLine();

                System.out.print("Quantidade de Dias: ");
                int dias = leitor.nextInt();

                System.out.print("Valor da Diária: ");
                double valor = leitor.nextDouble();


                Reserva novaReserva = new Reserva(nome, tipo, dias, valor);

                if (sistema.adicionar(novaReserva)) {
                    System.out.println(">>> Sucesso: Reserva confirmada!");
                } else {
                    System.out.println(">>> Erro: Hotel sem vagas disponíveis (Limite: 10).");
                }

            } else if (opcao == 2) {
                sistema.exibirTodos();

            } else if (opcao == 3) {
                System.out.print("Digite o nome exato para busca: ");
                String nomeBusca = leitor.nextLine();
                sistema.buscarHospede(nomeBusca);

            } else if (opcao == 4) {
                sistema.ordenarPorDias();
                System.out.println(">>> Lista reordenada com sucesso!");

            } else if (opcao == 5) {
                System.out.println("Encerrando sistema... Até logo, Breno!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        leitor.close();
    }
}