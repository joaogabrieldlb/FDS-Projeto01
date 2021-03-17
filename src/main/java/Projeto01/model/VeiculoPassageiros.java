package src.main.java.Projeto01.model;

public class VeiculoPassageiros extends VeiculoImpl {
    private int nroPass;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPass) {
        super(placa, marca, modelo, ano, valor);
        this.nroPass = nroPass;
    }
    
    public int getNroPass() {
        return nroPass;
    }

    public void setNroPass(int nroPass) {
        this.nroPass = nroPass;
    }
}
