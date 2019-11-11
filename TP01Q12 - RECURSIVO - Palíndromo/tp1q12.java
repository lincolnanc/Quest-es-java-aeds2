/*
@date:12/02/2019
@author:Lincoln Antunes Nogueira Coutinho
@param:nenhum
@return:nenhum
@Copyright notice:main
*/
public class tp1q12{
	public static void main(String[] args){
		String[] entrada = new String[1000];
		int numEntrada=0;
		do{
			entrada[numEntrada]= MyIO.readLine();		
		}while(!ehIgual (entrada[numEntrada++],"FIM") ) ;
		numEntrada--;
		for(int i=0;i<numEntrada;i++){
			if (ehPalindromo(entrada[i])) MyIO.println("SIM");
			else MyIO.println("NAO");
		}//fim for 
	}//fim main
/*
@date:12/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: String s
@return: boolean 
@Copyright notice: Método que verifica se uma string é um palíndromo
*/
	public static boolean ehPalindromo(String s){
		return ehPalindromo(s,0);
	}//fim public ehPalindromo

	private static boolean ehPalindromo(String s,int i){
		boolean ehPalindromo=true;
		if(i<s.length()){
			if (s.charAt(i)!= s.charAt(s.length()-(i+1))){
				ehPalindromo=false;
			}//fim if
			else ehPalindromo=ehPalindromo(s,i+1);
		}//fim if
		return ehPalindromo;	
	}//fim private ehPalindromo
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
