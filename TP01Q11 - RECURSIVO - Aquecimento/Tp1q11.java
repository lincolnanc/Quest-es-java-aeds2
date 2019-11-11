class Tp1q11 {
	public static void main (String[] args){
		String[] entrada = new String[1000];
		String linha;
		int numEntrada = 0;

		//Leitura da entrada padrao
		do {
			entrada[numEntrada] = MyIO.readLine();
		} while (!ehIgual (entrada[numEntrada++],"FIM") );
		numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM

		//Para cada linha de entrada, gerando uma de saida contendo o numero de letras maiusculas da entrada
		for(int i = 0; i < numEntrada; i++){
			MyIO.println(quantLetrasMaiusculas(entrada[i]));
		}
	}
	public static int quantLetrasMaiusculas(String s){
		return quantLetrasMaiusculas(s,0);
	}//fim public quantLetrasMaiusculas

	private static int quantLetrasMaiusculas(String s, int pos){
		int quant=0;
		if(pos<s.length()){
			if (ehMaiuscula( s.charAt(pos) )) quant = 1;
		        quant += quantLetrasMaiusculas(s,pos+1);	
		}//fim if
		return quant;
	}//fim private quantLetrasMaiusculas

	public static boolean ehMaiuscula(char c){
		return(c >='A' && c <='Z');
	}//fim ehMaiucula	

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
}
