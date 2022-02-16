import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class questao3 {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String palavra;
        int nmranagramas = 0;

        //criação de uma List para guardar as substrings
        ArrayList<String> a = new ArrayList<>();

        //requisição de valores para o usuário
        System.out.println("Digite a palavra: ");
        palavra = s.nextLine();

        //comandos de repetição para ir separando a string em substrings
        //primeiro comando de repetição para determinar o index da classe substring() junto com o segundo laço de repetição
        for(int i=1;i<=palavra.length();i++){

            //segundo comando de repetição para determinar o primeiro indice da classe substring()
            for(int j=0;j<=palavra.length();j++){

                //variável auxiliar para determinar o segundo indice da classe substring()
                int aux = j+i;

                //verificação para ver se a variável não vai exceder o tamanho da string
                if(aux > palavra.length()){
                    aux = palavra.length();
                }

                //verificação para não salvar substring com caracteres faltando
                if(palavra.substring(j,aux).length()==i){
                //adição da substring na List<>    
                a.add(palavra.substring(j,aux));
                }                
            }
            //for para a verificação de todas as substrings presentes na List<> para ver se há anagramas entre elas    
            for (int j=0;j<a.size();j++){

                for(int k=0;k<a.size();k++){

                    //separando as substrings em array de apenas char para organizar elas posteriormente
                    char[] string1=a.get(k).toCharArray();
                    char[] string2=a.get(j).toCharArray();
                    //organizando os arrays para comparar posteriormente
                    Arrays.sort(string1); 
                    Arrays.sort(string2);

                    //comparação dos arrays para ver se são anagramas
                    if(Arrays.equals(string1, string2)){

                        //verificação para que não se salve valores do mesmo indice ex: o indice 0 comparado ao indice 0 é anagrama pois é literalmente o mesmo valor
                        if(k == j){}else{

                        System.out.println(a.get(k)+" Range: "+k+" ------ "+a.get(j)+" Range: "+j);  
                        nmranagramas++;
                        //remoção dos valores ja comprovados que são anagramas para não serem comparados novamente
                        a.remove(k);

                        }
                    }     
                }
            }
        }
        System.out.println("Há: "+nmranagramas+ " Anagramas");
    }
}
