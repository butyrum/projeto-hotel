public class Reserva {

    private String nomeHospede;
    private String tipoQuarto;
    private int quantidadeDias;
    private double valorDiaria;

    public Reserva(String nomeHospede, String tipoQuarto, int quantidadeDias, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.quantidadeDias = quantidadeDias;
        this.valorDiaria = valorDiaria;
    }

    public double calcularValorTotal() {
        return this.quantidadeDias * this.valorDiaria;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
}