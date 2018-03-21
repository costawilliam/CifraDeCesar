import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CifraDeCesar {

	public static void main(String[] args) {
	
        String TextoPlano;
        int Deslocamento;
        Scanner ler = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();        

        
        System.out.println("Informe o texto a ser criptografado:");
        TextoPlano = ler.nextLine();
        
        System.out.println("Informe o deslocamento:");
        Deslocamento = ler.nextInt();
        
        for(int i = 0;  i<= TextoPlano.length()-1; i++){
             int Codigo ;

             Codigo = (int) TextoPlano.toUpperCase().charAt(i); 
             
			/*  Não substitui caracteres cujo valor na tabela ASCII seja:
				inferior a 65 (letra A) 
                Superior a 90 (letra Z)
			*/
             if (Codigo < 65 || Codigo > 90){
                   sb.append((char) Codigo);  
             }else{
                if((Codigo + Deslocamento)>90){
                   Codigo = Codigo - 26;
                }
                sb.append((char) (Codigo + Deslocamento));                   
             }
        }          
        System.out.println("Texto criptografado: " + sb.toString());         
	}
    
}
