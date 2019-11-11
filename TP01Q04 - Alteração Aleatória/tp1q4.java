/*
@date:06/02/2019
@author:Lincoln Antunes Nogueira Coutinho
@param:nenhum
@return:nenhum
@Copyright notice:main
*/
import java.util.Random;
public class tp1q4{
        public static void main(String[] args){
                String[] entrada = new String[1000];
                int numEntrada=0;
                do{
                        entrada[numEntrada]= MyIO.readLine();
                }while(!ehIgual (entrada[numEntrada++],"FIM") ) ;
		numEntrada--;
		Random gerador= new Random();
		gerador.setSeed(4);
               for(int i=0;i<numEntrada;i++){
                        MyIO.println(alteracaoAleatoria(entrada[i],((char) ('a' + (Math.abs(gerador.nextInt()) % 26))),((char) ('a' + (Math.abs(gerador.nextInt()) % 26))) ) )  ;
                }//fim for 
        }//fim main
/*
@date:06/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: String novaPalavra
@Copyright notice: Método que faz uma alteracão aleatória na palavra mudando uma letra por outra.
*/
        public static String alteracaoAleatoria (String s,char letraAntiga, char letraNova ){
                String novaPalavra="";
                for(int i=0;i<s.length();i++){
			if(s.charAt(i)==letraAntiga) novaPalavra += letraNova;
			else novaPalavra+= s.charAt(i);
                }//fim for      
                return novaPalavra;
        }//fim eh Palindromo
/*
@date:06/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s1 e String s2
@return: boolean 
@Copyright notice: Método que verifica se duas palavras sao iguais
*/
        public static boolean ehIgual(String s1, String s2){
                boolean ehIgual=true;
                if (s1.length() == s2.length()){
                        for(int i=0;i<s1.length();i++){
                                if(s1.charAt(i) != s2.charAt(i)){
                                        ehIgual=false;
                                        i=s1.length();
                                }//fim if
                        }//fim for      
                }//fim if
                else ehIgual=false;
                return ehIgual;
        }//fim ehIgual  
}//fim class    

