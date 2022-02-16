import java.util.Scanner;
public class questao2 {
     public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int nmrcaractersenha;
        int nmrdecaracteresfaltando;
        String senha;

        //requsição de valores para o usuário
        System.out.println("Digite a sua senha: ");
        senha = s.nextLine();

        //pegando o número de caracteres da string
        nmrcaractersenha = senha.length();
        
        //comparando para ver se a senha tem o necessario para ser uma senha forte (mais de 6 caracteres)
        //se for, aparecerá a mensagem dizendo que é segura
        //se não, aparecera o número de caracteres faltando para ser uma senha segura
        if(nmrcaractersenha>=6){
            nmrdecaracteresfaltando = 6 - nmrcaractersenha;
            System.out.println("A senha é segura: "+nmrdecaracteresfaltando);
        }else{
            nmrdecaracteresfaltando = 6 - nmrcaractersenha;
            System.out.println(nmrdecaracteresfaltando);
        }           
    }
}    

