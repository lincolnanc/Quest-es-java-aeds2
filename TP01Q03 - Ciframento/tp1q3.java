/*
@date:05/02/2019
@author:Lincoln Antunes Nogueira Coutinho
@param:nenhum
@return:nenhum
@Copyright notice:main
*/
public class tp1q3{
        public static void main(String[] args){
                String[] entrada = new String[1000];
                int numEntrada=0;
                do{
                        entrada[numEntrada]= MyIO.readLine();
                }while(!ehIgual (entrada[numEntrada++],"FIM") ) ;
		numEntrada--;
               for(int i=0;i<numEntrada;i++){
                        MyIO.println(ciframentoCesar(entrada[i],3));
                }//fim for 
        }//fim main
/*
@date:05/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: String novaPalavra
@Copyright notice: Método que faz um ciframento de Cesar (criptografa a palavra em 3 letras)
*/
        public static String ciframentoCesar (String s,int var ){
                String novaPalavra="";
                for(int i=0;i<s.length();i++){
			novaPalavra +=(char) (((int)s.charAt(i)+var));
                }//fim for      
                return novaPalavra;
        }//fim eh Palindromo
/*
@date:05/02/2019
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

