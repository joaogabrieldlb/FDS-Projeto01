package src.main.java.Projeto01.controller;

import java.util.List;
import java.util.Scanner;

import src.main.java.Projeto01.model.Veiculo;

public class InterfaceDoSistema {
    
    private boolean loop;
    private List<Veiculo> listaConsulta;
    private CatalogoVeiculos cv;

    public InterfaceDoSistema() {
        loop = true;
        cv = new CatalogoVeiculos();
    }

    public void executa() {
        while(loop == true) {
            System.out.println("Seja bem-vindo a interface do sistema de veículos!" + System.lineSeparator());
            if(consultaVeiculo() == false) {
                loop = false;
            }
        }
    }

    private boolean consultaVeiculo() {
        while(loop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--= Menu de Consulta =--");
            System.out.println("1. Consultar por placa");
            System.out.println("2. Consultar por marca");
            System.out.println("3. Consultar por ano de fabrica");
            System.out.println("4. Consultar por tipo");
            System.out.print(": ");
            String respostaNum = sc.nextLine();
            System.out.println();
            
            if(respostaNum.equals("0")) { sc.close(); return false; }

            if(respostaNum.equals("1") || respostaNum.equals("2") ||
             respostaNum.equals("3") || respostaNum.equals("4")) {
                if(respostaNum.equals("1")) System.out.print("Número da placa: ");
                if(respostaNum.equals("2")) System.out.print("Marca do veículo: ");
                if(respostaNum.equals("3")) System.out.print("Ano de Fabricação: ");
                if(respostaNum.equals("4")) {
                    System.out.println("1. Veículo Passeio");
                    System.out.println("2. Veículo Passageiros");
                    System.out.println("3. Veículo Utilitário");
                    System.out.print("Tipo do veículo: ");
                }
               	String consultaInfo = sc.nextLine();
                
                if(respostaNum.equals("4") && consultaInfo.equals("1")) consultaInfo = "VeiculoPasseio";
                if(respostaNum.equals("4") && consultaInfo.equals("2")) consultaInfo = "VeiculoPassageiros";
                if(respostaNum.equals("4") && consultaInfo.equals("3")) consultaInfo = "VeiculoUtilitario";

                System.out.println();
                switch(respostaNum) {
                    case "1":
                    // TODO: if(cv.consultaPorPlaca(consultaInfo) == null) ;
                    break;
                    case "2":
                    listaConsulta = cv.consultaPorMarca(consultaInfo);
                    break;
                    case "3":
                    listaConsulta = cv.consultaPorAno(Integer.parseInt(consultaInfo));
                    break;
                    case "4":
                    listaConsulta = cv.consultaPorTipo(consultaInfo);
                }
    
                listaConsulta.forEach(veiculo -> {
                    System.out.println(veiculo);
                });
                sc.close();
                return true;
            } else {
                System.out.println("Erro: Foi digitado um número inválido!");
            }
            sc.close();
            break;
        }
        return false;
    }

}
