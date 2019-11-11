/*
date:12/02/2019
@author:Lincoln Antunes Nogueira Coutinho
@param:nenhum
@return:nenhum
@Copyright notice:main
*/
public class Tp1q16{
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
@date:12/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soVogais
@Copyright notice: Método que retorna um valor booleano indicando se uma palavra possui apenas vogais
*/
	public static boolean soVogais(String s){
                return soVogais(s,0);
        }//fim public soVogais

        private static boolean soVogais (String s,int i){
		boolean soVogais=true;
                if(i<s.length()){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U') soVogais=soVogais(s,++i);
			else soVogais=false; 
                }//fim if   
                return soVogais;
        }//fim private soVogais
/*
@date:12/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soConsoantes
@Copyright notice: Método que retorna um valor booleano indicando se uma palavra possui apenas consoantes
*/
	public static boolean soConsoantes(String s){
		return soConsoantes(s,0);
	}//fim public soConsoantes	
	private static boolean soConsoantes(String s,int i){
		boolean soConsoantes=true;
		if(i<s.length()){
			if( ( ( ( (int) s.charAt(i) ) > 64 && ( (int) s.charAt(i) ) < 91 ) && s.charAt(i)!='A' && s.charAt(i)!='E'&& s.charAt(i)!='I'&& s.charAt(i)!='O'&& s.charAt(i)!='U'  ) ||  ( ( ( (int) s.charAt(i) ) > 96 && ( (int) s.charAt(i) ) < 123 ) && s.charAt(i) != 'e' && s.charAt(i) != 'i'&&s.charAt(i) != 'o'&&s.charAt(i) != 'u' && s.charAt(i) != 'a')){
					soConsoantes=soConsoantes(s,++i);
			}
			else{
				soConsoantes=false; 
			}//fim else
		}//fim if
		return soConsoantes;
	}//fim private soConsoantes

/*
@date:12/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soNumero
@Copyright notice: Método que retorna um valor booleano indicando se uma string é um numero inteiro
*/
	public static boolean ehInteiro(String s){
		return ehInteiro(s,0);
	}//fim public ehInteiro()	
	private static boolean ehInteiro(String s,int i){
		boolean soNumero=true;
		if(i<s.length()){
			if( ( (int) s.charAt(i) ) >= 48 && ( ( (int) s.charAt(i) ) <= 57) ){
				soNumero=ehInteiro(s,++i);	
			}//fim if
			else soNumero=false;
		}//fim if
		return soNumero;
	}//fim private ehInteiro
/*
@date:12/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean soNumero
@Copyright notice: Método que retorna um valor booleano indicando se uma string é um numero real
*/
	public static boolean ehReal(String s){
		return ehReal(s,0,0);
	}//fim ehReal	
        private static boolean ehReal(String s,int i,int contador){
                boolean soNumero=true;
                if(i<s.length()){
			if(contador<2){
                        	if( ( (int) s.charAt(i)  >= 48 && (int) s.charAt(i)  <= 57 ) ) {
                                	soNumero=ehReal(s,++i,contador);
                        	}//fim if
				else if (s.charAt(i) == '.' || s.charAt(i) == ',') soNumero=ehReal(s,++i,++contador);
			             else soNumero=false;
			}//fim if
			else soNumero=false;	
                }//fim if
                return soNumero;
        }//fim private ehReal

/*
@date:12/02/2019
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
