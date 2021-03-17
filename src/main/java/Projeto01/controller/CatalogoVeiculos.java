package src.main.java.Projeto01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import src.main.java.Projeto01.model.*;

public class CatalogoVeiculos {
    private List<Veiculo> veiculos;
    
    public CatalogoVeiculos() {
        this.veiculos = new ArrayList<>();
        veiculos.add(new VeiculoPasseio("PAS0001", "Volkswagen", "Gol", 2020, 54150.5, 12.5));
        veiculos.add(new VeiculoPasseio("PAS0002", "Renault", "Kwid", 2021, 39390.0, 14.8));
        veiculos.add(new VeiculoPasseio("PAS0003", "Fiat", "Mobi", 2020, 40449.0, 15.1));
        veiculos.add(new VeiculoPasseio("PAS0004", "Hyundai", "HB20S", 2021, 59590.1, 10.2));
        veiculos.add(new VeiculoPasseio("PAS0005", "Ford", "Ka", 2019, 51990.0, 13.9));
        veiculos.add(new VeiculoUtilitario("UTI1001", "Fiat", "Fiorino", 2019, 69790.1, 650, 2));
        veiculos.add(new VeiculoUtilitario("UTI1002", "Renault", "Partner", 2019, 79990.9, 800, 2));
        veiculos.add(new VeiculoUtilitario("UTI1003", "Mercedes", "415", 2021, 127330.0, 1480, 2));
        veiculos.add(new VeiculoUtilitario("UTI1004", "Fiat", "Strada", 2020, 61950.5, 705, 2));
        veiculos.add(new VeiculoUtilitario("UTI1005", "Volkswagen", "Saveiro", 2020, 70550.1, 712, 2));
        veiculos.add(new VeiculoPassageiros("BUS2001", "Citroen", "e-Spacetourer", 2022, 221750.1, 9));
        veiculos.add(new VeiculoPassageiros("BUS2002", "Mercedes", "Sprinter", 2020, 225749.5, 19));
        veiculos.add(new VeiculoPassageiros("BUS2003", "Fiat", "Doblo", 2018, 106590.9, 7));
        veiculos.add(new VeiculoPassageiros("BUS2004", "Fiat", "Ducato", 2012, 75100.2, 16));
        veiculos.add(new VeiculoPassageiros("BUS2005", "Renault", "Master", 2017, 143000.0, 16));
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
            .collect(Collectors.toList());
    }

    public List<Veiculo> consultaPorAno(int ano){
        return veiculos.stream()
            .filter(f -> f.getAno() == ano)
            .collect(Collectors.toList());
    }

    public List<Veiculo> consultaPorTipo(String tipo){
        return veiculos.stream()
            .filter(f -> f.getClass().getSimpleName().equals(tipo))
            .collect(Collectors.toList());
    }
}
