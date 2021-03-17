import java.util.Scanner;

public class InterfaceDoSistema {
    
    private boolean loop = true;
    private Scanner sc = new Scanner(System.in);
    private String resposta;

    public void executa() {
        while(loop == true) {
            try{
                System.out.println("Seja bem-vindo a interface do sistema de veículos!");
                resposta = sc.next();
                System.out.println("");
                System.out.println("");
            } catch(Exception e) {
                System.err.println(e);
            }
        }
        
    }

}
