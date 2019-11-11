/*
date:06/02/2019
@author:Lincoln Antunes Nogueira Coutinho
@param:nenhum
@return:nenhum
@Copyright notice:main
*/
public class tp1q6{
        public static void main(String[] args){
                String[] entrada = new String[1000];
                int numEntrada=0;
                do{
                        entrada[numEntrada]= MyIO.readLine();
                }while(!ehIgual (entrada[numEntrada++],"FIM") ) ;
		numEntrada--;
               for(int i=0;i<numEntrada;i++){
                        if (soVogais(entrada[i])) MyIO.print("SIM ");
			else MyIO.print("NAO ");
			if (soConsoantes(entrada[i])) MyIO.print("SIM ");
                        else MyIO.print("NAO ");
			if (ehInteiro(entrada[i])) MyIO.print("SIM ");
                        else MyIO.print("NAO ");
			if (ehReal(entrada[i]))MyIO.println("SIM");
                        else MyIO.println("NAO");
                }//fim for 
        }//fim main
/*
@date:06/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soVogais
@Copyright notice: Método que retorna um valor booleano indicando se uma palavra possui apenas vogais
*/
        public static boolean soVogais (String s){
		boolean soVogais=true;
		int i=0;
                while(i<s.length() && soVogais){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U') i++;
			else soVogais=false; 
                }//fim while    
                return soVogais;
        }//fim soVogais
/*
@date:06/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soConsoantes
@Copyright notice: Método que retorna um valor booleano indicando se uma palavra possui apenas consoantes
*/
	public static boolean soConsoantes(String s){
		boolean soConsoantes=true;
		for(int i=0;i<s.length();i++){
			if( ( ( (int) s.charAt(i) ) > 64 && ( (int) s.charAt(i) ) < 133 ) ||  ( ( (int) s.charAt(i) ) > 96 && ( (int) s.charAt(i) ) < 123 )  ){
				if(s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'a'||s.charAt(i) == 'A'){
					soConsoantes=false;
					i=s.length();
				}//fim if dentro
			}else{
				soConsoantes=false;
				i=s.length(); 
			}//fim else
		}//fim for
		return soConsoantes;
	}//fim soConsoantes

/*
@date:06/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soNumero
@Copyright notice: Método que retorna um valor booleano indicando se uma string é um numero inteiro
*/
	public static boolean ehInteiro(String s){
		boolean soNumero=true;
		for(int i=0;i<s.length();i++){
			if( ( (int) s.charAt(i) ) < 48 || ( ( (int) s.charAt(i) ) > 57) ){
				soNumero=false;
				i=s.length();
			}//fim if
		}//fim for
		return soNumero;
	}//fim ehInteiro
/*
@date:06/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soNumero
@Copyright notice: Método que retorna um valor booleano indicando se uma string é um numero real
*/
        public static boolean ehReal(String s){
                boolean soNumero=true;
		int contador=0;
                for(int i=0;i<s.length() && contador < 2;i++){
                        if( ( (int) s.charAt(i)  < 48 && s.charAt(i) != '.' && s.charAt(i) != ',' ) || (int) s.charAt(i)  > 57 ) {
                                soNumero=false;
                                i=s.length();
                        }//fim if
			else if (s.charAt(i) == '.' || s.charAt(i) == ',') contador++;
                }//fim for
                return soNumero && contador < 2;
        }//fim ehInteiro




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
