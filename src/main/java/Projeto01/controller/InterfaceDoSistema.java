import java.util.Scanner;

public class InterfaceDoSistema {
    
    private boolean loop = true;

    public void executa() {
        while(loop == true) {
            try{
                System.out.println("Seja bem-vindo a interface do sistema de veículos!" + System.lineSeparator());
                consultaVeiculo();
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void consultaVeiculo() throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("--= Menu de Consulta =--");
            System.out.println("1. Consultar por placa");
            System.out.println("2. Consultar por marca");
            System.out.println("3. Consultar por ano de fabrica");

            String resposta = sc.nextLine();
            
        }
    }

}
