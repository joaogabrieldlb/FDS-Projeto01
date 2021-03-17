package src.main.java.Projeto01.model;

public class VeiculoUtilitario extends VeiculoImpl {
    private int capCargaTon;
    private int nroEixos;
    
    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaTon,
            int nroEixos) {
        super(placa, marca, modelo, ano, valor);
        this.capCargaTon = capCargaTon;
        this.nroEixos = nroEixos;
    }

    public int getCapCargaTon() {
        return capCargaTon;
    }

    public int getNroEixos() {
        return nroEixos;
    }

    @Override
    public String toString(){
        return super.toString() + "| Capacidade de carga(TON): "+ this.capCargaTon+"| Eixos: "+this.nroEixos;
    }
}
