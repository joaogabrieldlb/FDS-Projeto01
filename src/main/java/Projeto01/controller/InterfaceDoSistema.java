package src.main.java.Projeto01.controller;

import java.util.List;
import java.util.Scanner;

import src.main.java.Projeto01.model.Veiculo;

public class InterfaceDoSistema {
    
    private List<Veiculo> listaDaConsulta;
    private CatalogoVeiculos cv;
    private Scanner sc = new Scanner(System.in);
    private String resposta;

    public InterfaceDoSistema() {
        cv = new CatalogoVeiculos();
        
    }

    public void executa() {
        while(true) {
            System.out.println("Seja bem-vindo a interface do sistema de veículos!" + System.lineSeparator());
            if(menuConsulta() == false) {
                break;
            }
        }
    }

    private boolean menuConsulta() {
        while(true) {
            System.out.println("--= Menu de Consulta =--" + System.lineSeparator());
            System.out.println("Digite:");
            System.out.println("1. Consultar por placa");
            System.out.println("2. Consultar por marca");
            System.out.println("3. Consultar por ano de \nfabricação");
            System.out.println("4. Consultar por tipo" + System.lineSeparator());
            System.out.println("------------------------");
            System.out.println("0. Sair");
            System.out.println("________________________");
            System.out.print("-> ");
            resposta = sc.nextLine();
            System.out.println();
            
            if(resposta.equals("0")) return false;

            if(resposta.equals("1") || resposta.equals("2") ||
             resposta.equals("3") || resposta.equals("4")) consulta(resposta);
            else System.out.println("Erro: Foi digitada uma opção inválida!" + System.lineSeparator() +
            "Tente novamente..." + System.lineSeparator());
        }
    }

    private boolean consulta(String tipoDaConsulta) {
        while(true) {
            if(tipoDaConsulta.equals("1")){
                if(consultaPorPlaca() == null) {
                    System.out.println("Erro: Veículo não encontrado no sistema!" + System.lineSeparator() +
                    "Tente novamente..." + System.lineSeparator());
                    return false;
                }
                System.out.println(consultaPorPlaca());
                return true;
            }

            //TODO: if(tipoDaConsulta.equals("2")) System.out.print("Marca do veículo: ");
            
            //TODO: if(tipoDaConsulta.equals("3")) System.out.print("Ano de Fabricação: ");
            /* TODO: if(tipoDaConsulta.equals("4")) {
                System.out.println("1. Veículo Passeio");
                System.out.println("2. Veículo Passageiros");
                System.out.println("3. Veículo Utilitário");
                System.out.print("Tipo do veículo: ");
            }
            */

            if(resposta.equals("0")) return false;
        }
    }

    private Veiculo consultaPorPlaca() {
        System.out.print("Número da placa: ");
        resposta = sc.nextLine();
        System.out.println();
        return cv.consultaPorPlaca(resposta);
    }

}
