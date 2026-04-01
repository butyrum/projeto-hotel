public class SistemaReservas {
    private Reserva[] quartos = new Reserva[10];

    private int contador = 0;

    public boolean adicionar(Reserva r) {
        if (contador < 10) {
            quartos[contador] = r;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public void exibirTodos() {
        if (contador == 0) {
            System.out.println("O hotel está vazio.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println("Hóspede: " + quartos[i].getNomeHospede());
        }
    }
    public void buscarHospede(String nomeBusca) {
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (quartos[i].getNomeHospede().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Hóspede Encontrado!");
                System.out.println("Quarto: " + quartos[i].getQuantidadeDias() + " dias");
                System.out.println("Total a pagar: R$ " + quartos[i].calcularValorTotal());
                encontrado = true;
                break; // Já achou, não precisa continuar o loop
            }
        }

        if (!encontrado) {
            System.out.println("Hóspede não encontrado no sistema.");
        }
    }
    public void ordenarPorDias() {

        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {

                if (quartos[j].getQuantidadeDias() < quartos[j + 1].getQuantidadeDias()) {

                    Reserva temp = quartos[j];
                    quartos[j] = quartos[j + 1];
                    quartos[j + 1] = temp;
                }
            }
        }
        System.out.println("Lista ordenada por maior tempo de permanência!");
    }
}

