package src.main.java.Projeto01.controller;

import java.util.ArrayList;
import java.util.List;

public class CatalogoVeiculos {
    private List<Veiculo> veiculos;
    
    public CatalogoVeiculos() {
        this.veiculos = new ArrayList<>();
        
    }
    


    public Veiculo consultaPorPlaca(String placa){
        return veiculos.stream()
            .filter(f -> f.getPlaca().equals(placa))
            .findAny()
            .orElse(null);
    }

    public List<Veiculo> consultaPorMarca(String marca){
        return veiculos.stream()
            .filter(f -> f.getMarca().equals(marca))
            .collect();
    }

    public List<Veiculo> consultaPorAno(int ano){
        return veiculos.stream()
            .filter(f -> f.getAno() == ano)
            .collect();
    }

    public List<Veiculo> consultaPorTipo(String tipo){
        return veiculos.stream()
            .filter(f -> f.getClass().getSimpleName().equals(tipo))
            .collect();
    }

    
    


}
