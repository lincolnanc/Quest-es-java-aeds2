public class Tp1q5{
	public static int[] leNumeros(int n){
		int [] var = new int[n];
		for( int i=0;i<n;i++){
			var[i]=MyIO.readInt();
		}//fim for
		return var;	
	}//fim leNumeros()
	public static void main(String[] args){
		int n=MyIO.readInt();
		int [] var;
		int resp;
		String s;
		while(n!=0){
			var= leNumeros(n);
			s= MyIO.readLine();
			char [] c= transformaStringChar(s);
			MyIO.println(algebraBooleana(c,var)); 
			n=MyIO.readInt();
		}//fim while	
	}//fim main
	public static char[] transformaStringChar(String s){
		char [] c= new char[1000];
		for(int i=0;i<s.length();i++){
			c[i]=s.charAt(i);
		}//fim for
		return c;
	}//fim transformaStringChar
	public static int algebraBooleana(char[] s, int[] var){
		leLetras(s,var);
		return leParenteses(s);
	}//fim algebraBooleana()	
	public static int leParenteses(char[] s){
		int i=s.length-1;
		char resp;
		int j=0;
		while(i>0){

			if(s[i]=='('){
				s[i]='.';
				switch(s[i-1]){
					case 'r':resp='0';
						 for(j = i+1;s[j]!=')'; j++){
							  if (s[j]=='1') resp='1';
							  s[j]='.';
						 }//fim for
				       		 s[j]='.';		 
						 s[i-2]=resp;
					break;
	      				case 'd':resp='1';
                                                 for(j = i+1;s[j]!=')'; j++){
                                                          if (s[j]=='0') resp='0';
                                                          s[j]='.';
                                                 }//fim for
					  	 s[j]='.';	 
                                                 s[i-3]=resp;
                                        break;
					case 't':resp='0';
						 for(j= i+1;s[j]!=')';j++){
							 if (s[j]=='0') resp='1';
							 else if(s[j]=='1') resp='0';
							 s[j]='.';
						 }//fim for
						 s[j]='.';
						 s[i-3]=resp;
				}//fim switch
			}//fim if				
			i--;
		}//fim while
		return ((int)s[0] - 48);
	}//fim leParenteses()
	public static void leLetras(char [] s,int[] var){
		for(int i=0;i<s.length;i++){
			if (s[i]=='A')s[i] = (char)(var[0] + 48);	
			else if (s[i]=='B') s[i]=(char)(var[1] + 48);
		             else if(s[i]=='C') s[i]=(char)(var[2] + 48);
		}//fim for
	}//fim leLetras()
}//fim class	
		
