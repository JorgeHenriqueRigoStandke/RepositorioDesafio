import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int sair = 1;

        do{

            //requisição de valores para o usuário
            System.out.println("Digite o número de entrada: ");
            int n = s.nextInt();

            //comando de repetição, para repetir quantas vezes for o numero de entrada
            for(int i=1;i<=n;i++){

                //comando de repetição para printar o número de espaços de forma decrescente (número de entra menos um (para dar espaço ao primeiro asterisco))
                for(int j=0;j<n-i;j++){

                    System.out.print(" ");

                }
                //comando de repetição para printar o número de asteriscos de forma crescente
                for(int k=0;k<i;k++){

                    System.out.print("*");

                }   
            System.out.println("");                      
            }

            //sistema de menu de repetição
            do{

                System.out.println("Repetir?  Sim[1] Não[0]");  
                 sair = s.nextInt();  

            }while(sair>1 || sair<0);  
                      
        }while(sair==1);
    }
}
